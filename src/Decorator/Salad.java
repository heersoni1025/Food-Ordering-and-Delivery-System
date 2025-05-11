package Decorator;

import Factory.Food;

// Abstract implementation of Food representing a Salad
public abstract class Salad implements Food {
    @Override
    public String getDescription() { //returns description for salad
        return "Salad";
    }

    @Override
    public double getCost() {  //returns salad cost
        return 5.0;
    }
}