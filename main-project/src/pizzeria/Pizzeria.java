package pizzeria;

import pizzeria.internal.Pizza;
import pizzeria.internal.Kitchen;
import pizzeria.internal.menu.PizzaType;

/**
 * A generic class that represents any pizzeria. It is responsible for managing employees, money, inventory, customers,
 * and other aspects of business.
 */
public class Pizzeria {
    public final int PIZZA_TYPE_CHEESE_PIZZA = 1;
    public static final int COST_OF_PIZZA = 10;

    Pizza pizza = new Pizza();

    private String mName;
    private String mDescription;
    private int mNumOfPizzas;
    private Kitchen mKitchen;

    public Pizzeria () {
        this.mName = "";
        this.mDescription = "";
        this.mNumOfPizzas = 0;
    }

<<<<<<< HEAD
    public Pizzeria(final String name, final String description) {
        mName = name;
        mDescription = description;
=======
    public Pizzeria(final String name, final String description, final PizzaType[] pizzasAllowed) {
        mName = name;
        mDescription = description;
        mKitchen = new Kitchen();
        mKitchen.updateMenu(pizzasAllowed);
>>>>>>> 555557feeba24fb5455ea0e1b39c5a50106abccf
    }

    /**
     * Takes in the pizza order and returns it back while increasing the number of pizzas ordered
     * by 1.
     * @param PizzaType Takes in the order number that the user has entered.
     * @return Returns the name and description of the pizza the user orders
     */

    public String takeOrder(final int PizzaType) {
        if (PizzaType == PIZZA_TYPE_CHEESE_PIZZA) {
            mNumOfPizzas++;
        }
        return pizza.toString();
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
        }
    }

    /**
     * Request the menu from {@link #mKitchen} in a nicely formatted way.
     * TODO: Implement obtaining the menu from the {@link Kitchen} and formatting it nicely to return.
     *
     * @return The nicely formatted menu that is currently available.
     */
    public String checkMenu() {
        return "";
    }

    @Override
    public String toString() {

        return mName + ": " + mDescription;
    }
}
