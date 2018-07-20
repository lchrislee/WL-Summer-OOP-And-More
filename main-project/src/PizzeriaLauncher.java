import pizzeria.Pizzeria;

import java.util.Scanner;

/**
 * The starting point to access the pizzeria. This will manage all user inputs and coordinate any requests that the
 * customers will have.
 */
public class PizzeriaLauncher
{
    private Scanner mInputScanner;   

    public static final int LEAVING = 0;
    public static final int ORDERING = 1;
    public static final int CHECKING = 2;
    public static final int PAYING = 3;

    // The Pizzeria that the user has chosen to enter.

    public static void main(final String[] args) {
        final PizzeriaLauncher launcher = new PizzeriaLauncher();
        launcher.start();

    }

    private PizzeriaLauncher() {

        mInputScanner = new Scanner(System.in);
    }

    /**
     * The true entry point to the pizzeria. This will run forever, until the program exits.
     *
     * TODO: Add a loop so that the user can continue selection options so long as they choose not to leave.
     */
    private void start() {
        System.out.println("Welcome to Pinky's Picture Perfect Pizzeria, home of the best Pizza in town!");
        System.out.println("What can we do for you?");
        showOptions();
        int choice = mInputScanner.nextInt();
        processUserChoice(choice);
        while(choice != 0) {
            System.out.println("What can we do for you?");
            showOptions();
            choice = mInputScanner.nextInt();
            processUserChoice(choice);
        }
    }

    /**
     * Cleanly close and destroy anything necessary and inform the user that the pizzeria is closing.
     */
    private void stop() {
        System.out.println("The pizzeria is closed for the day.");
        System.out.println("Thank you, please come again!");
    }

    /**
     * Print out all the available options to the user.
     */
    private void showOptions() {
        System.out.println("Please select one of the following options:");
        System.out.println("1) Order a pizza");
        System.out.println("2) Check current bill");
        System.out.println("3) Pay bill");
        System.out.println("0) Leave");
        System.out.print("Your choice: ");
    }

    /**
     * Take the option selected by the user and transform it to something the pizzeria can understand. Then decide how
     * to handle the request from the user.
     * TODO: Handle the option of ordering a pizza.
     *
     * @param optionSelected The choice selected by the user that needs processing.
     */
    private void processUserChoice(final int optionSelected) {
        int count = 0;
        if (optionSelected == ORDERING) {
            handleOrderingPizza(count);
        } else if (optionSelected == CHECKING) {
            handleCheckBill();
        } else if (optionSelected == PAYING) {
            handlePayment();
        } else {
            stop();
        }
    }

    /**
     * Show the user what types of pizza are available and then ask what they want. Once retrieved, hand off the
     * information to the pizzeria to obtain the correct pizza. Then give it to the user.
     *
     * TODO: Show all the available types of pizza.
     * TODO: Ask the user which type of pizza they want.
     * TODO: Inform the pizzeria of the order, obtain the pizza, and give it to the user.
     */

    private void handleOrderingPizza(int count) {
        count++;
        System.out.println("What type of pizza do you want to order? ");
        System.out.println("1) Cheese Pizza - Plain pizza with fresh red " +
                "tomato sauce and some mozzarella cheese.");
        System.out.print("Your order #: ");
        int order = mInputScanner.nextInt();
        System.out.print("The name of the type of pizza you are ordering: ");
        mInputScanner.nextLine();
        String name = mInputScanner.nextLine();
        System.out.print("The description of the pizza: ");
        String description = mInputScanner.nextLine();
        Pizzeria orderPizzeria = new Pizzeria(name,description,count);
        orderPizzeria.takeOrder(order);
        System.out.println("Here's your pizza");
        System.out.println(orderPizzeria);
    }

    /**
     * Requests the current bill from the pizzeria and presents it to the user.
     *
     * TODO: Obtain the current amount owed to the pizzeria and display it.
     */
    private void handleCheckBill() {
        Pizzeria bill = new Pizzeria();
        System.out.println("Here's what you owe to the pizzeria currently: $" + bill.calculateCost());
    }

    /**
     * Figure out how much the user owes the pizzeria and let them know. Then accept and process the payment.
     *
     * TODO: Ask the pizzeria how much the user owes for their pizzas and then let the user know.
     * TODO: Accept the money from the user and hand it off to the pizzeria.
     */
    private void handlePayment() {
        Pizzeria paymentForPizzas = new Pizzeria();
        Pizzeria bill = new Pizzeria();
        System.out.println("This is how much you owe to the pizzeria: $" + bill.calculateCost());
        System.out.println("Please enter in the amount you want to pay.");
        int payment = mInputScanner.nextInt();
        paymentForPizzas.acceptPayment(payment);
    }

}
