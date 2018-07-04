import java.util.Scanner;
public class TaxArray {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        double taxAmount;
        System.out.println("What is your annual income? ");
        double [] income = new double [1];
        income [0] = console.nextInt();
        if (income[0] > 0 && income [0] < 9526) {
            taxAmount = income [0] * 0.10;
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income[0] > 9526 && income[0] < 38701) {
            taxAmount = (((income[0] - 9525) * 0.12) + 952.5);
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income[0] > 38701 && income[0] < 82501) {
            taxAmount = (((income[0] - 38700) * 0.22) + 4453);
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income[0] > 82501 && income[0]< 157501) {
            taxAmount = (((income[0]-82500) * 0.24) + 14089.5);
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income [0] > 157501 && income[0] < 200001) {
            taxAmount = (((income[0]-157500) * 0.32) + 32089.5);
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income[0] > 200001 && income[0]< 500001) {
            taxAmount = (((income[0]-200000) * 0.35) + 45689.5);
            System.out.println("Amount of Tax: " + taxAmount);
        } else {
            taxAmount = (((income[0]-500000) * 0.37) + 150689.5);
            System.out.println("Amount of Tax: " + taxAmount);
        }
    }
}
