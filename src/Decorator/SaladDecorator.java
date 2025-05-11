package Decorator;

public class SaladDecorator extends Salad {
    private final Salad wrappedSalad; // Salad instance to wrap
    
    /**
     * Sets the wrappedSalad instance variable
     * @param wrappedSalad Salad to wrap with this
     */
    public SaladDecorator(Salad wrappedSalad) {
        this.wrappedSalad = wrappedSalad;
    }

    /**
     * Returns the wrappedSalad
     * @return wrappedSalad
     */
    public Salad getWrappedSalad() {
        return wrappedSalad;
    }
}
