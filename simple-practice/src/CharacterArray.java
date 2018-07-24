import java.util.*;

/**
 * 13) Generate a character array of random size and ask the user to enter letters to fill the array.
 * Output the array back to the user backwards.
 */

public class CharacterArray {
    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);
        Random r = new Random();

        int n = r.nextInt(9) + 1;
        System.out.println("Array: " + n);
        System.out.println("Enter " + n + " letters: ");
        String[] text = new String[n];
        System.out.println("Enter letters: ");

        for (int i = 0; i< text.length; i++) {
            text[i] = console.next();
        }
        reverse(text);
        for (int i = 0; i< text.length; i++) {
            System.out.print(text[i] + " ");
        }
    }
    public static void reverse (String [] text){
        for (int i = 0; i < text.length/2; i++) {
            int j = text.length - i -1;
            swap (text, i ,j);
        }
    }
    public static void swap (String [] text,int i, int j) {
        String temp = text[i];
        text[i] = text [j];
        text[j] = temp;
    }
}