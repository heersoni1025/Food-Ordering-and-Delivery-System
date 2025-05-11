package Strategy;

// DeliveryStrategy.java

import Command.Order;

import java.time.Duration;

/**
 * Strategy interface defining different delivery mechanisms.
 */
public interface DeliveryStrategy {

    /**
     * Plans a delivery route from pickup to drop-off.
     * @param pickup  origin location
     * @param dropOff destination location
     * @return a Route object encapsulating from/to
     */
    Route planRoute(String pickup, String dropOff);

    /**
     * Estimates how long the delivery will take.
     * @param route the planned delivery route
     * @return a Duration estimate
     */
    Duration estimateTime(Route route);

    /**
     * Calculates the cost of the delivery.
     * @param route the planned delivery route
     * @return cost in currency units
     */
    float calculateCost(Route route);

    /**
     * Executes the delivery action for the given order.
     * @param order the Order to deliver
     */
    void deliver(Order order);
}
