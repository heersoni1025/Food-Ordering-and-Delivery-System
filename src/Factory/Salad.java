package Factory;

// Concrete implementation of Food representing a Salad
public class Salad implements Food {
    @Override
    public String getDescription() { //returns description for salad
        return "Salad";
    }

    @Override
    public double getCost() {  //returns salad cost
        return 5.0;
    }
}