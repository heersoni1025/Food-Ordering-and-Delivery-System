package Decorator;

public class StuffedCrustPizza extends Pizza {
    /**
     * Adds Stuffed Crust to pizza description
     * @return Description
     */
    @Override
    public String getDescription() {
        return "Stuffed Crust " + super.getDescription();
    }
    
    /**
     * Gives cost of the Stuffed Crust Pizza
     * @return Cost
     */
    @Override
    public double getCost() {
        return 4.0 + super.getCost();
    }
}
