import java.util.*;

/**
 * 16) Fill an array of 10 integers with integer values. Prompt the user for input.
 * Print whether or not their input number is in the array.
 */

public class NumInArray {

    public static final int ARRAY_LENGTH = 10;

    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);
        int [] list = new int [ARRAY_LENGTH];

        System.out.println("Please enter in 10 numbers: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            list [i] = console.nextInt();
        }

        System.out.print("Please enter in another number: ");
        int userInputNumber = console.nextInt();

        System.out.println("Is this number in the list of inputs you entered before? (yes/no)");
        String response = console.next();

        if (response.equals("yes") || response.equals("y")) {
            findLocation(list,userInputNumber);
        } else {
            System.out.println("Have a nice day!");
        }
    }

    /**
     * Takes the userInputNumber and compares it with the array of inputted numbers to
     * see where the number appears in the list.
     *
     * @param list The array the user inputted integers in
     * @param target The number the user inputs that is outside of the array
     */

    public static void findLocation(int [] list, int target) {
        for (int i = 0; i < list.length; i++) {

            if (list[i] == target) {
                System.out.println(target + " is found in position " + (i + 1) + " in the list.");
            }
        }
    }

}