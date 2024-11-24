package week2Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class FindMaxSumRelatesToK {
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
	

	@Test
	public static void Test1() {
		int[] inputArray = {34,23,1,24,75,33,54,8};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//1,8,23,24, 33,34,54,75 //1 8,23,61  60 62 63 64 58 59   //58
	
	@Test
	public static void Test2() {
		int[] inputArray = {34,23,5,24,75,33,54,8};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//59
	@Test
	public static void Test3() {
		int[] inputArray = {61,62};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//-1
	@Test
	public static void Test4() {
		int[] inputArray = {0,60};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//-1
	@Test
	public static void Test5() {
		int[] inputArray = {1};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//-1 
	@Test
	public static void Test6() {
		int[] inputArray = {38,23,1,24,75,33,54,8};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//1,8,23,24, 33,38,54,75 //Middle 57
	@Test
	public static void Test7() {
		int[] inputArray = {};
		int k = 60;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//Empty //-1
	@Test
	public static void Test8() {
		int[] inputArray = {2,39,37,4,10,15,24};
		int k = 40;
		int maxSum = findMaxSumK(inputArray, k);
		System.out.println(maxSum);
		
	}//Empty //-1
	
	
	
	public static int findMaxSumK(int[] inpArray, int k) {
		
		Arrays.sort(inpArray);
		int left = 0;
		int right = inpArray.length-1;
		int tempSum = -1;
		
		while(left < right) {
			
		if((inpArray[right] + inpArray[left]) >= k) {
			
			right--;
			
		}
		//else if (inpArray[right] + inpArray[left] < k) {
		else {
			
			if(tempSum < (inpArray[right] + inpArray[left])) {
				
			tempSum = inpArray[right] + inpArray[left];
			
			}
			
			left++;
		}
		
		}		
		
		
		return tempSum;
		
	}
}















/*
 //max(ans,num1+num2)
 * int left = inpArray.length/2;
		int right = left+1;
 * while(left>=0&&right<=inpArray.length-1) {
			if(inpArray[left] + inpArray[right] < k ) {
				left++;
			}
			else if(inpArray[left] + inpArray[right] >= k ) {
				right--;
			}
			
		}
		*/
