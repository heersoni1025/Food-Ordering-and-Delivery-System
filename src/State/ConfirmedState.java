package State;

// ConfirmedState.java

import Command.Order;

/**
 * State when an order has just been confirmed.
 */
public class ConfirmedState implements OrderState {

    @Override
    public void next(Order order) {
        order.setState(new PickingUpState());
    }

    @Override
    public String getStateName() {
        return "Confirmed";
    }
}
