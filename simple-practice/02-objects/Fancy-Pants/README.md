## Tasks

1. A Pants class
    1. Create a class named "Pants".
    2. Decide on some important data that all pants should have. Add them as
    member variables to the Pants class.
        - An example could be a boolean mHasFrontZipper.
    3. Create an appropriate constructor for the Pants class.
    4. Create the appropriate accessor methods for the member variables.
2. A class to check for Pants.
	1. Open the "PantsStorage" class.
	2. In the existing method "checkIfPantsInStock" (the TODO), modify the
	signature to accept a Pants object. You do not need to understand what this
	method does.
3. A class to test with.
	1. Open the "PantsSeller" class.
	2. At the first TODO, prompt the user for information to make an instance of
	your pants class.
	3. For the second TODO, make sure to pass in the Pants object created above
	to the PantsStorage instance's "checkIfPantsInStock" call.