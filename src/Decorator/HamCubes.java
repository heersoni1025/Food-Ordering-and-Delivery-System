package Decorator;

public class HamCubes extends SaladDecorator {
    /**
     * Wraps the Salad in a Ham Cubes object
     * @param wrappedSalad Salad to add Ham Cubes topping to
     */
    public HamCubes(Salad wrappedSalad) {
        super(wrappedSalad);
    }
    
    /**
     * Adds Ham to salad description
     * @return Description
     */
    @Override
    public String getDescription() {
        return getWrappedSalad().getDescription() + " Ham";
    }

    /**
     * Gives cost of the Salad with the Ham Cubes up charge
     * @return Cost
     */
    @Override
    public double getCost() {
        return getWrappedSalad().getCost() + 0.75;
    }
}
