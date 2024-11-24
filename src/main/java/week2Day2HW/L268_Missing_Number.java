package week2Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class L268_Missing_Number {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? int array 
	* What is the expected output? int (missing number)
	* Do I have constraints to solve the problem? All the numbers of nums are unique.
 	* 
	*
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* [3,0,1]
	* [0,1]
	* 
	*  [9,6,4,2,3,5,7,0,1]
	* 
	* 
	* 
	* 
	* 
	* Validate with the interviewer if the data set is fine by his/her assumptions
	* 
	* 3) Do I know how to solve it?
	* yes using two pointers
	* Yes - great, is there an alternate?
	* brute force
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
	* use two pointers
	* first pointer  index starts from 0
	* second pointer is the index from int array to check the value
	* If first pointer and the second pointer index value not matches then that is the missing number.
	* 
	* * 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	
	@Test
	public static void Test1() {
		int[] inputArray = {3,0,1};
		int missingNumber = findMissingNumber(inputArray);
		System.out.println(missingNumber);
	}

	public static int findMissingNumber(int[] nums) {
		
		Arrays.sort(nums);
		int j = 0;
		
		for(int i =0; i<nums.length;i++) {
			
			if (nums[i] != j) {
			return j;
		  }
			j++;
		}	
		
		
		return -1;
	}
}

