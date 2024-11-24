package Week2Day1;

public class DynamicArray {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? integer 
	* Do I have constraints to solve the problem? Preserve white space and initial word order
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* {1,5,3,3,4,6,7,7,8};
	* 
	* Validate with the interviewer if the data set is fine by his/her assumptions
	* 
	* 3) Do I know how to solve it?
	* yes
	* Yes - great, is there an alternate?
	* 
	* 4) Ask for hint (If you do not know how to solve)
	* 
	* 5) Do I know alternate solutions as well? 
	* 
	* No - That is still fine, proceed to solve by what you know !!
	* 
	* 6) If you know alternate solutions -> find out the O Notations
	* (Performance)
	* 
	* Then, explain either both or the best (depends on the time)
	* 
	* Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	* Approach 2: Write down the options and benefits and code the best
	* 
	* 7) Start always with Psuedo code // Bruteforce
	* to add
	* check size reached its capacity.
	* if reached. then define a function to resize();
	* and then add.
	* to print.
	* inside for loop. print until the end of array.
	* to delete:
	* find the index of the element to be deleted.
	* and then move whatever is present after this to left side
	* 
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	
	/*private int count =0;
	int[] inpArray = new int[Dynamic Array];
	
	public static void add(int num) {
		if(count==inpArray.length) {
			int[] temp = new temp(inpArray.length*2);
		}
		inpArray = temp;
		inpArray[count] = num;
		count++;
	}
	
	public static void print() {
		for(int i=0; i<inpArray.length;i++) {
			System.err.println(inpArray[i]);
		}
	}
	
	public static void delete(int data) {
		for(int i=0; i<inpArray.length;i++) {
			if(inpArray[i]==data) {
				index =i;
				isNotFound = False;
			}
			if(isNotFound) {
				System.out.println("Element not found");
			}
			else {
				for(int i= index;i<inpArray.length;i++)
				inpArray[i]=inpArray[i+1];
				
			}
			inpArray[length-1]=0;
			count--;
				
		}
	}*/
}
