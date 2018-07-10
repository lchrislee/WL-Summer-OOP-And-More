import java.util.Scanner;
public class TaxArray {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        double taxAmount;
        int [] taxBracket = {0,9526,38701,82501,157501,200001,500001};
        System.out.println("What is your annual income? ");
        double income = console.nextDouble();
        if (income > taxBracket[0] && income < taxBracket[1]) {
            taxAmount = income * 0.10;
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income > taxBracket[1] && income < taxBracket[2]) {
            taxAmount = (((income - 9525) * 0.12) + 952.5);
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income > taxBracket[2] && income < taxBracket[3]) {
            taxAmount = (((income - 38700) * 0.22) + 4453);
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income > taxBracket[3] && income < taxBracket[4]) {
            taxAmount = (((income-82500) * 0.24) + 14089.5);
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income > taxBracket[4] && income < taxBracket[5]) {
            taxAmount = (((income-157500) * 0.32) + 32089.5);
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income > taxBracket[5] && income < taxBracket[6]) {
            taxAmount = (((income-200000) * 0.35) + 45689.5);
            System.out.println("Amount of Tax: " + taxAmount);
        } else {
            taxAmount = (((income-500000) * 0.37) + 150689.5);
            System.out.println("Amount of Tax: " + taxAmount);
        }
    }
}
