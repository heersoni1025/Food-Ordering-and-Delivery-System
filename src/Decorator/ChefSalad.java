package Decorator;

public class ChefSalad extends Salad {
    /**
     * Adds Chef to salad description
     * @return Description
     */
    @Override
    public String getDescription() {
        return "Chef " + super.getDescription();
    }
    
    /**
     * Gives cost of the Chef Salad
     * @return Cost
     */
    @Override
    public double getCost() {
        return super.getCost() + 3.0;
    }
}
