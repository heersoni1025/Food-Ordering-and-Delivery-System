package Decorator;

public class HandTossedPizza extends Pizza {
    /**
     * Adds Hand Tossed to pizza description
     * @return Description
     */
    @Override
    public String getDescription() {
        return "Hand Tossed " + super.getDescription();
    }
    
    /**
     * Gives cost of the Hand Tossed Pizza
     * @return Cost
     */
    @Override
    public double getCost() {
        return 2.75 + super.getCost();
    }
}
