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
    }

    public Pizzeria(final String name, final String description, final PizzaType[] pizzasAllowed) {
        mName = name;
        mDescription = description;
        mKitchen = new Kitchen();
        mKitchen.updateMenu(pizzasAllowed);
    }

    // TODO: Add takeOrder method that takes the customer selected pizza type and returns the appropriate pizza.
    public void takeOrder(final int PizzaType) {
        if (PizzaType == PIZZA_TYPE_CHEESE_PIZZA) {
            toString();
        }
    }

    // TODO: Add calculateCost method that returns the amount owed by the customer for all the pizzas they bought.
    public int calculateCost() {
        int cost = mNumOfPizzas * COST_OF_PIZZA;
        return cost;
    }

    // TODO: Add acceptPayment method that takes in the amount paid and removes it from the amount the customer owes.
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
