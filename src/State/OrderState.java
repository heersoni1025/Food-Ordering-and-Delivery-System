package State;

// OrderState.java

import Command.Order;

/**
 * State interface for order status.
 */
public interface OrderState {

    /**
     * Advance the order to its next status.
     * @param order context whose state will change
     */
    void next(Order order);

    /**
     * @return human-readable name of this status
     */
    String getStateName();
}
