import java.util.*;
public class PantsSeller
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Hello and welcome to our pants store!");
        System.out.println("Please let us know what kind of pants you are looking for!");
        // TODO: Fill in prompts and information to generate a Pants object here.
        System.out.print("What type of pants are you looking for? ");
        String type = console.next();
        System.out.print("What color do you want? ");
        String color = console.next();
        System.out.print("Does the pants you want have a front zipper?(True/False) ");
        boolean hasFrontZipper = console.nextBoolean();
        System.out.print("How long are the pants you are looking for? ");
        double length = console.nextDouble();
        System.out.print("How wide are the pants you are looking? ");
        double width = console.nextDouble();
        Pants pants = new Pants(type,color,hasFrontZipper,length,width);
        System.out.println("Please wait while I check to see if we have something like that in store.");
        PantsStorage storage = new PantsStorage();
        // TODO: Pass the Pants object into the method below.
        if (storage.checkIfPantsInStock(pants)) {
            System.out.println("Why, yes we have some of those pants in stock! Why don't you come back "
                    + "tomorrow to try them on.");
        } else {
            System.out.println("Sorry, we don't have any of those pants in stock. Try again tomorrow.");
        }
    }
}
