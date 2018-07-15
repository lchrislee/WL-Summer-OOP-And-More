# Main Project


Simulate a mom-and-pop Pizzeria that can take orders from customers and serve
them pizzas.


## Tasks

Decide the way you want to handle it and implement your solution
however you want. You can add additional member variables, add new methods, etc. to accomplish the
goals below.

Note that you should delete any TODO comments after they are completed.

1. The start of a restaurant. Expected timeframe: 7/13 - 7/19. Estimated time: 90 minutes.
    1. Right now, there are a few problems with restaurant experience. First of all, no matter what
    the user enters, we leave right away without serving them. That's just a terrible experience.
    Second of all, if they do select not to leave, we don't let them continue making decisions.
    To do this, we need to make changes in the `PizzeriaLauncher` class.
        - In the `start` method, make sure we loop appropriately so that we can continue to ask
        what the user wants to do until they select to leave.
        - The `stop` method may be updated to make sure leaving is smooth.
        - In `processUserChoice`, When the user selects an option that is not leaving, execute the
        correct action by calling the appropriate method. When the user selects to leave, make sure
        that the program exits successfully.
    2. Now that the user can actually take meaningful actions, we have to make sure that the
    pizzeria is capable of responding. This will be done in the `Pizzeria` class.
        - Create a `takeOrder` method that allows takes in a type of pizza. For now, assume that the
        pizza type can be represented by an integer. Right now, we only support the generic pizza
        so just return an instance of `Pizza` regardless of what the pizza type should be.
        - Create a `calculateCost` method that determines the total amount the user owes. This can
        be done in a variety of ways. You can assume that all pizzas have a value of $10.
        - Create a `acceptPayment` method that takes in an amount of money and removes it from the
        value that the user owes.
    3. Finally, we can link up the functional `Pizzeria` with the `PizzeriaLauncher`. This should
    create a working project where every option that the user takes is valid. Do the following in
    `PizzaLauncher`.
        - Implement `handleOrderPizza` as described in the TODO.
        - Implement `handleCheckBill` as described in the TODO.
        - Implement `handlePayment` as described in the TODO.
2. Making the restaurant more defined and adding more variety. Expected timeframe: 7/20 - 7/24.
Estimated time: 90 min.
    1. A `Pizza` isn't really complete without some toppings. We need to implement the functionality
        to support toppings and also to create `Pizza` with them.
        - Create a `Topping` enum with all the toppings mentioned with `PizzaType` (sauce and cheese
         are toppings).
        - Add functionality to the `PizzaBuilder` to support all the `Toppings`. A good way to do
        this is to hold the information on what `Toppings` to include through booleans. Then, in the
        `build()` method, create an array that fits all the `Toppings` exactly and pass that into
        the `Pizza` being created. The names of the `Pizza` should be the name of the `PizzaType`
        and the description should match the ones seen in the next section. We're not quite ready
        for `Pizza` to have different prices yet, but you may want to add a field for it now and
        have it always set to the same value used previously: $10.
    2. `Pizzeria` now hold "menus" that are an array of `PizzaType`. This allows us to move on from
    the simple one style of `Pizza` to much more. Additionally, we added a `Kitchen` class which
    will handle all the work for creating `Pizza` so that the `Pizzeria` can focus on other tasks.
    This makes things a little more challenging however.
        - We should be able to answer any questions about what type of `Pizza` are available to
        order at any one `Pizzeria`. The `Kitchen` has a method `getMenu()` which is useful to use
        in the `Pizzeria`. Implement `checkMenu()` to nicely format the options available.

            An example menu could look something like this:

                Pizzas available to order:
                1) Cheese
                2) Margherita


            An elaborate menu could look like this:

                Pizzas available:
                1) The Plain Cheese
                   Plain pizza with fresh red tomato sauce and some mozzarella cheese.
                2) Margherita
                   A classic and refined pizza using fresh red tomato sauce and mozzarella cheese
                   covered in slices of fresh tomato and topped with fresh spinach.
                3) Meatlovers
                   A supremely stuffed pizza with fresh red tomato sauce and mozzarella cheese
                   layered with pepperoni, sausage bits, ground beef, and bacon bits.
                4) Garden
                   A vegetarian friendly delight made with fresh red tomato sauce and mozzarella
                   cheese covered with locally sourced spinach, mushrooms, caramelized onions, sweet
                   green peppers, and olives.
                5) Hawaiian
                   A sweet and savory treat of fresh pineapples and sliced ham on top of gooey
                   mozzarella cheese and fresh red tomato sauce.

        - We need to move the `Pizza` creation logic from the `Pizzeria` to the `Kitchen`. This
        helps delegate responsibility to different objects and keeps the content encapsulated.
        Implement the `orderPizza()` method in `Kitchen` to create the correct `Pizza` using a
        `PizzaBuilder`. Then, update the `takeOrder` method in `Pizzeria` to use the `Kitchen`
        instance variable `mKitchen` to obtain the `Pizza` necessary.
    3. Now that `Pizzaria` are capable of more functionality, we need to update the
    `PizzeriaLauncher` class. This gives the user more options than ever.
        - The new order of commands is already updated in `showOptions()`. Create any methods needed
        to support the new commands.
        - In the method to support checking the menu, pull the information from the current
        `Pizzeria` and show it to the user.
        - In order to implement the method for going to another `Pizzeria`, we first need to have
        all the `Pizzeria` ever visitable established. Add an array of `Pizzeria` to `PizzaLauncher`
        and initialize it in the constructor with the following `Pizzeria`:

            Name: Maria's Margherita Masterpieces
            Description: Margheritas galore, the freshest tomatoes on the freshest pizza in town.
            Pizza types: Plain, Margherita

            Name: Pinky's Picture Perfect Pizzeria
            Description: Home of the best pizzas in town!
            Pizza types: Plain, Margherita, Meatlovers, Garden, Hawaiian
        
            Name: The Seasonal Special Shack
            Description: We won't sacrifice quality on subpar toppings. Only open during summer when
            produce is best!
            Pizza types: Margherita, Meatlovers, Garden, Hawaiian

            Name: Protein, Power, Profit
            Description: Meat is best and beats the rest.
            Pizza types: Meatlovers

        - Once all known `Pizzeria` are available, the changing `Pizzeria` option is simple, just
        ask the user which `Pizzeria` they want to go to and update the one they are currently at.
        Since we want to keep things slightly realistic, you should yell at the user to pay their
        bill if they try to leave but still owe money!