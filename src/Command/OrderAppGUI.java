package Command;

import Decorator.FoodFactory;
import Factory.Food;
import Strategy.BikeDeliveryStrategy;
import Strategy.CarDeliveryStrategy;
import Strategy.DeliveryStrategy;
import Strategy.DroneDeliveryStrategy;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class OrderAppGUI {
    private static final OrderManager manager = new OrderManager();
    private static final OrderInvoker invoker = new OrderInvoker();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Order App");
        frame.setSize(650, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ————— Inputs —————
        JTextField orderIdField  = new JTextField();
        orderIdField.setEditable(false);             // system‐generated only
        JTextField foodSpecField = new JTextField(); // no default text
        JTextField dropOffField  = new JTextField(); // no default text

        JComboBox<String> strategyBox =
                new JComboBox<>(new String[]{"Bike", "Car", "Drone"});

        // ————— Buttons —————
        JButton runFlowBtn = new JButton("Order");
        JButton menuBtn    = new JButton("Menu");
        JButton undoBtn    = new JButton("Undo Last");

        // ————— Output —————
        JTextArea out = new JTextArea();
        out.setEditable(false);
        out.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        JScrollPane scroll = new JScrollPane(out);

        // DeliveryContext that logs into the text area
        DeliveryContextGUI deliveryCtx = new DeliveryContextGUI(out);

        // ————— Button Actions —————

        // 1) Full-flow Order
        runFlowBtn.addActionListener(e -> {
            out.append("=== Starting Order ===\n");

            // generate a unique ID
            String id = "ORD-" + UUID.randomUUID();
            orderIdField.setText(id);

            String foodSpec = foodSpecField.getText().trim();
            String dropOff  = dropOffField.getText().trim();

            // build decorated Food
            Food item;
            try {
                item = FoodFactory.createFood(foodSpec);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(
                        frame, "Bad food spec: " + ex.getMessage());
                return;
            }

            // create order with system ID and user drop-off
            List<Food> items = new ArrayList<>();
            items.add(item);
            Order order = new Order(id, items, "Restaurant A", dropOff);

            // pick delivery strategy
            DeliveryStrategy strat = switch ((String) strategyBox.getSelectedItem()) {
                case "Car"   -> new CarDeliveryStrategy();
                case "Drone" -> new DroneDeliveryStrategy();
                default      -> new BikeDeliveryStrategy();
            };

            // run composite command
            Command fullFlow = new ProcessOrderCommand(
                    manager, order, deliveryCtx, strat, out
            );
            invoker.setCommand(fullFlow);
        });

        // 2) Show Menu Modal
        menuBtn.addActionListener(e -> {
            JDialog menuDialog = new JDialog(frame, "Menu", true);
            menuDialog.setSize(400, 300);
            menuDialog.setLayout(new BorderLayout());

            JTextArea menuArea = new JTextArea();
            menuArea.setEditable(false);
            menuArea.append("=== Base Foods ===\n");
            menuArea.append("Pizza Flat\nPizza HandTossed\nPizza Stuffed\n");
            menuArea.append("Salad Caesar\nSalad Garden\nSalad Chef\n");
            menuArea.append("Drink Water\nDrink Coke\nDrink Sprite\nDrink SweetTea\n\n");
            menuArea.append("=== Pizza Toppings ===\n");
            menuArea.append("Sausage, Bacon, ExtraCheese, Pepperoni, ExtraSauce, Flat crust, Hand tossed, Tomatoes\n\n");
            menuArea.append("=== Salad Toppings ===\n");
            menuArea.append("Croutons, Tomatoes, HamCubes\n\n");
            menuArea.append("=== Drink Modifiers ===\n");
            menuArea.append("Small, Medium, Large, NoIce\n");

            menuDialog.add(new JScrollPane(menuArea), BorderLayout.CENTER);

            JButton backBtn = new JButton("Back");
            backBtn.addActionListener(ev -> menuDialog.dispose());
            JPanel btnPanel = new JPanel();
            btnPanel.add(backBtn);
            menuDialog.add(btnPanel, BorderLayout.SOUTH);

            menuDialog.setLocationRelativeTo(frame);
            menuDialog.setVisible(true);
        });

        // 3) Undo
        undoBtn.addActionListener(e -> invoker.undoCommand());

        // ————— Layout —————
        JPanel top = new JPanel(new GridLayout(0,2,5,5));
        top.setBorder(BorderFactory.createTitledBorder("Order & Strategy Inputs"));
        top.add(new JLabel("Order ID:"));    top.add(orderIdField);
        top.add(new JLabel("Food spec:"));   top.add(foodSpecField);
        top.add(new JLabel("Drop-Off:"));    top.add(dropOffField);
        top.add(new JLabel("Delivery:"));    top.add(strategyBox);
        top.add(runFlowBtn);                 top.add(menuBtn);
        top.add(undoBtn);                    top.add(new JLabel()); // filler

        frame.setLayout(new BorderLayout(5,5));
        frame.add(top, BorderLayout.NORTH);
        frame.add(scroll, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}