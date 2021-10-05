# Lab 2
### Maniulating Arrays

#### Objective: To gain proficiency implementing one-dimensional *built-in arrays*.

#### Part I
Your program should begin by prompting the user for an array size, an integer naturally.  Declare a built-in array of that size and then prompt the user again, this time for an ineger value for each array location.  Now call your display method to show the user what has been entered.

#### Part II
Write a menu method with the 5 methods below that performs the tasks on that single 1-D int array. Each task should be a separate method  (the name of the method is in italics).  

 
1. *display* the array’s length as well as its indices and elements.       	
 
2. *search* whether a value entered by the user is in the array.  If found, it should give the **first** position it is found at only; if  not found, it should display an appropriate message.  The repeating of the method should occur in your menu not the *search* method.
 
3. Find the *smallest* element and exchange it with the first element, then display the array.
 
4. *rotate* the array by a given number of steps.  A positive number of steps rotates the array forward; a negative number of steps, backward.  The repeating of the method should occur in your menu not the *rotate* method. 

5. *delete* all zero elements from the current array, updating the length.  This is a permanent change to the array size.

#### Notes
* No auxiliary, or class arrays should be used.
* The delete all zeros method will require a new array to change the size before being returned.  
* The menu naturally should repeat until the user chooses to quit (option 0).  
* You must match the formatting shown in the samp[le run. See printf reference for help with this.
* numbers will be 2-digits max.
* The items in the Menu can be called in any order and all changes are permanent to ther array.
* Reminder you may only use the knowledge of things we have discussed in class.