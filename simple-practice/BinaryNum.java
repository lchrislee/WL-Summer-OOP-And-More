import java.util.Scanner;
public class BinaryNum {
    public static void main(String args[]) {
        int[] list = new int[8];
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 8 binary numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = console.nextInt();
            palNum(list[i]);
        }
    }

    public static void palNum(int x) {
        int decimal = 0;
        int y = 0;
        while (x != 0) {
            decimal += ((x%10) * Math.pow(2,y));
            x = x/10;
            y++;
        }
        System.out.println("Decimal: " + decimal);
    }
}

