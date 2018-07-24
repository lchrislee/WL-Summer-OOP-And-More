import java.util.*;
public class BookChecker {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter the details of the author.");
        System.out.println();
        System.out.print("Author's Name: ");
        String name = console.nextLine();
        System.out.print("Author's Birth Country: ");
        String country = console.nextLine();
        System.out.print("Author's Birth City: ");
        String city = console.nextLine();
        System.out.print("Author's age: ");
        int age = console.nextInt();
        System.out.print("Number of Books written: ");
        int NumberOfBooks = console.nextInt();
        System.out.print("Is the author writing their next book?(true/false) ");
        boolean nextBook = console.nextBoolean();
        System.out.println();

        System.out.println("Enter details about the book.");
        console.nextLine();
        System.out.print("Book Title: ");
        String bookTitle = console.nextLine();
        System.out.print("Author: ");
        String authorName = console.nextLine();
        System.out.print("Series Title: ");
        String seriesName = console.nextLine();
        System.out.print("How many pages are in the book? ");
        int PageNumbers = console.nextInt();
        System.out.print("How many chapters does it have? ");
        int chapters = console.nextInt();
        System.out.print("Is the book released yet?(true/false) ");
        boolean released = console.nextBoolean();
        System.out.print("Is the book part of a series?(true/false) ");
        boolean series = console.nextBoolean();
        System.out.println();

        Author authorContents = new Author(name, country, city, age, NumberOfBooks, nextBook);
        Book bookContents = new Book(bookTitle, authorName, seriesName, PageNumbers, chapters, released, series);

        System.out.print("How many pages can you read in an hour? ");
        int rate = console.nextInt();
        System.out.println("It will take about " + bookContents.estimatedReadingTime(rate) +
                "h to finish your book.");
        System.out.println();
        System.out.println("Is the Author and the Book Author the same?");

        if(bookContents.checkIfAuthorWrote(authorContents)){
            System.out.println("They are the same author.");
        } else {
            System.out.println("They are not the same author.");
        }

        System.out.println();

        System.out.print("Do you want to enter in another Author? ");
        String another = console.next();
        System.out.println();
        if (another.equals("yes")){
            console.nextLine();
            System.out.print("Author's Name: ");
            String name2 = console.nextLine();
            authorContents.setName(name2);
            System.out.print("Author's Birth Country: ");
            String country2 = console.nextLine();
            authorContents.setBirthCountry(country2);
            System.out.print("Author's Birth City: ");
            String city2 = console.nextLine();
            authorContents.setBirthCity(city2);
            System.out.print("Author's age: ");
            int age2 = console.nextInt();
            authorContents.setAge(age2);
            System.out.print("Number of Books written: ");
            int NumberOfBooks2 = console.nextInt();
            authorContents.setBookCount(NumberOfBooks2);
            System.out.print("Is the author writing their next book?(true/false) ");
            boolean nextBook2 = console.nextBoolean();
            authorContents.setIsWritingNextBook(nextBook2);
            System.out.println();

            if (bookContents.checkIfAuthorWrote(authorContents)) {
                System.out.println("They are the same author.");
            } else {
                System.out.println("They are not the same author.");
            }

        } else {
            System.out.println("Have fun reading!");
        }
    }
}
