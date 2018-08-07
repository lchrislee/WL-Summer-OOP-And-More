package pizzeria;

import pizzeria.internal.Pizza;
import pizzeria.internal.Kitchen;
import pizzeria.internal.menu.PizzaType;

/**
 * A generic class that represents any pizzeria. It is responsible for managing employees, money, inventory, customers,
 * and other aspects of business.
 */
public class Pizzeria {
    public final int PIZZA_TYPE_CHEESE = 1;
    public final int PIZZA_TYPE_MARGERHITA = 2;
    public final int PIZZA_TYPE_MEATLOVER = 3;
    public final int PIZZA_TYPE_GARDEN = 4;
    public final int PIZZA_TYPE_HAWAIIAN = 5;

    public final int COST_OF_PIZZA = 10;

    //Pizza pizza = new Pizza();

    private String mName;
    private String mDescription;
    private int mNumOfPizzas;
    private Kitchen mKitchen;

    public Pizzeria () {
        this.mName = "";
        this.mDescription = "";
        this.mNumOfPizzas = 0;
    }

    public Pizzeria(final String name, final String description, final PizzaType [] pizzasAllowed) {
        mName = name;
        mDescription = description;
        mKitchen = new Kitchen();
        mKitchen.updateMenu(pizzasAllowed);
    }

    /**
     * Takes in the pizza order and returns it back while increasing the number of pizzas ordered
     * by 1.
     * @param PizzaType Takes in the order number that the user has entered.
     * @return Returns the name and description of the pizza the user orders
     */

    public String takeOrder(final int PizzaType) {
        if (PizzaType == PIZZA_TYPE_CHEESE) {
            mNumOfPizzas++;
        }
        if (PizzaType == PIZZA_TYPE_MARGERHITA) {
            mNumOfPizzas++;
        }
        if (PizzaType == PIZZA_TYPE_MEATLOVER) {
            mNumOfPizzas++;
        }
        if (PizzaType == PIZZA_TYPE_GARDEN) {
            mNumOfPizzas++;
        }
        if (PizzaType == PIZZA_TYPE_HAWAIIAN){
            mNumOfPizzas++;
        }
        return "";//pizza.toString();
    }

    /**
     * Calculates the cost by the number of pizzas the user had ordered beforehand.
     * @return Returns the current cost for the current amount of pizzas the user had ordered.
     */

    public int calculateCost() {
        int cost;
        cost = mNumOfPizzas * COST_OF_PIZZA;
        return cost;
    }

    /**
     * Takes the user's inputted number and subtracts it to the total cost of pizzas they had ordered.
     * Also calculates change if user had entered more than the intended amount.
     *
     * @param payment The amount the user inputs to pay for the amount of pizzas they had ordered
     */
    public void acceptPayment(int payment) {
        double remainingAmount = payment - calculateCost();
        if (remainingAmount != 0) {
            System.out.println("This is your change: $" + remainingAmount);
        } else {
            System.out.println("You have 0 as your balance");
        }
    }

    /**
     * Request the menu from {@link #mKitchen} in a nicely formatted way.
     * TODO: Implement obtaining the menu from the {@link Kitchen} and formatting it nicely to return.
     *
     * @return The nicely formatted menu that is currently available.
     */
    public String checkMenu() {
        String menu;
        if (mKitchen.getMenu().length == 2) {
            menu = "\n1) Plain Cheese" + "\nPlain pizza with fresh red tomato sauce and some mozzarella cheese.\n" +
                    "\n2) Margerhita" + "\nA classic and refined pizza using fresh red tomato sauce and mozzarella cheese\n" +
                    "covered in slices of fresh tomato and topped with fresh spinach.\n";
            return menu;
        } else if (mKitchen.getMenu().length == 5) {
            menu = "\n1) Plain Cheese" + "\nPlain pizza with fresh red tomato sauce and some mozzarella cheese.\n" +
                    "\n2) Margerhita" + "\nA classic and refined pizza using fresh red tomato sauce and mozzarella cheese\n" +
                    "covered in slices of fresh tomato and topped with fresh spinach.\n" +
                    "\n3) Meatlovers" + "\nA supremely stuffed pizza with fresh red tomato sauce and mozzarella cheese" +
                    "layered with pepperoni, sausage bits, ground beef, and bacon bits.\n" +
                    "\n4) Garden" + "\nA vegetarian friendly delight made with fresh red tomato sauce and mozzarella\n" +
                    "cheese covered with locally sourced spinach, mushrooms, caramelized onions, sweet\n" +
                    "green peppers, and olives.\n" +
                    "\n5) Hawaiin" + "\nA sweet and savory treat of fresh pineapples and sliced ham on top of gooey\n" +
                    "mozzarella cheese and fresh red tomato sauce.\n";
            return menu;
        } else if (mKitchen.getMenu().length == 4) {
            menu = "\n1) Margerhita" + "\nA classic and refined pizza using fresh red tomato sauce and mozzarella cheese\n" +
                    "covered in slices of fresh tomato and topped with fresh spinach.\n" +
                    "\n2) Meatlovers" + "\nA supremely stuffed pizza with fresh red tomato sauce and mozzarella cheese" +
                    "layered with pepperoni, sausage bits, ground beef, and bacon bits.\n" +
                    "\n3) Garden" + "\nA vegetarian friendly delight made with fresh red tomato sauce and mozzarella\n" +
                    "cheese covered with locally sourced spinach, mushrooms, caramelized onions, sweet\n" +
                    "green peppers, and olives.\n" +
                    "\n4) Hawaiian" + "\nA sweet and savory treat of fresh pineapples and sliced ham on top of gooey\n" +
                    "mozzarella cheese and fresh red tomato sauce.\n";
            return menu;
        } else {
            menu = "\n1) Meatlovers" + "\nA supremely stuffed pizza with fresh red tomato sauce and mozzarella cheese" +
                    "layered with pepperoni, sausage bits, ground beef, and bacon bits.\n";
            return menu;
        }
    }

