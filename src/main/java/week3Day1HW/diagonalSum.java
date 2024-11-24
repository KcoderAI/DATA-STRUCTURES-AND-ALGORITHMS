package week3Day1HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class diagonalSum {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? integer (diagonalSum)
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* 
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
	
	@Test
	public static void Test1() {
		int[][] inputNums={{1,2,3},{4,5,6},{7,8,9}};
		int diagonalSum = twoDArray(inputNums);
		System.out.println(diagonalSum);
	}	
	

	public static int twoDArray(int[][] nums) {
	
    int sum=0;
    int n = nums.length;
    
    for (int i=0;i<n;i++){
       
            sum += nums[i][i] + nums[i][n-1-i];
                       
           }
    if(n % 2 != 0) {
    	sum = sum - nums[n/2][n/2];
    }
    System.out.println(Arrays.deepToString(nums));
    
    return sum;
    
}
}
