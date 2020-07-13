package day1;

public class Factorial {
	
	public static void main(String[] args) {

				// Declare your input number
				int f = 5;
				
				// Declare and initialize an integer variable by name: fact
				
                 int fact=1;
				// Iterate from 1 to your input (tip: using loop concept)
                 
				for(int i=1;i<=f;i++)
				{
            	// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
					
					fact=fact*i;
				}	

				//End of loop
				
System.out.println("Factorial value " + fact);
				// Print factorial (fact)
			
			}

		}

/* What are my learnings from this code?
 * usage of
 * 1)declaring and initializing variable outside the for loop
 * 2)for loop
 * 3) assigning outside for loop
 */


