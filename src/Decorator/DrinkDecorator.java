package Decorator;

import Factory.Drink;

public abstract class DrinkDecorator extends Drink {
    private final Drink wrappedDrink; // Drink instance to wrap

    /**
     * Sets the wrappedDrink instance variable
     * @param wrappedDrink Drink to wrap with this
     */
    public DrinkDecorator(Drink wrappedDrink) {
        this.wrappedDrink = wrappedDrink;
    }

    /**
     * Returns the wrappedDrink
     * @return wrappedDrink
     */
    public Drink getWrappedDrink() {
        return wrappedDrink;
    }
}
