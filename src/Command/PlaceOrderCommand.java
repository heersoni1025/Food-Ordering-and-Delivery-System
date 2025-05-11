package Command;

/**
 * Concrete command to place a new order.
 */
public class PlaceOrderCommand implements Command {
    private OrderManager orderManager;
    private Order order;

    public PlaceOrderCommand(OrderManager orderManager, Order order) {
        this.orderManager = orderManager;
        this.order = order;
    }

    @Override
    public void execute() {
        orderManager.placeOrder(order);
    }

    @Override
    public void undo() {
        orderManager.cancelOrder(order.getId());
    }
}
