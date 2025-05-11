package Factory;

// Factory class responsible for creating Food objects
public class FoodFactory {

    // Static method to create Food based on the provided type
    public static Food createFood(String type) {
        // Use switch expression to return the correct Food object
        return switch (type.toLowerCase()) {
            case "pizza" -> new Pizza(); // Return a Pizza object
            case "salad" -> new Salad(); // Return a Salad object
            case "drink" -> new Drink(); // Return a Drink object
            default -> throw new IllegalArgumentException("Unknown food type: " + type); // Handle invalid input
        };
    }
}