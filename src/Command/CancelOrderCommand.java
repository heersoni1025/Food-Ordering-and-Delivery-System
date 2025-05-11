package Command;

/**
 * Concrete command to cancel an existing order.
 */
public class CancelOrderCommand implements Command {
    private OrderManager orderManager;
    private String orderId;

    public CancelOrderCommand(OrderManager orderManager, String orderId) {
        this.orderManager = orderManager;
        this.orderId = orderId;
    }

    @Override
    public void execute() {
        orderManager.cancelOrder(orderId);
    }

    @Override
    public void undo() {
        orderManager.reorder(orderId);
    }
}
