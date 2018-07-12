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