package Decorator;

public class ExtraCheese extends PizzaDecorator {
    /**
     * Wraps the Pizza in an Extra Cheese object
     * @param wrappedPizza pizza to add extra cheese topping to
     */
    public ExtraCheese(Pizza wrappedPizza) {
        super(wrappedPizza);
    }
    
    /**
     * Adds Extra Cheese to pizza description
     * @return Description
     */
    @Override
    public String getDescription() {
        return getWrappedPizza().getDescription() + " Extra Cheese";
    }
    
    /**
     * Gives cost of the Pizza with the Extra Cheese up charge
     * @return Cost
     */
    @Override
    public double getCost() {
        return getWrappedPizza().getCost() + 1.0;
    }
}
