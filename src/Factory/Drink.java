package Factory;

import Factory.Food;

// Concrete implementation of Food representing a Drink
public class Drink implements Food {
    @Override
    public String getDescription() { //returns description of drink
        return "Drink";
    }

    @Override
    public double getCost() {  //returns cost of drink
        return 2.0;
    }
}