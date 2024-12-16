package week2Day1HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class L27_Remove_Element {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? integer 
	* Do I have constraints to solve the problem? solve inline
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* {3,2,2,3};
	* 
	* {3,3};
	* {2,2}
	* 
	* val =3;
	* 
	*{ 0,1,2,2,3,0,4,2}
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
	* If index matches the given value increase the count and swap the current index with last index - actual count of val moved back.
	* continue till the length of array minus the total count value(no need to check for the val)
	* find the difference between actual length of the array and the count value. difference is the k value. return this as result.
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
		int[] inputArr = {3,2,2,3};
		int val = 3;
		int count = removeElement(inputArr,val);
		
		System.out.println(count);
	}
	@Test
	public static void Test2() {
		int[] inputArr = {0,1,2,2,3,0,4,2};
		int val = 2;
		int count = removeElement(inputArr,val);
		
		System.out.println(count);
	}
	@Test
	public static void Test3() {
		int[] inputArr = {1};
		int val = 1;
		int count = removeElement(inputArr,val);
		
		System.out.println(count);
	}
	
	
	public static int removeElement(int[] nums, int val) {
	

		int count = 0, i = 0;
		
		while(i <= (nums.length-1) - count) {
			
			if(nums[i]==val) {
			
				nums[i]=nums[(nums.length-1)-count];
			
				nums[(nums.length-1)-count]= -1;
				
				count++;
			}
			else {
				
				i++;
			}
		}
		//Arrays.copyOfRange(nums, 0, i);
		//Arrays.cop
		System.out.println(Arrays.toString(nums));
		return nums.length - count; //or use Arrays.copy
		
	}
	
		
}



/* this works but array is not sorted ,so need extra sort.to avoid used above method. without sort.
 * int j = 0;
		
		if (nums.length == 0) {
			return 0;
		}
		Arrays.sort(nums);
		for (int i = 0; i<=nums.length-1; i++) {
			if(nums[i]!= val) {
				nums[j] = nums[i];
				j++;
				
			}
		}
		
		//for(int k=j; k<=nums.length-1;k++) {
		//	nums[k] = 101;}
		
		System.out.println(Arrays.toString(nums));
		
	    return j;
 */











/* Alternate Solution
  int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
            }
           
        }
        return count;
    }
    */


/*fine tuned this original solution
 * 
		int temp=0,count=0,i=0;
		
		while(i<=(nums.length-1)-count) {
			if(nums[i]==val) {
			//	temp=nums[i];
				nums[i]=nums[(nums.length-1)-count];
			//	nums[(nums.length-1)-count]= temp;
				nums[(nums.length-1)-count]= -1;
				count++;
			}
			else {
				i++;
			}
		}
		
		
		return nums.length-count;
	}
 */




//not working tried with 2 
/*while(p1<p2) {
if (nums[p1]==val) {
	temp = nums[p1];
	nums[p1]=nums[(nums.length-1)-count];
	nums[(nums.length-1)-count]= temp;
	
	count++;
}
else {
	p1++;
}
if(nums[p2]==val) {
	temp = nums[p2];
	nums[p2]=nums[(nums.length-1)-count];
	nums[(nums.length-1)-count]= temp;
	count++;
}
else {
	p2--;
}
}*/