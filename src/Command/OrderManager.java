package Command;

/**
 * The Receiver class that performs the actual business logic.
 */
public class OrderManager {
    public void placeOrder(Order order) {
        System.out.println("Order Placed: " + order.getId());
    }

    public void cancelOrder(String orderId) {
        System.out.println("Order Cancelled: " + orderId);
    }

    public void reorder(String orderId) {
        System.out.println("Order Reordered: " + orderId);
    }
}
