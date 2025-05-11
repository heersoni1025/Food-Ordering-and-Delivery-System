package Command;

/**
 * Concrete command to reorder a past order.
 */
public class ReorderCommand implements Command {
    private OrderManager orderManager;
    private Order order;

    public ReorderCommand(OrderManager orderManager, Order order) {
        this.orderManager = orderManager;
        this.order = order;
    }

    @Override
    public void execute() {
        orderManager.reorder(order.getId());
    }

    @Override
    public void undo() {
        orderManager.cancelOrder(order.getId());
    }
}
