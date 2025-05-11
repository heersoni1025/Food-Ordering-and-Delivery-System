package State;

// DeliveredState.java

import Command.Order;

/**
 * State when the order has been delivered.
 */
public class DeliveredState implements OrderState {

    @Override
    public void next(Order order) {
        // terminal state; no further transitions
        System.out.println("Order " + order.getId() + " is already delivered.");
    }

    @Override
    public String getStateName() {
        return "Delivered";
    }
}
