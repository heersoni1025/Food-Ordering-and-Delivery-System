package Decorator;

public class Tomatoes extends SaladDecorator {
    /**
     * Wraps the Salad in a Tomatoes object
     * @param wrappedSalad Salad to add tomatoes topping to
     */
    public Tomatoes(Salad wrappedSalad) {
        super(wrappedSalad);
    }
    
    /**
     * Adds Tomatoes to salad description
     * @return Description
     */
    @Override
    public String getDescription() {
        return getWrappedSalad().getDescription() + " Tomatoes";
    }
    
    /**
     * Gives cost of the Salad with the Tomatoes up charge
     * @return Cost
     */
    @Override
    public double getCost() {
        return getWrappedSalad().getCost() + 0.40;
    }
}
