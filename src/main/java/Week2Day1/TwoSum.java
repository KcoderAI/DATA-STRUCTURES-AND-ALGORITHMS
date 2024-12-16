package Week2Day1;

import java.util.Arrays;

import org.testng.annotations.Test;

public class TwoSum {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? Array 
	* Do I have constraints to solve the problem? Preserve white space and initial word order
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* {1,5,3,3,4,6,7,7,8};
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
	* 
	* compare first and next element if distinct increase count
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	@Test
	public static void Test0() {
		int[] inputArr = {3,2,4};
		int target = 6;
		System.out.println(Arrays.toString(distinctNums(inputArr,target)));
	}
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
	
	public static int[] distinctNums(int[] inputArr, int target) {
		
		
		int left =0;
		int right = inputArr.length-1;
		int[] outputArr = {-1,-1};
		while(left<right) {
			
			if((inputArr[left]+inputArr[right])==target) {
				outputArr[0]=left;
				outputArr[1]=right;
				return outputArr;
			}
			else if((inputArr[left]+inputArr[right])>target){
				right--;
			}
			else if((inputArr[left]+inputArr[right])<target){
				left++;
			}
		}
		
		return outputArr;
	}
	

}


