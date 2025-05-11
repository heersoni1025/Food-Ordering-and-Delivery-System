package Decorator;

import Factory.Drink;

public class NoIce extends DrinkDecorator {
    /**
     * Wraps the Drink in a No Ice object
     * @param wrappedDrink Drink to give No Ice Modifier to
     */
    public NoIce(Drink wrappedDrink) {
        super(wrappedDrink);
    }
    
    /**
     * Adds No Ice to drink description
     * @return Description
     */
    @Override
    public String getDescription() {
        return getWrappedDrink().getDescription() + " No Ice";
    }
    
    /**
     * Gives cost of the Drink no up charge
     * @return Cost
     */ 
    @Override
    public double getCost() {
        return getWrappedDrink().getCost();
    }
}
