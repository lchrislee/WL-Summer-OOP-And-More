package pizzeria.internal;

/**
 * A generic pizza that represents any possible pizza. Pizzas can be customized to the liking of the customer, given
 * the range of options that are available.
 */
public class Pizza {

    private String mName;
    private String mDescription;

    public Pizza() {
        mName = "Cheese Pizza";
        mDescription = "Plain pizza with fresh red tomato sauce and some mozzarella cheese.";
    }

    @Override
    public String toString() {
        return mName + " - " + mDescription;
    }

}
