public class PantsSeller
{
	public static void main( String[] args )
	{
		System.out.println("Hello and welcome to our pants store!");
		System.out.println("Please let us know what kind of pants you are looking for!");
		// TODO: Fill in prompts and information to generate a Pants object here.
		System.out.println("Please wait while I check to see if we have something like that in store.");
		PantsStorage storage = new PantsStorage();
		// TODO: Pass the Pants object into the method below.
		if (storage.checkIfPantsInStock()) {
			System.out.println("Why, yes we have some of those pants in stock! Why don't you come back "
							                   + "tomorrow to try them on.");
		} else {
			System.out.println("Sorry, we don't have any of those pants in stock. Try again tomorrow.");
		}
	}
}
