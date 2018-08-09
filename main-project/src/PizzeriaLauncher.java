import pizzeria.Pizzeria;
import pizzeria.internal.Kitchen;
import pizzeria.internal.food.PizzaBuilder;
import pizzeria.internal.menu.PizzaType;

import java.util.Scanner;

/**
 * The starting point to access the pizzeria. This will manage all user inputs and coordinate any requests that the
 * customers will have.
 */
public class PizzeriaLauncher
{
    private Scanner mInputScanner;

    public static final int LEAVING = 0;
    public static final int CHECK_MENU = 1;
    public static final int ORDERING = 2;
    public static final int CHECK_BILL = 7;
    public static final int PAYING = 8;
    public static final int MOVE = 9;

    // The Pizzeria that the user has chosen to enter.
    Pizzeria pizzeria = new Pizzeria();

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
        System.out.println("1) Check menu");
        System.out.println("2) Order a pizza");
        System.out.println("7) Check current bill");
        System.out.println("8) Pay bill");
        System.out.println("9) Go to another pizzeria");
        System.out.println("0) Leave");
        System.out.print("Your choice: ");
    }

    /**
     * Take the option selected by the user and transform it to something the pizzeria can understand. Then decide how
     * to handle the request from the user.
     *
     * @param optionSelected The choice selected by the user that needs processing.
     */
    private void processUserChoice(final int optionSelected) {
        if (optionSelected == CHECK_MENU) {
            handleMenu();
        } else if (optionSelected == ORDERING) {
            handleOrderingPizza();
        } else if (optionSelected == CHECK_BILL) {
            handleCheckBill();
        } else if (optionSelected == PAYING) {
            handlePayment();
        } else if (optionSelected == MOVE) {
            handleMove();
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
     * TODO: Update with the new types of pizza available.
     */
    private void handleMenu () {
        System.out.println("Here's the menu: ");
        System.out.println(pizzeria.checkMenu());
    }

    private void handleMove() {
        String description;
        String [] namePizzeria = {"Maria's Margherita Masterpieces", "Pinky's Picture Perfect Pizzeria",
        "The Seasonal Special Shack", "Protein, Power, Profit"};
        System.out.println("Here are the available pizzerias in town:\n");

        for (int i = 0; i < namePizzeria.length; i++) {
            System.out.println(namePizzeria[i]);
        }
        System.out.println();
        mInputScanner.nextLine();
        System.out.println("Which pizzeria do you want to go to? Enter the place name.");
        String nameOfPizzeria = mInputScanner.nextLine();

        if (nameOfPizzeria.equalsIgnoreCase(namePizzeria[0])) {
            //final int numOfTypes = 2;
            description = "Margheritas galore, the freshest tomatoes on the freshest pizza in town.";
            PizzaType [] typesSupported = new PizzaType[]{PizzaType.PLAIN,PizzaType.MARGHERITA};
            Pizzeria diffPizzeria = new Pizzeria(nameOfPizzeria, description,typesSupported);

            if (pizzeria.calculateCost() == 0) {
                System.out.println("Welcome to " + diffPizzeria.moveToPizzeria());
            } else {
                System.out.println("Please pay before you leave.");
                handlePayment();
            }
        }
        if (nameOfPizzeria.equalsIgnoreCase(namePizzeria[1])) {

            //final int numOfTypes = 5;
            description = "Home of the best pizzas in town!";
            PizzaType [] typesSupported = new PizzaType[]{PizzaType.PLAIN,PizzaType.MARGHERITA,PizzaType.MEATLOVERS,
            PizzaType.GARDEN,PizzaType.HAWAIIAN};
            Pizzeria diffPizzeria = new Pizzeria(nameOfPizzeria, description,typesSupported);

            if (pizzeria.calculateCost() == 0) {
                System.out.println("Welcome to " + diffPizzeria.moveToPizzeria());
            } else {
                System.out.println("Please pay before you leave.");
                handlePayment();
            }
        }
        if (nameOfPizzeria.equalsIgnoreCase(namePizzeria[2])) {
            //final int numOfTypes = 4;
            description = " We won't sacrifice quality on subpar toppings. Only open during " +
                    "summer when produce is best! ";
            PizzaType [] typesSupported = new PizzaType[]{PizzaType.MARGHERITA, PizzaType.MEATLOVERS,
            PizzaType.GARDEN, PizzaType.HAWAIIAN};
            Pizzeria diffPizzeria = new Pizzeria(nameOfPizzeria, description,typesSupported);

            if (pizzeria.calculateCost() == 0) {
                System.out.println("Welcome to " + diffPizzeria.moveToPizzeria());
            } else {
                System.out.println("Please pay before you leave.");
                handlePayment();
            }
        }
        if (nameOfPizzeria.equalsIgnoreCase(namePizzeria[3])) {
            //final int numOfTypes = 1;
            description = "Meat is best and beats the rest.";
            PizzaType [] typesSupported = new PizzaType[]{PizzaType.MEATLOVERS};
            Pizzeria diffPizzeria = new Pizzeria(nameOfPizzeria, description,typesSupported);

            if (pizzeria.calculateCost() == 0) {
                System.out.println("Welcome to " + diffPizzeria.moveToPizzeria());
            } else {
                System.out.println("Please pay before you leave.");
                handlePayment();
            }
        }
    }


    private void handleOrderingPizza() {
        System.out.println("What type of pizza do you want to order?");
        System.out.print("Your order #: ");
        int order = mInputScanner.nextInt();


        System.out.println("Here's your pizza:");
        System.out.println(pizzeria.takeOrder(order));

    }

    /**
     * Requests the current bill from the pizzeria and presents it to the user.
     *
     * TODO: Obtain the current amount owed to the pizzeria and display it.
     */
    private void handleCheckBill() {
        System.out.println("Here's what you owe to the pizzeria currently: $" + pizzeria.calculateCost());
    }

    /**
     * Figure out how much the user owes the pizzeria and let them know. Then accept and process the payment.
     *
     */
    private void handlePayment() {
        System.out.println("This is how much you owe to the pizzeria: $" + pizzeria.calculateCost());
        System.out.println("Please enter in the amount you want to pay.");
        int payment = mInputScanner.nextInt();
        pizzeria.acceptPayment(payment);
    }
}

/*System.out.print("The name of the type of pizza you are ordering: ");
        mInputScanner.nextLine();
        String name = mInputScanner.nextLine();
        System.out.print("The description of the pizza: ");
        String description = mInputScanner.nextLine();*/