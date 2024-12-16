package Assessment1;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MergeArraysInPlace {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? int arrays 
	* What is the expected output? int Array
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
	* Output: [1,2,2,3,5,6]

	* Input: nums1 = [1], m = 1, nums2 = [], n = 0
	* Output: [1]
	* 
	* Input: nums1 = [0], m = 0, nums2 = [1], n = 1
	* Output: [1]
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
	 * set three pointers p1 to m-1 and p2 to nums2.length-1, and idx = num1.length-1.
	 * Process until p2 > 0  * p1 > 0  , verify 
	 * if nums[p1] <= nums[p2],  then place nums[idx] = nums[p2]. decrement p2 and idx.
	 * else place nums[idx] = nums[p1]. decrement p1 and idx.
	 * At the end of the loop, verify p2 is still >=0, then fill the remaining nums[p2] values to num1[idx](decrement
	 * idx and p2) process until p2>=0.
	 * 
	 */
	/*Big O Notations
	 * Time Complexity : O(m+n) (m and n input lengths)
	 * Space Complexity : O(1) 
	 */
	
	//Unit Tests
	@Test
	public static void Test1() {
		int[] inpArray1 = {1,2,3,0,0,0};
		int m = 3;
		int[] inpArray2 = {2,5,6};
		int n = 3;
		mergeSort(inpArray1,m,inpArray2,n);
	    System.out.println(Arrays.toString(inpArray1));
	}
	@Test
	public static void Test2() {
		int[] inpArray1 = {1};
		int m = 1;
		int[] inpArray2 = {};
		int n = 0;
		mergeSort(inpArray1,m,inpArray2,n);
	    System.out.println(Arrays.toString(inpArray1));
	}
	@Test
	public static void Test3() {
		int[] inpArray1 = {0};
		int m = 0;
		int[] inpArray2 = {1};
		int n = 1;
		mergeSort(inpArray1,m,inpArray2,n);
	    System.out.println(Arrays.toString(inpArray1));
	}
	
	// Code
	
	public static void mergeSort(int[] nums1, int m, int[] nums2,int n) {	

		int idx = nums1.length-1;
		int p1= m-1;
		int p2=n-1;
		
		while(p1>=0 && p2>=0) {
			if(nums1[p1]<=nums2[p2]) {
				nums1[idx]=nums2[p2];
				p2--;
				idx--;
			}
			else if(nums1[p1]>nums2[p2]) {
				nums1[idx]=nums1[p1];
				p1--;
				idx--;
			}
			
		}
		
		while(p2>=0) {
			nums1[idx]=nums2[p2];
			p2--;
			idx--;
		}
			
	
	}
	
}
