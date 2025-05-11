package Decorator;

public class FlatCrustPizza extends Pizza {
    /**
     * Adds Flat Crust to pizza description
     * @return Description
     */    
    @Override
    public String getDescription() {
        return "Flat Crust " + super.getDescription();
    }
    
    /**
     * Gives cost of the Flat Crust Pizza
     * @return Cost
     */
    @Override
    public double getCost() {
        return 2.0 + super.getCost();
    }
    
}
