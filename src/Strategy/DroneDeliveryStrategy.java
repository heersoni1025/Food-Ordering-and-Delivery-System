package Strategy;

// DroneDeliveryStrategy.java

import Command.Order;

import java.time.Duration;

/**
 * Concrete strategy for delivering orders by drone.
 */
public class DroneDeliveryStrategy implements DeliveryStrategy {

    @Override
    public Route planRoute(String pickup, String dropOff) {
        return new Route(pickup, dropOff);
    }

    @Override
    public Duration estimateTime(Route route) {
        // assume an average drone flight of 15 minutes
        return Duration.ofMinutes(15);
    }

    @Override
    public float calculateCost(Route route) {
        // flat drone fee
        return 5.00f;
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order " + order.getId() + " delivered by drone.");
    }
}
