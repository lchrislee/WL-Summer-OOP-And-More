public class PantsStorage
{
	private boolean mHasPantsYouAreLookingFor = false;

	// TODO: Accept a Pants object in this method.
	public boolean checkIfPantsInStock() {
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// Someone interrupted me!
			System.out.println("Oh no, my people need me!");
		} finally {
			return mHasPantsYouAreLookingFor;
		}
	}
}
