package week3Day2HW;

import java.util.HashMap;

import org.testng.annotations.Test;

public class L560_Subarray_Sum_Equals_K {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? integer (maxKSum)
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* * 
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
	* Space: O(N)
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
	/*PsuedoCode:
	 * Define HAshmap. Initialize it with Key 0 and value 1. iterate through the input array, calculate prefixSum and add the PREFIX SUM as key in the map and count as value.
	 * Before adding, find sum-k = index value, if index value is present in the map, add it to the result. increment counter value and put it in the map both if else cases using getdefault.
	 * return result. 
	 */
	@Test
	public static void Test1() {
		int[] inpArray = {1,1,1};
		int k =2;
		int result = findSubarraySumEqualsK(inpArray, k);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		int[] inpArray = {1,2,3};
		int k =3;
		int result = findSubarraySumEqualsK(inpArray, k);
		System.out.println(result);
	}
	
	public static int findSubarraySumEqualsK(int[] nums, int k) {
		
		 HashMap<Integer,Integer> map = new HashMap<>();
		 
		 map.put(0, 1); //Initialize to 0 to handle edge cases.
		 
		 int prefixSum = 0, result = 0;
		 
		 for( int i = 0; i < nums.length; i++) {
		
			 prefixSum += nums[i];
			 
			 if(map.containsKey(prefixSum - k)) {
			
				 result += map.get(prefixSum-k);
			 
			 }
			 
			 map.put(prefixSum, map.getOrDefault(prefixSum, 0) +1);
		 }
		 
		 
		return result;
	}
}
