import java.util.Scanner;

public class LongestString
{
	public static void main( String[] args )
	{
		System.out.print("How many phrases would you like to compare? ");

		Scanner scanner = new Scanner(System.in);
		int userInputCount = scanner.nextInt();
		String heldStrings[] = new String[userInputCount];

		// TODO: 1) Read in the strings necessary to fill in heldStrings.

		System.out.println("Now we'll check to see which one is longest.");
		int longestStringIndex = findLongestString(heldStrings);
		System.out.println("The longest phrase you entered is phrase #" + (longestStringIndex + 1));
		// TODO: 3) Get the longest string and replace the empty quotes below.
		String longestString = "";
		System.out.println("the phrase is: " + longestString);
	}

	private static int findLongestString(final String stringsToCompare[]) {
		// TODO: 2) Implement and replace the return statement.
		return -1;
	}
}
