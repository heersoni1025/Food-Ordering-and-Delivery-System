package Factory;

// Concrete implementation of Food representing a Pizza
public class Pizza implements Food {
    // Returns the description of the pizza
    @Override
    public String getDescription() {
        return "Pizza";
    }

    // Returns the cost of the pizza
    @Override
    public double getCost() {
        return 8.0;
    }
}