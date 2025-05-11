package Strategy;

// DeliveryContext.java

import Command.Order;
import Strategy.DeliveryStrategy;
import Strategy.Route;

import java.time.Duration;

/**
 * Context that applies a DeliveryStrategy to an Order.
 */
public class DeliveryContext {
    protected DeliveryStrategy strategy;

    /**
     * Selects which strategy to use.
     * @param strategy concrete DeliveryStrategy
     */
    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Executes the full delivery workflow.
     * @param order the Order to deliver
     */
    public void executeDelivery(Order order) {
        if (strategy == null) {
            throw new IllegalStateException("Delivery strategy not set.");
        }
        Route route = strategy.planRoute(order.getPickup(), order.getDropOff());
        Duration eta = strategy.estimateTime(route);
        float cost   = strategy.calculateCost(route);
        System.out.printf("Route from %s to %s — ETA: %s, Cost: %.2f%n",
                route.getFrom(), route.getTo(), eta, cost);
        strategy.deliver(order);
    }
}
