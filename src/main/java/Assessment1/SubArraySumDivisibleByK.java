package Assessment1;

import java.util.HashMap;

import org.testng.annotations.Test;

public class SubArraySumDivisibleByK {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? int array and int
	* What is the expected output? int 
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Input: nums1 = {4,5,0,-2,-3,1};k = 5;
	* Output: 7

	* Input: nums1 = [5], k = 9
	* Output: 0
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
	* Space: O(k)
	* 
	* Then, explain either both or the best (depends on the time)
	* 
	* Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	* Approach 2: Write down the options and benefits and code the best
	* 
	* 7) Start always with Psuedo code // 
	* 
	* 
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	
	
	/*Psuedo code. 
	 * Initialize Map : To handle edge cases
	 * Iterate the array and calculate prefixSum. 
	 * Calculate remainder(rem) using modulo function for prefix sum % k.
	 * check if map already has this rem, if not add and initialize count to 1. if already present, increment count.
	 * for negative remainder, subtract the rem with k, so map contains 0 to k range values only. 
	 * 
	 * 
	 */
	/*Big O Notations
	 * Time Complexity : O(n)
	 * Space Complexity : O(k) (for hashmap)
	 */
	
	//Unit Tests
	
	@Test
	public static void Test1() {
		int[] inpArray = {4,5,0,-2,-3,1};
		int k = 5;
		int result = findSubarrSumDivisibleByK(inpArray, k);
		System.out.println(result);
	}
	
	@Test
	public static void Test2() {
		int[] inpArray = {5};
		int k = 9;
		int result = findSubarrSumDivisibleByK(inpArray, k);
		System.out.println(result);
	}
	
	// Code
	public static int findSubarrSumDivisibleByK(int[] nums, int k) {
		
		 HashMap<Integer,Integer> map = new HashMap<>();
		 
		 map.put(0, 1); //Initialize to 0 to handle edge cases.
		 
		 int prefixSum = 0, result = 0;
		 
		 for( int i = 0; i < nums.length; i++) {
		
			 prefixSum += nums[i];
			 int rem = prefixSum % k;
			 
			 if(rem < 0) { // range should always be 0 to k.
				 rem += k;
			 }
			 
			 if(map.containsKey(rem)) {
			
				 result += map.get(rem);
			 
			 }
			 
			 map.put(rem, map.getOrDefault(rem, 0) +1);
		 }
		 
		 
		return result;
	}
}
