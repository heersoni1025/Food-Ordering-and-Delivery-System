package Command;// Order.java  (modified)

import Factory.Food;
import State.ConfirmedState;
import State.OrderState;

import java.util.List;

/**
 * Represents a food order with items, delivery info, and status.
 */
public class Order {
    private String id;
    private List<Food> items;
    private String pickup;
    private String dropOff;
    private OrderState state;

    /**
     * Constructs a new Order in the Confirmed state.
     * @param id      unique identifier
     * @param items   list of Food items
     * @param pickup  origin location
     * @param dropOff destination location
     */
    public Order(String id, List<Food> items, String pickup, String dropOff) {
        this.id      = id;
        this.items   = items;
        this.pickup  = pickup;
        this.dropOff = dropOff;
        this.state   = new ConfirmedState();
    }

    public String getId()               { return id; }
    public List<Food> getItems()        { return items; }
    public String getPickup()           { return pickup; }
    public void setPickup(String p)     { this.pickup = p; }
    public String getDropOff()          { return dropOff; }
    public void setDropOff(String d)    { this.dropOff = d; }

    public OrderState getState()        { return state; }
    public void setState(OrderState s)  { this.state = s; }

    /**
     * Advance to the next status (e.g., Confirmed → PickingUp → En-Route → Delivered).
     */
    public void nextState() {
        state.next(this);
    }

    /**
     * @return current status name
     */
    public String getStatus() {
        return state.getStateName();
    }
}
