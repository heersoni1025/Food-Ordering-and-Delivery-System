package State;

// PickingUpState.java

import Command.Order;

/**
 * State when the delivery person is picking up the order.
 */
public class PickingUpState implements OrderState {

    @Override
    public void next(Order order) {
        order.setState(new EnRouteState());
    }

    @Override
    public String getStateName() {
        return "Picking Up";
    }
}

