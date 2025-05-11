package Decorator;

import Factory.Food;

// Abstract implementation of Food representing a Pizza
public abstract class Pizza implements Food {
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