package State;

// EnRouteState.java

import Command.Order;

/**
 * State when the order is en route to the customer.
 */
public class EnRouteState implements OrderState {

    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public String getStateName() {
        return "En-Route";
    }
}

