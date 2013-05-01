Object Oriented Bootcamp
===========

A series of assignments intended to bring out principles of OO


Other Bootcampers
===========

* https://github.com/a1russell/bills-bootcamp
* https://github.com/abangser/ooBootCamp


Class notes
===========

26April2013
reviewed Adam's code (graphs are awesome) https://github.com/a1russell/bills-bootcamp
talked about composite pattern in game design https://en.wikipedia.org/wiki/Composite_pattern with fractal rectangles for area location
extension for week three: make Fahrenheit and Celsius work
We paired on the code for a while

16April2013
- On the projector, reviewed/discussed two versions of the code from the most recent prompt
- Discussed next prompt, paired on next prompt for 10 min
- Discussed what our meeting schedule should be: no decision made. Someone schedule something.

The prompt for next week has 3 parts. It is supposed to be like the Google measurement translator
Don't bother taking text input or input from config file; that's not the interesting part. (bill says)
Might want to have a Main that prints all conversions
Possible strategy: start with Main: System.out.println("1 foot is 12 inches") and then start breaking out variables and objects from there
tsp -> tablespoons, tablespoons -> cups (bonus: let it translate transitively and backwards also)
inches -> feet, feet -> yards, inches -> yards (ditto bonus)
Have something intelligent happen when you try to translate tsp to inches, etc. (throw named exception or print error message or something)
Bonus: be able to do "1 cup and 4tbsp in cups is X tbsp"

Bill suggests that we meet up and chat about different approaches to this- half an hour at lunch?

Come to Bootcamp even if you haven't done the homework (this is just my interpretation)

Discussed
Triangulation using tests is good, esp. while learning TDD
Don't duplicate prod logic in the test in order to get the desired comparison value
Don't use parameterized tests unless you have a good excuse, because they're less easy to read
Man it would be cool if Java had named parameters
@Test(expected = AnException.class)
When you need to validate that an object is correct, maybe make a Factory for it, let the Factory throw rather than the object (why? encapsulation?)
Integer is better than int (only use int for performance reasons) because it has compare and equals methods
