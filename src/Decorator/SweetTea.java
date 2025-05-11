package Decorator;

import Factory.Drink;

public class SweetTea extends Drink {
    /**
     * Adds Sweet Tea to drink description
     * @return Description
     */
    @Override
    public String getDescription() {
        return "Sweet Tea";
    }
    
    /**
     * Gives cost of the Sweet Tea
     * @return Cost
     */
    @Override
    public double getCost() {
        return super.getCost() + 1.50;
    }
}
