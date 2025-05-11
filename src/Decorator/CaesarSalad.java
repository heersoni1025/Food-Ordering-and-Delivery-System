package Decorator;

public class CaesarSalad extends Salad {
    /**
     * Adds Caesar to salad description
     * @return Description
     */    
    @Override
    public String getDescription() {
        return "Caesar " + super.getDescription();
    }
    
    /**
     * Gives cost of the Caesar Salad
     * @return Cost
     */
    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
