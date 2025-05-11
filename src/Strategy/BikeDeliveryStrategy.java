package Strategy;

// BikeDeliveryStrategy.java

import Command.Order;

import java.time.Duration;

/**
 * Concrete strategy for delivering orders by bike.
 */
public class BikeDeliveryStrategy implements DeliveryStrategy {

    @Override
    public Route planRoute(String pickup, String dropOff) {
        return new Route(pickup, dropOff);
    }

    @Override
    public Duration estimateTime(Route route) {
        // assume a 25-minute bike ride
        return Duration.ofMinutes(25);
    }

    @Override
    public float calculateCost(Route route) {
        // bike delivery is cheaper
        return 2.50f;
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order " + order.getId() + " delivered by bike.");
    }
}
