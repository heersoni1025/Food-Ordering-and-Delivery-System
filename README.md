# 🍽️ Food Ordering and Delivery System

This is a Java-based food ordering and delivery application developed as the final project for **CSCI-C 322: Object-Oriented Software Methods** at Indiana University. The application allows users to build custom food orders, choose a delivery method, and track the order lifecycle — all through a clean graphical interface.

---

## 📦 Features

- 🧾 Build and customize orders with pizzas, salads, and drinks
- 🧑‍🍳 Add toppings, sauces, and size options using the Decorator Pattern
- 🚚 Choose delivery methods: Bike, Car, or Drone (Strategy Pattern)
- ↩️ Undo, cancel, or reorder with a Command Pattern-based system
- 🖥️ GUI built with Java Swing
- 📶 Track real-time order state transitions (Confirmed → Picking Up → En Route → Delivered)

## 🧠 Design Patterns Used

| Pattern    | Purpose |
|------------|---------|
| **Factory**   | Centralized creation of food items based on user input |
| **Decorator** | Dynamically wrap food items with toppings and size options |
| **Command**   | Encapsulate actions like placing, canceling, reordering, and undoing orders |
| **Strategy**  | Flexibly swap between delivery methods |
| **State**     | Track order lifecycle through clear, extendable state transitions |


## 🖥️ GUI Overview

The GUI was developed using **Java Swing** and ties together all the backend logic with intuitive components for the user. Here's how it's structured and what it offers:

### 📋 Components

- **JComboBoxes** to select:
  - Food type (Pizza, Salad, Drink)
  - Delivery type (Bike, Car, Drone)
- **JCheckBoxes** for toppings/customizations (e.g., cheese, sauces)
- **Buttons**:
  - **Place Order** – triggers `PlaceOrderCommand`
  - **Cancel Order** – triggers `CancelOrderCommand`
  - **Reorder** – re-executes the last order
  - **Undo Last** – undoes the most recent action (Command Pattern)
- **TextArea**:
  - Displays order summaries, current delivery state, estimated delivery time, and cost

 ### 🔁 Interaction Flow

1. **User selects food type and toppings**
2. **Chooses delivery method from dropdown**
3. **Places order** – food is created using Factory, decorated, and assigned a delivery strategy
4. **Order is tracked** – state transitions are displayed in real time
5. **User can undo, cancel, or reorder easily**

The GUI is event-driven and promotes separation of concerns. It acts as a **client** that invokes commands and delegates order processing to the backend logic.



## 🛠️ How to Run

1. Unzip the code into the `/src` folder.
2. Open the project in your favorite Java IDE (IntelliJ, Eclipse, etc.).
3. Run the main class: `OrderingAppGUI.java`
4. Interact with the GUI to create, place, and track orders.



## 📘 Documents

All the following can be found in the `docs/` folder:

- 📄 **Report** – Technical breakdown of system design, patterns used, and challenges
- 🎓 **Presentation** – Slide deck summarizing design decisions and project overview
- 🧪 **Proposal** – Initial plan and timeline for the project
- 📊 **UML Diagrams** – Diagrams for all implemented design patterns



## 👥 Team Members

| Name               | Email               |
|--------------------|---------------------|
| **Heer Soni**      | heersoni@iu.edu     |
| **Joey Myers**     | myersnj@iu.edu      |
| **Sindhur Bansal** | sindbans@iu.edu     |
| **Dylan Drotts**   | ddrotts@iu.edu      |



> 💡 *This project was built to demonstrate advanced software design principles, clean architecture, and strong teamwork. It’s intended as both an educational reference and a template for similar Java-based applications.*
