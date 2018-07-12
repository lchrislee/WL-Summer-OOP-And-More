package pizzeria;

/**
 * A generic class that represents any pizzeria. It is responsible for managing employees, money, inventory, customers,
 * and other aspects of business.
 */
public class Pizzeria {

    private String mName;
    private String mDescription;

    public Pizzeria(final String name, final String description) {
        mName = name;
        mDescription = description;
    }

    // TODO: Add takeOrder method that takes the customer selected pizza type and returns the appropriate pizza.

    // TODO: Add calculateCost method that returns the amount owed by the customer for all the pizzas they bought.

    // TODO: Add acceptPayment method that takes in the amount paid and removes it from the amount the customer owes.

    @Override
    public String toString() {
        return mName + ": " + mDescription;
    }
}
