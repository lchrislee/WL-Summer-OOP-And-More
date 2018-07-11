## Tasks

1. Create mutator methods for the two classes.
    1. Add getters for every member variable for both the Author class and the
    Book class.
    2. Add setters for every member variable for both the Author class and the
    Book class.
2. Extend functionality for the Book class.
    1. Add a new method to the Book class. Name it "checkIfAuthorWrote". That
    method should take in an Author object. In that method, confirm whether the
    book was written by the Author and return the result.
    2. Add a new method to the Book class. Name it "estimateReadingTime". That
    method should take in the rate that someone reads. Assume the rate is the
    number of pages read in an hour. Return the amount of time it would take to
    finish reading the book at that rate.
3. Create a class to test your functionality.
    1. Create a new class named "BookChecker" and give it a main method.
    2. Ask the user to supply information necessary to create an instance of an
    Author and an instance of a Book that the Author wrote.
    3. Ask the user to provide the information necessary to create another
    Author. Use this author to confirm whether the Book was written by this
    Author.
    4. Ask the user to provide their reading speed (pages per hour). Use this to
    tell the user how long it would take to read the book.