import java.util.*;
public class Palindrome {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many letters in phrase? ");
        int n = console.nextInt();
        String[] phrase = new String[n];
        String word = "";
        System.out.println("Enter letters: ");
        for (int i = 0; i < phrase.length; i++) {
            phrase[i] = console.next();
            word = word + phrase[i];
        }
        palWord(word);
    }

    public static void palWord(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        if (result.equals(word)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}