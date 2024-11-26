package week3Day2;

import java.util.Arrays;
import java.util.HashMap;

import org.testng.annotations.Test;

public class TwoSumUsingHashing {
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
	//this two sum problem returns the indices of the 2 integers whose sum is equal to target using hashing. Both TC & SC is O(n).
	
	@Test
	public static void Test1() {
		int[] inputArr = {2,7,11,15};
		int target = 9;
		
		System.out.println(Arrays.toString(distinctNums(inputArr,target)));
	}
	
	@Test
	public static void Test2() {
		int[] inputArr = {2,3,4};
		int target = 6;
		
		System.out.println(Arrays.toString(distinctNums(inputArr,target)));
	}
	
	@Test
	public static void Test3() {
		int[] inputArr = {-1,0};
		int target = -1;
		System.out.println(Arrays.toString(distinctNums(inputArr,target)));
	}
	@Test
	public static void Test4() {
		int[] inputArr = {5,25,75};
		int target = 100;
		System.out.println(Arrays.toString(distinctNums(inputArr,target)));
	}
	
	public static int[] distinctNums(int[] nums, int target) {
		
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		
		for (int i = 0; i<nums.length; i++){
			
			if(hashMap.containsKey(target-nums[i])) {
				
				return new int[] {hashMap.get(target-nums[i]),i};
				
			}
			hashMap.put(nums[i], i);
		}
		
		
		return new int[] {-1,-1};
	} 
	
}
