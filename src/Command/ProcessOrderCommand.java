package Command;

import Factory.Food;
import Strategy.DeliveryStrategy;

import javax.swing.*;
import java.util.List;

/**
 * Composite Command that runs:
 *   1) PlaceOrderCommand
 *   2) deliveryContext.executeDelivery(...)
 *   3) advances through all states
 */
public class ProcessOrderCommand implements Command {
    private final OrderManager manager;
    private final Order order;
    private final DeliveryContextGUI deliveryCtx;
    private final DeliveryStrategy strategy;
    private final JTextArea out;

    /**
     * @param manager     same OrderManager you already use
     * @param order       the Order (with items) to process
     * @param deliveryCtx a DeliveryContextGUI tied to your JTextArea
     * @param strategy    chosen DeliveryStrategy
     * @param out         the JTextArea to log into
     */
    public ProcessOrderCommand(OrderManager manager,
                               Order order,
                               DeliveryContextGUI deliveryCtx,
                               DeliveryStrategy strategy,
                               JTextArea out) {
        this.manager     = manager;
        this.order       = order;
        this.deliveryCtx = deliveryCtx;
        this.strategy    = strategy;
        this.out         = out;
    }

    @Override
    public void execute() {
        // 1) place order
        manager.placeOrder(order);
        out.append("Order placed: " + order.getId() + "\n");

        // 2) list decorated items
        for (Food f : order.getItems()) {
            out.append(String.format("• Item: %s  ($%.2f)%n",
                    f.getDescription(), f.getCost()));
        }

        // 3) strategy + delivery
        deliveryCtx.setStrategy(strategy);
        deliveryCtx.executeDelivery(order);

        // 4) advance through states
        while (!order.getStatus().equals("Delivered")) {
            order.nextState();
            out.append("Status → " + order.getStatus() + "\n");
        }
        out.append("=== Flow Complete ===\n\n");
    }

    @Override
    public void undo() {
        // roll back entire thing
        manager.cancelOrder(order.getId());
        out.append("Undo → Order cancelled: " + order.getId() + "\n\n");
    }
}

