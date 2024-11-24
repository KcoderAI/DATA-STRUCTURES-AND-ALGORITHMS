package week3Day2;

import java.util.HashMap;

import org.testng.annotations.Test;

public class LContainsDuplicate {
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
	* sort it 
	* Initialize pointer left to 0, right to length-1. And tempSum to -1.
	* sum left and right pointer values.
	*  if sum is greater than or equal to k , then decrease right.
	*  if sum is lesser than k, then increase left. Also store it in tempsum, 
	*  by comparing whether recent sum is greater than previous sum.
	*  If recent is the greater sum, then update tempSum with recent sum. 
	*  return tempSum in the end.
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	
/* - Initialise hashmap
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
		int[] inputArray = {1,2,3,1};
		int k = 3;
		boolean isPresent = findDuplicatePair(inputArray, k);
		System.out.println(isPresent);
		
	}
	@Test
	public static void Test2() {
		int[] inputArray = {1,0,1,1};
		int k = 1;
		boolean isPresent = findDuplicatePair(inputArray, k);
		System.out.println(isPresent);
		
	}
	@Test
	public static void Test3() {
		int[] inputArray = {1,2,3,1,2,3};
		int k = 2;
		boolean isPresent = findDuplicatePair(inputArray, k);
		System.out.println(isPresent);
		
	}
	
	
	public static boolean findDuplicatePair(int[] nums, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0;i<nums.length;i++){
			// 
			if(map.containsKey(nums[i])){
			// 
				if(i - (map.get(nums[i])) <= k) {
					return true;
				}
				else {
					map.put(nums[i], i);
				}
			}
			else {
					map.put(nums[i], i);
				}
			
		}
		
		return false;
}
}
