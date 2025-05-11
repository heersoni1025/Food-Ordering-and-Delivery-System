package Decorator;

import Factory.Drink;
import Factory.Food;

// Factory class responsible for creating Food objects
public class FoodFactory {

    // Static method to create Food based on the provided type
    public static Food createFood(String type) {
        String[] order = type.split(" ");
        // Use switch expression to return the correct Food object
        Food food = switch (order[0].toLowerCase()) {
            case "pizza" -> switch (order[1].toLowerCase()) {// Make a Pizza object
                case "flat" -> new FlatCrustPizza();
                case "tossed" -> new HandTossedPizza();
                case "stuffed" -> new StuffedCrustPizza();
                default -> throw new IllegalArgumentException("Unknown pizza type: " + order[1]);
            };
            case "salad" -> switch(order[1].toLowerCase()) { // Make a Salad object
                case "caesar" -> new CaesarSalad();
                case "garden" -> new GardenSalad();
                case "chef" -> new ChefSalad();
                default -> throw new IllegalArgumentException("Unknown salad type: " + order[1]);
            };
            case "drink" -> switch(order[1].toLowerCase()) {// Make a Drink object
                case "water" -> new Water();
                case "coke" -> new Coke();
                case "sprite" -> new Sprite();
                case "sweettea" -> new SweetTea();
                default -> throw new IllegalArgumentException("Unknown drink type: " + order[1]);
            };
            default -> throw new IllegalArgumentException("Unknown food type: " + order[0]); // Handle invalid input
        };
        return decorateFood(food, order);
    }

    private static Food decorateFood(Food food, String[] order) {
        return switch (food) {
            case Pizza pizza -> decoratePizza(pizza, order);
            case Salad salad -> decorateSalad(salad, order);
            case Drink drink -> decorateDrink(drink, order);
            case null, default -> null;
        };
    }

    private static Food decoratePizza(Pizza pizza, String[] order) {
        for (int i = 2; i < order.length; i++) {
            pizza = switch (order[i].toLowerCase()) {
                case "sausage" -> new Sausage(pizza);
                case "bacon" -> new Bacon(pizza);
                case "extracheese" -> new ExtraCheese(pizza);
                case "pepperoni" -> new Pepperoni(pizza);
                case "extrasauce" -> new ExtraSauce(pizza);
                default -> throw new IllegalArgumentException("Unknown pizza topping: " + order[i]);
            };
        }
        return pizza;
    }

    private static Food decorateSalad(Salad salad, String[] order) {
        for (int i = 2; i < order.length; i++) {
            salad = switch (order[i].toLowerCase()) {
                case "croutons" -> new Croutons(salad);
                case "tomatoes" -> new Tomatoes(salad);
                case "ham" -> new HamCubes(salad);
                default -> throw new IllegalArgumentException("Unknown salad topping: " + order[i]);
            };
        }
        return salad;
    }

    private static Food decorateDrink(Drink drink, String[] order) {
        for (int i = 2; i < order.length; i++) {
            drink = switch (order[i].toLowerCase()) {
                case "small" -> new SmallSize(drink);
                case "medium" -> new MediumSize(drink);
                case "large" -> new LargeSize(drink);
                case "noice" -> new NoIce(drink);
                default -> throw new IllegalArgumentException("Unknown drink modifier: " + order[i]);
            };
        }
        return drink;
    }


    public static void main(String[] args) {
        Food food = createFood("Drink SweetTea Large NoIce");
        System.out.printf("%.2f\n", food.getCost());
        System.out.println(food.getDescription());
    }

}
