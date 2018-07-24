import java.util.Scanner;

/**
 * 12) Ask the user for 8 on/off values. Using those values, treat them as binary bits.
 * Output the decimal value.
 */
public class BinaryNum {

    public static final int LENGTH_OF_ARRAY = 8;

    public static void main(String args[]) {

        String [] ordinal = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth"};
        int[] list = new int[LENGTH_OF_ARRAY];

        Scanner console = new Scanner(System.in);
        System.out.println("Enter an 8 digit binary number. One digit at a time, starting with the least.");

        for (int i = 0; i < list.length; i++) {
            System.out.print(ordinal[i] + ": ");
            list[i] = console.nextInt();
        }

        conversionBinaryToDecimal(list);

    }

    /**
     * Converts binary (1s and 0s) into decimal.
     * @param list Takes in the array that the user had inputted binary digits in.
     */

    public static void conversionBinaryToDecimal (int [] list) {
        int decimal = 0;

        for (int i = 0; i < list.length; i++) {

            if(list[i] == 1){
                decimal += Math.pow(2,i);
            }
        }
        System.out.println("The decimal value is: " + decimal);
    }
}
