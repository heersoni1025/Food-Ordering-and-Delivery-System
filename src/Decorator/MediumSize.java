package Decorator;

import Factory.Drink;

public class MediumSize extends DrinkDecorator {
    /**
     * Wraps the Drink in a Medium Size object
     * @param wrappedDrink Drink to set size to Medium
     */
    public MediumSize(Drink wrappedDrink) {
        super(wrappedDrink);
    }
    
    /**
     * Adds Medium to drink description
     * @return Description
     */
    @Override
    public String getDescription() {
        return getWrappedDrink().getDescription() + " Medium";
    }
    
    /**
     * Gives cost of the Drink with the Medium Size up charge
     * @return Cost
     */
    @Override
    public double getCost() {
        return getWrappedDrink().getCost() + 0.45;
    }
}
