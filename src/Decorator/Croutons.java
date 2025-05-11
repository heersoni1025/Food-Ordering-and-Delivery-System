package Decorator;

public class Croutons extends SaladDecorator {
    /**
     * Wraps the Salad in a Croutons object
     * @param wrappedSalad salad to add croutons topping to
     */
    public Croutons(Salad wrappedSalad) {
        super(wrappedSalad);
    }

    /**
     * Adds Croutons to salad description
     * @return Description
     */
    @Override
    public String getDescription() {
        return getWrappedSalad().getDescription() + " Croutons";
    }
    
    /**
     * Gives cost of the Salad with the Croutons up charge
     * @return Cost
     */
    @Override
    public double getCost() {
        return getWrappedSalad().getCost() + 0.20;
    }
    
}
