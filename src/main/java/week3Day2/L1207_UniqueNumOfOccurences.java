package week3Day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class L1207_UniqueNumOfOccurences {
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
		int[] inputArray = {1,2,2,1,1,3};
		
		boolean isPresent = findDuplicatePair(inputArray);
		System.out.println(isPresent);
		
	}
	@Test
	public static void Test2() {
		int[] inputArray = {1,2};
	// 
	 	boolean isPresent = findDuplicatePair(inputArray);
	 	System.out.println(isPresent);
		
	}
	@Test
	public static void Test3() {
		int[] inputArray = {-3,0,1,-3,1,1,1,-3,10,0};
	 
	 	boolean isPresent = findDuplicatePair(inputArray);
	 	System.out.println(isPresent);
		
	}
	
	
	public static boolean findDuplicatePair(int[] nums) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		//int prevElement = -1001;
		for (int i=0;i<nums.length;i++){
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			
		}
		Set<Integer> occurrences = new HashSet<>(map.values()); 
		return map.values().size() == occurrences.size();
		//return true;
}
}


/*if(map.get(nums[i]).equals(map.get(prevElement)) && prevElement!=-1)  {
	return false;
}
prevElement = nums[i];*/