package Decorator;

public class ExtraSauce extends PizzaDecorator {
    /**
     * Wraps the Pizza in an Extra Sauce object
     * @param wrappedPizza pizza to add extra sauce topping to
     */
    public ExtraSauce(Pizza wrappedPizza) {
        super(wrappedPizza);
    }
    
    /**
     * Adds Extra Sauce to pizza description
     * @return Description
     */
    @Override
    public String getDescription() {
        return getWrappedPizza().getDescription() + " Extra Sauce";
    }

    /**
     * Gives cost of the Pizza with the Extra Sauce up charge
     * @return Cost
     */
    @Override
    public double getCost() {
        return getWrappedPizza().getCost() + .90;
    }
}
