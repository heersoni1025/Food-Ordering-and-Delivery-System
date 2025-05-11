package Decorator;

public class Sausage extends PizzaDecorator {
    /**
     * Wraps the Pizza in a Sausage object
     * @param wrappedPizza Pizza to add sausage topping to
     */
    public Sausage(Pizza wrappedPizza) {
        super(wrappedPizza);
    }
    
    /**
     * Adds Sausage to pizza description
     * @return Description
     */
    @Override
    public String getDescription() {
        return getWrappedPizza().getDescription() + " Sausage";
    }
    
    /**
     * Gives cost of the Pizza with the Sausage up charge
     * @return Cost
     */
    @Override
    public double getCost() {
        return getWrappedPizza().getCost() + 0.50;
    }
}
