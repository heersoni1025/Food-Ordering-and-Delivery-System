package Strategy;

// Route.java

/**
 * Represents a delivery route with a source and destination.
 */
public class Route {
    private String from;
    private String to;

    /**
     * Constructs a Route.
     * @param from origin location
     * @param to   destination location
     */
    public Route(String from, String to) {
        this.from = from;
        this.to   = to;
    }

    public String getFrom() { return from; }
    public void setFrom(String from) { this.from = from; }

    public String getTo() { return to; }
    public void setTo(String to) { this.to = to; }
}
