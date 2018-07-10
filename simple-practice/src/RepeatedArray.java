import java.util.*;
public class RepeatedArray {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int[] data = new int[10];
        System.out.println("Enter 10 numbers and see which ones are repeated");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Number: ");
            data[i] = console.nextInt();
        }
        System.out.println("Did you repeat any numbers? (yes/no)");
        String response = console.next();
        if (response.equals("yes") || response.equals("y")) {
            for (int n = 0; n < data.length-1; n++) {
                for (int j = n + 1; j < data.length; j++) {
                    if (data[n] == data[j]) {
                        System.out.println(data[n] + " was repeated");
                    }
                }
            }
        } else {
            System.out.println("You have unique numbers.");
        }
    }
}