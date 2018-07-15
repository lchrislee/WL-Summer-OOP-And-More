package pizzeria.internal;

import pizzeria.internal.food.PizzaBuilder;
import pizzeria.internal.menu.PizzaType;

/**
 * The dedicated factory that generates {@link Pizza} when requested. It only supports a limited portion of
 * {@link PizzaType} on its menu.
 */
public class Kitchen {

    private PizzaType mMenu[];

    /**
     * Replace the types of {@link Pizza} that are available to order and can be created.
     *
     * @param types The new {@link Pizza} types.
     */
    public void updateMenu(final PizzaType types[]) {
        mMenu = types;
    }

    /**
     * Get the latest types of {@link Pizza} that the are available to order.
     *
     * @return The types of {@link Pizza} that are available to order.
     */
    public PizzaType[] getMenu() {
        return mMenu;
    }

    /**
     * Checks to see if the {@link PizzaType} is supported. If it is, create the correct {@link Pizza} using a
     * {@link PizzaBuilder}.
     *
     * TODO: Implement checking to see if the pizza ordered is valid.
     * TODO: Implement creating the correct pizza ordered.
     *
     * @param typeOrdered The type of {@link Pizza} that was ordered.
     * @return The created {@link Pizza} that matches the user's type. Null when the restaurant cannot make the type.
     */
    public Pizza orderPizza(final PizzaType typeOrdered) {
        return new PizzaBuilder().build();
    }
}
