package randomProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

public class PrintAllSubArrayswith0Sum_InterviewQA {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? print subarray indexes
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* 	* 
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
	* Time : O(N+k) k is the worst case k sub arrays.
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
	
/* - Initialise hashmap , add default entry to handle edge case.
 * Hashmap: key is sum, and value is list of indices(since more than one subarray can have 0)
* iterate the array and calculate sum
* if sum is already present, create a list with values from map for the current sum. in for loop, print all the index start 
* as from and to as current index.
* if sum is not already present, then create a list and add this index into the list. and then using map.put add the sum and
* newly created list to map.
*
 * 
 */
	
	
	
	
	@Test
	public static void Test5() {
		int[] inputArray = {6,3,-1,-3,4,-2,2,4,6,-12,-7};
		
		findsubArray0Sum(inputArray);
		//System.out.println(isPresent);
		
	}//{-1,-3,4}{-1,-3,4,-2,2},{4,-2,2}{-2,2}{2,4,6,-12}{6,3,-1,-3,4,-2,2,4,6,-12,-7}
	//0 6 9 8 5 9 7 9 13 19 7 0
	
	public static void findsubArray0Sum(int[] nums) {
	 
	int sum = 0;
	
	HashMap<Integer, List<Integer>> map = new HashMap<>(); 
	
	map.put(0, new ArrayList<>());
	map.get(0).add(-1);
	
	for(int i=0;i<nums.length;i++){ //o(n)
		
		sum += nums[i];
		
		if(map.containsKey(sum)) {
			
			List<Integer> newIndex = map.get(sum); 
			for(int index : newIndex) {   // O(m) - m is total number of indexes for current sum.
				System.out.println("SubArray found from Index " + (index+1) + " to " + i);
			}
			map.get(sum).add(i);
		
		}
		else {
			List<Integer> arrayList = new ArrayList<>(); 
			arrayList.add(i);
			map.put(sum, arrayList);
		}
		
		
		}
		
}
}


