package Decorator;

import Factory.Drink;

public class SmallSize extends DrinkDecorator {
    /**
     * Wraps the Drink in a Small Size object
     * @param wrappedDrink Drink to set size to small
     */    public SmallSize(Drink wrappedDrink) {
        super(wrappedDrink);
    }
    
    /**
     * Adds Small to drink description
     * @return Description
     */
    @Override
    public String getDescription() {
        return getWrappedDrink().getDescription() + " Small";
    }
    
    /**
     * Gives cost of the Drink with no up charge
     * @return Cost
     */
    @Override
    public double getCost() {
        return getWrappedDrink().getCost();
    }
}
