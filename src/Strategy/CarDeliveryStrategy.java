package Strategy;

// CarDeliveryStrategy.java

import Command.Order;

import java.time.Duration;

/**
 * Concrete strategy for delivering orders by car.
 */
public class CarDeliveryStrategy implements DeliveryStrategy {

    @Override
    public Route planRoute(String pickup, String dropOff) {
        return new Route(pickup, dropOff);
    }

    @Override
    public Duration estimateTime(Route route) {
        // assume a 10-minute car drive
        return Duration.ofMinutes(10);
    }

    @Override
    public float calculateCost(Route route) {
        // moderate car fee
        return 3.75f;
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order " + order.getId() + " delivered by car.");
    }
}
