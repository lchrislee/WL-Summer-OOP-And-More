package pizzeria;

import pizzeria.internal.Pizza;
import pizzeria.internal.Kitchen;
import pizzeria.internal.menu.PizzaType;

import static pizzeria.internal.menu.PizzaType.*;

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
            mKitchen.orderPizza(PLAIN);
            mNumOfPizzas++;
        }
        if (PizzaType == PIZZA_TYPE_MARGERHITA) {
            mKitchen.orderPizza(MARGHERITA);
            mNumOfPizzas++;
        }
        if (PizzaType == PIZZA_TYPE_MEATLOVER) {
            mKitchen.orderPizza(MEATLOVERS);
            mNumOfPizzas++;
        }
        if (PizzaType == PIZZA_TYPE_GARDEN) {
            mKitchen.orderPizza(GARDEN);
            mNumOfPizzas++;
        }
        if (PizzaType == PIZZA_TYPE_HAWAIIAN){
            mKitchen.orderPizza(HAWAIIAN);
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
        for (int i = 0; i < mKitchen.getMenu().length; i++) {

            PizzaType[] typesOfPizza = mKitchen.getMenu();

            if (typesOfPizza[i] == PizzaType.PLAIN) {
                menu = "\n" + i + ") Plain Cheese" + "\nPlain pizza with fresh red tomato sauce " +
                        "and some mozzarella cheese.\n";
            } else if (typesOfPizza[i] == PizzaType.MARGHERITA) {
                menu = "\n" + i + ") Margerhita" + "\nA classic and refined pizza using fresh red " +
                        "tomato sauce and mozzarella cheese covered in slices of fresh tomato " +
                        "and topped with fresh spinach.";

            } else if (typesOfPizza[i] == PizzaType.MEATLOVERS) {
                menu = "\n" + i + ") Meatlovers" + "\nA supremely stuffed pizza with fresh red tomato sauce " +
                        "and mozzarella cheese layered with pepperoni, sausage bits, ground beef, and " +
                        "bacon bits.";

            } else if (typesOfPizza[i] == PizzaType.GARDEN) {
                menu = "\n" + i + ") Garden" + "\nA vegetarian friendly delight made with fresh red tomato " +
                        "sauce and mozzarella cheese covered with locally sourced spinach, mushrooms," +
                        " caramelized onions, sweet green peppers, and olives.";

            } else {
                menu = "\n" + i + ") Hawaiian" + "\nA sweet and savory treat of fresh pineapples and sliced ham " +
                        "on top of gooey mozzarella cheese and fresh red tomato sauce.\n";
            }
            return menu;
        }
        menu = "no menu can be generated";
        return menu;
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


    /*for (int i = 0; i < mKitchen.getMenu().length; i++) {
            PizzaType [] typesOfPizza = mKitchen.getMenu();

            if(typesOfPizza[i] == PizzaType.PLAIN) {
                menu = "\n1) Plain Cheese" + "\nPlain pizza with fresh red tomato sauce " +
                        "and some mozzarella cheese.\n";
                return menu;
            } else if (typesOfPizza[i] == PizzaType.MARGHERITA) {
                menu = "\n2) Margerhita" + "\nA classic and refined pizza using fresh red " +
                        "tomato sauce and mozzarella cheese covered in slices of fresh tomato " +
                        "and topped with fresh spinach.";
                return menu;
            } else if (typesOfPizza[i] == PizzaType.MEATLOVERS) {
                menu = "\n3) Meatlovers" + "\nA supremely stuffed pizza with fresh red tomato sauce " +
                        "and mozzarella cheese layered with pepperoni, sausage bits, ground beef, and " +
                        "bacon bits.";
                return menu;
            } else if (typesOfPizza[i] == PizzaType.GARDEN) {
                menu = "\n4) Garden" + "\nA vegetarian friendly delight made with fresh red tomato " +
                        "sauce and mozzarella cheese covered with locally sourced spinach, mushrooms," +
                        " caramelized onions, sweet green peppers, and olives.";
                return menu;
            } else {
                menu = "\n5) Hawaiian" + "\nA sweet and savory treat of fresh pineapples and sliced ham on top of gooey\n" +
                        "mozzarella cheese and fresh red tomato sauce.\n";
                return menu;
            }
        }*/