package Decorator;

public class GardenSalad extends Salad {
    /**
     * Adds Garden to salad description
     * @return Description
     */
    @Override
    public String getDescription() {
        return "Garden " + super.getDescription();
    }
    /**
     * Gives cost of the Garden Salad
     * @return Cost
     */
    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }
}
