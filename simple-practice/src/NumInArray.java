import java.util.*;
public class NumInArray {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int [] list = {1,2,3,4,5,6,7,8,9,0};
        int [] input = new int[10];
        System.out.println("This array holds the system's list of numbers.");
        System.out.print("Number: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("This array holds the user's inputted numbers.");
        for (int i =0; i < input.length; i++) {
            System.out.print("Number: " );
            input[i] = console.nextInt();
        }
        System.out.println();
        System.out.println("Let's see which inputs are in the system's array.");
        System.out.println();
        for (int j = 0; j < input.length; j++) {
            for (int i = 0; i < list.length; i++) {
                if (Arrays.equals(list,input)) {
                    System.out.println("Both arrays have the same values.");
                    break;
                }
                if (input[j] == list[i]) {
                    int same = list[i];
                    System.out.println(input[j] + " is in both arrays");
                    System.out.println();
                    for (int n: input) {
                        if(n != same) {
                            System.out.println(n + " is not in the system's array.");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}