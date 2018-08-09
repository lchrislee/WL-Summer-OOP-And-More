package pizzeria.internal;

import pizzeria.Pizzeria;
import pizzeria.internal.food.PizzaBuilder;
import pizzeria.internal.menu.PizzaType;
import pizzeria.internal.menu.Topping;

/**
 * A generic pizza that represents any possible pizza. Pizzas can be customized to the liking of the customer, given
 * the range of options that are available.
 */
public class Pizza {

    private String mName;
    private String mDescription;
    //private Topping[] topping;

    //private PizzaType pizza;

    public Pizza(Topping [] topping) {

    }

    public Pizza(String name, String description) {
        mName = name;
        mDescription = description;
    }


    @Override
    public String toString() {

        return mName + " - " + mDescription;
    }
}

/*if (PizzaType.PLAIN.equals(true)) {
            mName = "Cheese Pizza";
            mDescription = "Plain pizza with fresh red tomato sauce and some mozzarella cheese.";
        } else if (PizzaType.MARGHERITA.equals(true)) {
            mName = "Margherita";
            mDescription = "A classic and refined pizza using fresh red tomato sauce and mozzarella cheese\n" +
                    "covered in slices of fresh tomato and topped with fresh spinach.";
        } else if (PizzaType.MEATLOVERS.equals(true)) {
            mName = "Meatlovers";
            mDescription = "A supremely stuffed pizza with fresh red tomato sauce and mozzarella cheese\n" +
                    "layered with pepperoni, sausage bits, ground beef, and bacon bits.";
        } else if (PizzaType.GARDEN.equals(true)) {
            mName = "Garden";
            mDescription = "A vegetarian friendly delight made with fresh red tomato sauce and mozzarella\n" +
                    "cheese covered with locally sourced spinach, mushrooms, caramelized onions, sweet\n" +
                    "green peppers, and olives.";
        } else {
            mName = "Hawaiian";
            mDescription = "A sweet and savory treat of fresh pineapples and sliced ham on top of gooey\n" +
                    "mozzarella cheese and fresh red tomato sauce.";
        }*/

/*if (topping [2] == Topping.BASIL) {
            pizza = PizzaType.MARGHERITA;
        }
        if (topping [4] == Topping.PEPPERONI) {
            pizza = PizzaType.MEATLOVERS;
        }
        if (topping[4] == Topping.SPINACH) {
            pizza = PizzaType.GARDEN;
        }
        if (topping[8] == Topping.PINEAPPLES) {
            pizza = PizzaType.HAWAIIAN;
        }
        if (topping [0] == Topping.TOMATO_SAUCE && topping [1] == Topping.MOZZARELLA_CHEESE){
            pizza = PizzaType.PLAIN;
        }*/