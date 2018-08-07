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

    private PizzaType pizza;

    public Pizza(Topping [] topping) {
        //Pizza pizza = new Pizza();
        if (topping [2] == Topping.BASIL) {
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
        }
    }

    //mName = "Cheese Pizza";
    //mDescription = "Plain pizza with fresh red tomato sauce and some mozzarella cheese.";


    @Override
    public String toString() {

        return mName + " - " + mDescription;
    }
}