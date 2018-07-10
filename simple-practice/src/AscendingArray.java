import java.util.*;
public class AscendingArray {
    public static void main(String args[]) {
        Random r = new Random();
        int [] list = new int [10];
        System.out.println("This array prints 10 random numbers.");
        for (int i =0; i < list.length; i++) {
            list[i] = r.nextInt(10);
            System.out.println("Number: " + list[i]);
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if(list[i] > list [j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println("Smallest to biggest: ");
        for (int i = 0; i < list.length-1; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.print(list[list.length-1]);
    }
}