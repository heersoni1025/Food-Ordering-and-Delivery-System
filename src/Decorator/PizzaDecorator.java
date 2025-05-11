package Decorator;

public abstract class PizzaDecorator extends Pizza {
    private final Pizza wrappedPizza; // Pizza instance to wrap

    /**
     * Sets the wrappedPizza instance variable
     * @param wrappedPizza Pizza to wrap with this
     */
    public PizzaDecorator(Pizza wrappedPizza) {
        this.wrappedPizza = wrappedPizza;
    }
    
    /**
     * Returns the wrappedPizza
     * @return wrappedPizza
     */
    public Pizza getWrappedPizza() {
        return wrappedPizza;
    }
}
