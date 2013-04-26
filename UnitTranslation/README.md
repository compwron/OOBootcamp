Prompt
===========

It is supposed to be like the Google measurement translator

Don't bother taking text input or input from config file; that's not the interesting part.

Might want to have a Main that prints all conversions

1.  tsp -> tablespoons, tablespoons -> cups (bonus: let it translate transitively and backwards also) (3tsp == 1Tbsp, 16Tbsp == 1cup)
2.  inches -> feet, feet -> yards, inches -> yards (ditto bonus)
3.  Have something intelligent happen when you try to translate tsp to inches, etc. (throw named exception or print error message or something)
4.  Bonus: be able to do "1 cup and 4tbsp is X tbsp" (Assumption: always return result in last unit given)
5.  Bonus if you're done with the above: Fahrenheit -> Celsius and backwards
6.  (me) Add a list of different values

TODO:
store in base units