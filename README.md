Object Oriented Bootcamp
===========

A series of assignments intended to bring out principles of OO

Bootcampers
===========

* https://github.com/a1russell/bills-bootcamp
* https://github.com/abangser/ooBootCamp
* https://github.com/BillSchofield/Quantity
* https://github.com/compwron/OOBootcamp/


Prompt: Collections
===========

* Given a collection of integers (you can use ArrayList or [] or anything),
* * find the largest value
* * find the smallest value
* * don't use any libraries
* Ditto for strings (by alphabetical)
* Find biggest number not over given number (how does that translate to strings?)
* Compare graphRectangles (on area) (using existing graphRectangle class)


Prompt: Translation
===========

* Don't bother taking text input or input from config file; that's not the interesting part. (bill says)
* Might want to have a Main that prints all conversions
* Possible strategy: start with Main: System.out.println("1 foot is 12 inches") and then start breaking out variables and objects from there
* tsp -> tablespoons, tablespoons -> cups (bonus: let it translate transitively and backwards also)
* inches -> feet, feet -> yards, inches -> yards (ditto bonus)
* Have something intelligent happen when you try to translate tsp to inches, etc. (throw named exception or print error message or something)
* Bonus: be able to do "1 cup and 4tbsp in cups is X tbsp"
* Make Fahrenheit and Celsius work (more complicated because there is both addition and multiplication in the translation)


Prompt: Rectangle
===========

*  Given a list of graphRectangles, sum the areas.
*  Answer the question - is a point inside a given graphRectangle? Reference algorithm: http://stackoverflow.com/questions/2752725/finding-whether-a-point-lies-inside-a-graphRectangle-or-not

Prompt: Shopping List
===========

*  Make a shopping list with quantities and names which, if you add 1 cup of sugar, 1 banana, and 1 cup of sugar, ends up with 2 cups of sugar and 1 banana. Use Java 7 (no libraries or Java 8- the point is to implement, not to make the language do it for you)


Class notes
===========

1May2013
Reviewed bootcampers' code
Talked about convergent design caused by TDD
Reviewed composite units
Upcoming: a series of work on collections
Explanation of how hashcode and equals work
Discussion of enum vs. static class vs. global variables
Discussion of toString() vs displayValue() or equivalent (what if different accessors want a different text form of the data?) - in this case, don't use toString()
Flexible code is better than performant code because flexible code can be understood well enough to make it easily performant (i.e. threading, caching)
Adam's code is cool, it uses Java 8.1 lambdas

26April2013
reviewed bootcampers' code (graphs are awesome) https://github.com/a1russell/bills-bootcamp
talked about composite pattern in game design https://en.wikipedia.org/wiki/Composite_pattern with fractal graphRectangles for area location
extension for week three: make Fahrenheit and Celsius work
We paired on the code for a while

16April2013
- On the projector, reviewed/discussed two versions of the code from the most recent prompt
- Discussed next prompt, paired on next prompt for 10 min
- Discussed what our meeting schedule should be: no decision made. Someone schedule something.

Discussed
Triangulation using tests is good, esp. while learning TDD
Don't duplicate prod logic in the test in order to get the desired comparison value
Don't use parameterized tests unless you have a good excuse, because they're less easy to read
Man it would be cool if Java had named parameters
@Test(expected = AnException.class)
When you need to validate that an object is correct, maybe make a Factory for it, let the Factory throw rather than the object (why? encapsulation?)
Integer is better than int (only use int for performance reasons) because it has compare and equals methods
