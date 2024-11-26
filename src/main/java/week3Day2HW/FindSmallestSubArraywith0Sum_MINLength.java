package week3Day2HW;

import java.util.HashMap;

import org.testng.annotations.Test;

public class FindSmallestSubArraywith0Sum_MINLength {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? integer (maxKNum)
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* {34,23,1,24,75,33,54,8}; k = 60;
	* 38,23,1,24,75,33,54,8; k = 60;
	* {61,62}; k = 60;
	* {0,60} ; k = 60;
	* {1}; k =60;
	* {}; k = 60;
	* 
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
	* BruteForce with nested loops. - That is still fine, proceed to solve by what you know !!
	* 
	* 6) If you know alternate solutions -> find out the O Notations
	* (Performance)
	* Time : O(N)
	* Space: O(1)
	* 
	* Then, explain either both or the best (depends on the time)
	* 
	* Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	* Approach 2: Write down the options and benefits and code the best
	* 
	* 7) Start always with Psuedo code // Two Pointer
	* 
	* 
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	
/* - Initialise hashmap//hashset also works because values is not necessary. only boolean return.
* iterate the array and load entries
* before adding check if nums[i] is already there and i-map.get(nums[i])<k
*	- if yes return true
*	- else update
*
*return false
 * 
 */
	@Test
	public static void Test1() {
		int[] inputArray = {4, 2, -3, 1, 6};
		
		int isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	} 
	
	@Test
	public static void Test2() {
		int[] inputArray = {4, 2, 0, 1, 6};
		
		int isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	} 
	@Test
	public static void Test3() {
		int[] inputArray = {-3, 2, 3, 1, 6};
		
		int isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	}
	@Test
	public static void Test4() {
		int[] inputArray = {0};
		
		int isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	}
	@Test
	public static void Test5() {
		int[] inputArray = {15,-2,2,-8,1,7,10,23};
		
		int isPresent = findsubArray0Sum(inputArray);
		System.out.println(isPresent);
		
	}
	
	public static int findsubArray0Sum(int[] nums) {
	 
		int sum = 0, minLen = Integer.MAX_VALUE; //check what should we return if no subarrays at all.
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(0, -1);
		
		for(int i=0;i<nums.length;i++){
			
			sum += nums[i];
			
			if(map.containsKey(sum)) {
				
				minLen = Math.min(minLen, i - map.get(sum));
			}
			else {
			map.put(sum, i);
			}
		}
			return minLen;
}
}

