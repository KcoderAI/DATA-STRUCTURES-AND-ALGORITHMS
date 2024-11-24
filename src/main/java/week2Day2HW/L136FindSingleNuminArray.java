package week2Day2HW;

import org.testng.annotations.Test;

public class L136FindSingleNuminArray {
	
	/*
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? Integer array 
	* What is the expected output? Integer array/ empty 
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! 
	// * How big is your test data set will be?
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* {2,3,3,4,5}
	* {3}
	* {2,4,5}
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
	* Take the array 
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* 
	*/
	//1.https://leetcode.com/problems/single-number/description/ (ignore the constraint to solve in linear runtime complexity)
	//2.https://leetcode.com/problems/majority-element/description
	//3.given an integer array arr, count how many elements x there are, such that x+1 is also in arr.
	//If there are duplicates in arr, count them separately.
	// example 1 : input = [1,2,3] output =2 ; explanation = when x is 1, we see x+1(2) is present in input
	//when x is 2, we see x+1 (3) is present in input. when x is 3, x+1(4) is not present.
	//example 2 : input = [1,1,3,3,5,5,7,7]; output=0.
	//example 3: input = [1,1,2]; output=2;
	//Week2Day1 : (There are other session problems too find it)
	//https://leetcode.com/problems/move-zeroes/description/
	//https://leetcode.com/problems/palindrome-number/description/
	//Week2Day2:(There are other session problems too find it)
	//1. https://leetcode.com/problems/power-of-three/description/
	//2. https://leetcode.com/problems/squares-of-a-sorted-array/
	//3. https://leetcode.com/problems/climbing-stairs/
	//4. https://leetcode.com/problems/distribute-candies/description/
	@Test
	public static void Test1() {
		int[] inputArray = {7,7,7,8,7};
		int result = findSingleNum(inputArray);
		System.out.println(result);
	}
		
	public static int findSingleNum(int[] inputArray) {
	
	int xor = 0;
    for (int num : inputArray) {
        xor ^= num;
       
    }
    
    return xor;
	
	}
    
    
}
    
    
    
    
    
    
    
/*    Arrays.sort(nums);

    for(int i = 0; i < nums.length - 1; i++){
        if(nums[i] != nums[i + 1]) return nums[i];
        i++;
    }

    return nums[nums.length - 1];
}*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/*	Arrays.sort(inputArray);
	//boolean isFirstElement = true;
	for(int i=0;i<inputArray.length;i+=2)
	{           
				if (i==inputArray.length-1)
				{
					System.out.println(inputArray[i]);
					break;
				}
				else if (inputArray[i]!=inputArray[i+1])
				{
				 System.out.println(inputArray[i]);
				break;
				}					 
	  
	}*/

