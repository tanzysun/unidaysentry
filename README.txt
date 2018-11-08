# unidaysentry

Project: Unidays placement entry challenge
Author: Tanzy (Jingxin) Sun

How to run the code:
To run the code, the test file must be included as well, the test class demonstrates the different outcomes of the main class, such as the different delivery types. 
The pricing is included within the test class as so:
  // pricing for items in itemList
		int pricing[] = { 8, 12, 4, 7, 5 };
  // no delivery charge
		UnidaysDiscountChallenge example1 = new UnidaysDiscountChallenge(pricing);
So pricing can be passed in to the UnidaysDiscountChallenge constructor, and changed when needed. Also the itemList array (in main class) can be changed and are referenced as A through E, however discounts cannot be changed as interpreted. After running, there will be 3 toString print outs to console to display total, delivery charges and overall total of the basket.


How I approached the problem:
As a start, I broke up the problem into small manageable sections on paper. I also calculated all the maths for the discount deals on 
paper first and had it thoroughly checked before I started coding. Once I had it all mapped out, I planned out the pseudocode for each section, and then I coded a simple test class that would test the delivery charges from the main class (but with only 1 item in basket). After, I wrote out the pseudocode in java for the main class to complete the test class, I also extended the test class to test the delivery charges for different combinations of items in basket, as well as editing and improving code from the main class to fit the test class better. Completing the challenge this way allowed me to work through the problem slowly but logically, checking to see if the tests passed as I went along. If any tests were to fail, it was easy to spot were it had failed in the main class, and I revised any broken code so it would pass again. Furthermore, commenting what each chunk of code does helped me to keep track of things and understand my code better, as well as making debugging easier.
