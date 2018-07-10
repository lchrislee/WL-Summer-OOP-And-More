import java.util.*;
public class RangeArray {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int [] input = new int[10];
        System.out.println("Enter a number between 0-9.");
        for (int i = 0; i < input.length; i++) {
            System.out.print("Number: ");
            input[i] = console.nextInt();
            if (input[i] == 0) {
                count0++;
            }
            if (input[i] == 1) {
                count1++;
            }
            if (input[i] == 2) {
                count2++;
            }
            if (input[i] == 3) {
                count3++;
            }
            if (input[i] == 4) {
                count4++;
            }
            if (input[i] == 5) {
                count5++;
            }
            if (input[i] == 6) {
                count6++;
            }
            if (input[i] == 7) {
                count7++;
            }
            if (input[i] == 8) {
                count8++;
            }
            if (input[i] == 9) {
                count9++;
            }
        }
        System.out.println("0 occurred " + count0 + " times");
        System.out.println("1 occurred " + count1 + " times");
        System.out.println("2 occurred " + count2 + " times");
        System.out.println("3 occurred " + count3 + " times");
        System.out.println("4 occurred " + count4 + " times");
        System.out.println("5 occurred " + count5 + " times");
        System.out.println("6 occurred " + count6 + " times");
        System.out.println("7 occurred " + count7 + " times");
        System.out.println("8 occurred " + count8 + " times");
        System.out.println("9 occurred " + count9 + " times");
    }
}
