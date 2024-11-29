package week3Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class L189_Rotate_Array {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? int array 
	* What is the expected output? int array
	* Do I have constraints to solve the problem? inplace
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* * Input: nums = [1,2,3,4,5,6,7], k = 3
	*Output: [5,6,7,1,2,3,4]
	*
	*
	*Input: nums = [-1,-100,3,99], k = 2
	*Output: [3,99,-1,-100]
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
		int[] inpArray = {1,2,3,4,5,6,7};
		int k = 3;
		System.out.println(Arrays.toString(rotateArray(inpArray,k)));
	}
	
	@Test
	public static void Test2() {
		int[] inpArray = {-1,-100,3,99};
		int k = 2;
		System.out.println(Arrays.toString(rotateArray(inpArray,k)));
	}
	
	public static int[] rotateArray(int[] nums, int k) {
		
		 k = k % nums.length;  
	     reverse(nums, 0, nums.length - 1); 
	     reverse(nums, 0, k - 1); 
	     reverse(nums, k, nums.length - 1); 
	     return nums;
	   } 
	private static void reverse(int[] nums, int start, int end) {
	    while (start < end) { 
	    int temp = nums[start]; 
	    nums[start] = nums[end]; 
	    nums[end] = temp; 
	    start++; 
	    end--;
	      }
	 }
}

/*Alternate solutions
 * k = k % nums.length;
 * for(int i=1; i<=k;i++) {
			rotateright(nums);
		}
		
		return nums;
	}
	
	public static void rotateright(int[] tempArray) {
		int temp = tempArray[tempArray.length-1];
		for(int i = tempArray.length-1;i>0;i--) {
			tempArray[i] = tempArray[i-1];
		}
		tempArray[0] = temp;
	}*///For large inputs time limit exceeded.







/*
 * public void rotate(int[] nums, int k) {
      k = k % nums.length; // In case k is greater than array length 
      reverse(nums, 0, nums.length - 1); // Step 1: Reverse the entire array
       reverse(nums, 0, k - 1); // Step 2: Reverse the first k elements 
       reverse(nums, k, nums.length - 1); // Step 3: Reverse the remaining elements 
       } 
       private void reverse(int[] nums, int start, int end) {
         while (start < end) { 
            int temp = nums[start]; 
            nums[start] = nums[end]; 
            nums[end] = temp; 
            start++; 
            end--;
             }
    }
}*/

