package week2Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class L80_Remove_Duplicates_from_Sorted_Array_II {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? integer array 
	* What is the expected output? integer 
	* Do I have constraints to solve the problem? yes
	* 1 <= nums.length <= 3 * 104
	* -100 <= nums[i] <= 100
	* nums is sorted in non-decreasing order.
	* 
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* {1,1,2};
	* 
	* {0,0,1,1,1,2,2,3,3,4};
	* {-100,-99,-98,0,0,1,1,100,100}
	* {0,0}
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
	* first pointer  to 0
	* second point to 1
	* start comparing both pointers, if (p1!=p2) ,  increment both the pointers p1 and p2. 
	* else
	* increment p2 counter.count++;
	* while(p2<length-1)
	* if (p1==p2)
	*  increment count value.and p2.
	* else
	*    value[p1+1]=value[p2];
	*    p1=p2;
	*    p2 += 1;
	*    break;
	*    
	* once the loop ends,
	* whil(p1<=length-1)
	* fill the remaining index values with -101.
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
		int[] nums = {1,1,2};
		int result = removeDupsFromSortedArr(nums);
		System.out.println(result);
	}
	
	@Test
	public static void Test2() {
		int[] nums = {1,1,1,2,2,3};
		int result = removeDupsFromSortedArr(nums);
		System.out.println(result);
	}
	
	
	@Test
	public static void Test3() {
		int[] nums = {0,0,1,1,1,1,2,3,3};
		int result = removeDupsFromSortedArr(nums);
		System.out.println(result);
	}
	@Test
	public static void Test4() {
		int[] nums = {0,0};
		int result = removeDupsFromSortedArr(nums);
		System.out.println(result);
	}
	
	public static int removeDupsFromSortedArr(int[] nums) {
		
		int j = 1;
		int count = 1;
		
		if (nums.length == 0) {
			return 0;
		}
		
		for (int i = 0; i<nums.length-1; i++) {//1,1,1,2,2,3
			
			if(nums[i]!=nums[i+1] ) {
				nums[j] = nums[i+1];
				j++;
				count = 1;
				
			}
			else if (nums[i]==nums[i+1] ) {
				if(count==1)
				{
					nums[j]=nums[i+1];
					j++;
				}
				
				
				count++;
		}
		}
		for(int k=j; k<=nums.length-1;k++) {
			nums[k] = 101;}
		
		System.out.println(Arrays.toString(nums));
		
	    return j;
		
	}
	
}

/*Alternate solution: check it out
 * int i=0;
        for(int n:nums)    
        {
            if(i<2 || n!=nums[i-2])
            {
                nums[i++]=n;
            }
        }
        return i;
 */