    public String moveToPizzeria() {
        String pizzeria;
        pizzeria = mName + ", " + mDescription;
        return pizzeria;
    }
}
//@Override
    /*public String toString() {

        return mName + ": " + mDescription;
    }*/


    /*if (mKitchen.getMenu().length == 2) {
            menu = "\n1) Plain Cheese" + "\nPlain pizza with fresh red tomato sauce and some mozzarella cheese.\n" +
            "\n2) Margerhita" + "\nA classic and refined pizza using fresh red tomato sauce and mozzarella cheese\n" +
            "covered in slices of fresh tomato and topped with fresh spinach.\n";
            return menu;
            } else if (mKitchen.getMenu().length == 5) {
            menu = "\n1) Plain Cheese" + "\nPlain pizza with fresh red tomato sauce and some mozzarella cheese.\n" +
            "\n2) Margerhita" + "\nA classic and refined pizza using fresh red tomato sauce and mozzarella cheese\n" +
            "covered in slices of fresh tomato and topped with fresh spinach.\n" +
            "\n3) Meatlovers" + "\nA supremely stuffed pizza with fresh red tomato sauce and mozzarella cheese" +
            "layered with pepperoni, sausage bits, ground beef, and bacon bits.\n" +
            "\n4) Garden" + "\nA vegetarian friendly delight made with fresh red tomato sauce and mozzarella\n" +
            "cheese covered with locally sourced spinach, mushrooms, caramelized onions, sweet\n" +
            "green peppers, and olives.\n" +
            "\n5) Hawaiin" + "\nA sweet and savory treat of fresh pineapples and sliced ham on top of gooey\n" +
            "mozzarella cheese and fresh red tomato sauce.\n";
            return menu;
            } else if (mKitchen.getMenu().length == 4) {
            menu = "\n1) Margerhita" + "\nA classic and refined pizza using fresh red tomato sauce and mozzarella cheese\n" +
            "covered in slices of fresh tomato and topped with fresh spinach.\n" +
            "\n2) Meatlovers" + "\nA supremely stuffed pizza with fresh red tomato sauce and mozzarella cheese" +
            "layered with pepperoni, sausage bits, ground beef, and bacon bits.\n" +
            "\n3) Garden" + "\nA vegetarian friendly delight made with fresh red tomato sauce and mozzarella\n" +
            "cheese covered with locally sourced spinach, mushrooms, caramelized onions, sweet\n" +
            "green peppers, and olives.\n" +
            "\n4) Hawaiin" + "\nA sweet and savory treat of fresh pineapples and sliced ham on top of gooey\n" +
            "mozzarella cheese and fresh red tomato sauce.\n";
            return menu;
            } else {
            menu = "\n1) Meatlovers" + "\nA supremely stuffed pizza with fresh red tomato sauce and mozzarella cheese" +
            "layered with pepperoni, sausage bits, ground beef, and bacon bits.\n";*/


/*menu = "\n1) Plain Cheese" + "\nPlain pizza with fresh red tomato sauce and some mozzarella cheese.\n" +
        "\n2) Margerhita" + "\nA classic and refined pizza using fresh red tomato sauce and mozzarella cheese\n" +
        "covered in slices of fresh tomato and topped with fresh spinach.\n" +
        "\n3) Meatlovers" + "\nA supremely stuffed pizza with fresh red tomato sauce and mozzarella cheese" +
        "layered with pepperoni, sausage bits, ground beef, and bacon bits.\n" +
        "\n4) Garden" + "\nA vegetarian friendly delight made with fresh red tomato sauce and mozzarella\n" +
        "cheese covered with locally sourced spinach, mushrooms, caramelized onions, sweet\n" +
        "green peppers, and olives.\n" +
        "\n5) Hawaiin" + "\nA sweet and savory treat of fresh pineapples and sliced ham on top of gooey\n" +
        "mozzarella cheese and fresh red tomato sauce.\n";*/