package Decorator;

public class Pepperoni extends PizzaDecorator {
    /**
     * Wraps the Pizza in a Pepperoni object
     * @param wrappedPizza Pizza to add pepperoni topping to
     */
    public Pepperoni(Pizza wrappedPizza) {
        super(wrappedPizza);
    }
    
    /**
     * Adds Pepperoni to pizza description
     * @return Description
     */
    @Override
    public String getDescription() {
        return getWrappedPizza().getDescription() + " Pepperoni";
    }
    
    /**
     * Gives cost of the Pizza with the Pepperoni up charge
     * @return Cost
     */
    public double getCost() {
        return getWrappedPizza().getCost() + 0.65;
    }
}
