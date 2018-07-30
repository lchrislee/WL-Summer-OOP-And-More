## Tasks

1. A Point class
    1. Create a class named "Point".
    2. Give the `Point` class two member variables, one for x and one for y
       coordinates.
    3. Give the `Point` class any methods necessary.
2. A Shape class
    1. Create a class named "Shape".
    2. Give the `Shape` class an array of `Point`s. Shapes can have any number
       of points, so we should wait to tell the size of the array until we know.
    3. Give the `Shape` class a constructor that takes in the number of `Point`s
       that it should have. Inside the constructor, make your `Point` array that
       size.
3. A class to run
    1. Create a class to run this program from, name it whatever you like
       (suggested is ShapeRunner).
    2. Ask the user for information to create a `Shape` object. Also request
       for every `Point` necessary for the `Shape`.
    3. Once the `Shape` is created fully, tell the user the total area that the
       `Shape` should hold. You should use a generic algorithm that works for
       every `Shape`.