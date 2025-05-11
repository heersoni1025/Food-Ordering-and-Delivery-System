package Decorator;

import Factory.Drink;

public class LargeSize extends DrinkDecorator {
    /**
     * Wraps the Drink in a Large Size object
     * @param wrappedDrink Drink to set size to Large
     */
    public LargeSize(Drink wrappedDrink) {
        super(wrappedDrink);
    }

    /**
     * Adds Large to drink description
     * @return Description
     */
    @Override
    public String getDescription() {
        return getWrappedDrink().getDescription() + " Large";
    }
    
    /**
     * Gives cost of the Drink with the Large Size up charge
     * @return Cost
     */
    @Override
    public double getCost() {
        return getWrappedDrink().getCost() + 0.75;
    }
}
