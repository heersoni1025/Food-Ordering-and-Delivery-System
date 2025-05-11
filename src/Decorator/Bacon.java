package Decorator;

public class Bacon extends PizzaDecorator {
    /**
     * Wraps the Pizza in a bacon object
     * @param wrappedPizza pizza to add bacon topping to
     */
    public Bacon(Pizza wrappedPizza) {
        super(wrappedPizza);
    }

    /**
     * Adds Bacon to pizza description
     * @return Entire pizza description
     */
    @Override
    public String getDescription() {
        return getWrappedPizza().getDescription() + " Bacon";
    }

    /**
     * Gives cost of the Pizza with the Bacon up charge
     * @return Cost 
     */
    @Override
    public double getCost() {
        return getWrappedPizza().getCost() + 0.70;
    }
}
