package Decorator;

import Factory.Drink;

public class Water extends Drink {
    /**
     * Adds Water to drink description
     * @return Description
     */
    @Override
    public String getDescription() {
        return "Water";
    }
    
    /**
     * Gives 0 cost for Water
     * @return Cost
     */
    @Override
    public double getCost() {
        return 0.0;
    }
}
