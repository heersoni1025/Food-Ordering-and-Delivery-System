package Command;

import Strategy.DeliveryContext;
import Strategy.Route;

import javax.swing.*;
import java.time.Duration;

/**
 * A DeliveryContext that writes its log into a JTextArea.
 */
public class DeliveryContextGUI extends DeliveryContext {
    private final JTextArea out;

    /**
     * @param out JTextArea to append messages to
     */
    public DeliveryContextGUI(JTextArea out) {
        this.out = out;
    }

    @Override
    public void executeDelivery(Order order) {
        if (strategy == null) {
            throw new IllegalStateException("Delivery strategy not set.");
        }

        // 1) plan
        Route route = strategy.planRoute(order.getPickup(), order.getDropOff());
        out.append(String.format("→ Route: %s → %s%n", route.getFrom(), route.getTo()));

        // 2) ETA
        Duration eta = strategy.estimateTime(route);
        out.append(String.format("→ ETA: %s%n", eta));

        // 3) Cost
        float cost = strategy.calculateCost(route);
        out.append(String.format("→ Cost: $%.2f%n", cost));

        // 4) Deliver
        strategy.deliver(order);
        out.append("→ Delivered by " + strategy.getClass().getSimpleName() + "\n");
    }
}
