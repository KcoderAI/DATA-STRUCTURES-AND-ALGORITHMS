package week3Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class G_AlternatePositiveAndNegative {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? array 
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* Input: nums = [9, 4, -2, -1, 5, 0, -5, -3, 2]]
	* Output:[9, -2, 4, -1, 5, -5, 0, -3, 2]
	* 
	* Input: nums = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
	* Output:[5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
	* 
	* Input: nums = [9, 5, -2, -1, 5, 0, -5, -3, 2]
	* Output: [9, -2, 5, -1, 5, -5, 0, -3, 2]
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
	/*PsuedoCode:Two Pointers
	 * initialize i and j to 0.
	 *first element should be positive.i is slow pointer. j is fast pointer.
	 * 
	 * if idx modulo 2 is 0, then store positive.
	 * 			if nums[idx] is positive then continue;
	 * 			else store nums[idx] value in temp.set j =idx++;
	 * 			while(nums[j]>=0| j != nums.length){
	 * 			j++;
	 * }
	 * if(j==nums.length){
	 * return nums;
	 * }
	 * 		    store nums[idx] = nums[j];
	 * 			idx++;
	 * 			nums[idx] = temp;
	 * }
	 * 	
	 * 					 
	 * if idx modulo 2 is >0 then negative value.
	 * if(nums[idx]) is negative then continue.
	 * else store nums[idx] value in temp. set j = idx++;
	 * while(nums[j]<0 || j != nums.length)
	 * j++;
	 * if(j==nums.length){
	 * return nums;
	 * }
	 * store nums[idx] = nums[j];
	 * idx++;
	 * nums[idx]=temp;
	 * 
	 * return nums;
	 *
	 *
	 *
	 *
	 *
	 */
	@Test
	public static void Test1() {
		int[] inpArray = {9, 4, -2, -1, 5, 0, -5, -3, 2};
		
		int[] result = alternateArrange(inpArray);
		System.out.println(Arrays.toString(result));
	}
	
	@Test
	public static void Test2() {
		int[] inpArray = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		
		int[] result = alternateArrange(inpArray);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] alternateArrange(int[] nums) {
		int n = nums.length; // Start with finding the next misplaced element
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0 && nums[i] < 0) { 
				// Find the next positive number 
				int j = i + 1;
				while (j < n && nums[j] < 0) {
					j++; 
					} 
				if (j < n) {
					rightRotate(nums, i, j); 
					} 
				} else if (i % 2 != 0 && nums[i] >= 0) {
					// Find the next negative number
					int j = i + 1;
					while (j < n && nums[j] >= 0) { 
						j++; 
						} 
					if (j < n) { 
						rightRotate(nums, i, j); 
						} 
					} 
			}
		return nums;
		} 
	
	
private static void rightRotate(int[] arr, int start, int end) { 
		int temp = arr[end]; 
		for (int i = end; i > start; i--) {
			arr[i] = arr[i - 1];
			}
		arr[start] = temp;
	}
}
		

//alternate solutions
/* public static int[] alternateArrange(int[] nums) {
		int p1 = 0, p2 = 0;
		int temp =0;
		
		for(int idx=0;idx<=nums.length;idx++) {//9, 4, -2, -1, 5, 0, -5, -3, 2}
			
			
			while(p1 < nums.length && nums[p1]<0 ) {
				p1++;
			}
			while(p2 < nums.length&& nums[p2]>=0) {
				p2++;
			}
			if(p1 >= nums.length || p2 >= nums.length) {
				return nums;
			}
			int current_val = nums[idx];
			if(idx %2 == 0) {
				if( p1 == idx) {
					p1++;
					continue;
				}
				else if(p1 < idx) {
					nums[idx] = temp;
					temp = current_val;
					p1 = idx + 2;
				}
				else {
					temp = current_val;
					nums[idx] = nums[p1];
				
					nums[idx+1] = current_val;
						p1++;idx++;
						p2 = idx + 1;
								
				}
			} else {
				if( p2 == idx) {
					p2++;
					continue;
				}
				else if(p2 < idx) {
					nums[idx] = temp;
					temp = current_val;
					p2 = idx + 1;
				}
				else {
					temp = current_val;
					nums[idx] = nums[p2];
				
					nums[idx+1] = current_val;
						p2++;idx++;
						p1 = idx + 1;
						
				
			 }
			}
		}
		return nums;
	}
	
}*/
/* public static int[] alternateArrange(int[] nums) {
		
		int p1 = 0, p2 = 0;
		int temp =0;
		
		for(int idx=0;idx<=nums.length;idx++) {//9, 4, -2, -1, 5, 0, -5, -3, 2}
			
			
			while(p1 < nums.length && nums[p1]<0 ) {
				p1++;
			}
			while(p2 < nums.length&& nums[p2]>=0) {
				p2++;
			}
			if(p1 >= nums.length || p2 >= nums.length) {
				return nums;
			}
			int current_val = nums[idx];
			if(idx %2 == 0) {
				if( p1 == idx) {
					p1++;
					continue;
				}
				else if(p1 < idx) {
					nums[idx] = temp;
					temp = current_val;
					p1 = idx + 2;
				}
				else {
					temp = current_val;
					nums[idx] = nums[p1];
				
					nums[idx+1] = current_val;
						p1++;idx++;
						p2 = idx + 1;
								
				}
			} else {
				if( p2 == idx) {
					p2++;
					continue;
				}
				else if(p2 < idx) {
					nums[idx] = temp;
					temp = current_val;
					p2 = idx + 1;
				}
				else {
					temp = current_val;
					nums[idx] = nums[p2];
				
					nums[idx+1] = current_val;
						p2++;idx++;
						p1 = idx + 1;
						
				
			 }
			}
		}
		return nums;
	}

}
		
 */
	
	
/*	public static int[] alternateArrange(int[] nums) {
		
		int ptr2=0, temp =0;
		
		for(int ptr1=0;ptr1<nums.length;ptr1++) {
			
			if(ptr1 %2 == 0) {
				if (nums[ptr1] >= 0) { //if number is positive, continue.
					continue;
				}
				else {
					temp = nums[ptr1];
					 ptr2 = ptr2 + 1;
					 while(nums[ptr2]>=0 || ptr2 != nums.length){ //find the next positive number.
						 			ptr2++;
						  }
					}
				}
			else {
				if (nums[ptr1] < 0) {//if number is negative, continue.
					continue;
				}
				else {
					temp = nums[ptr1];
					 ptr2 = ptr2 + 1;
					 while(nums[ptr2]<0 || ptr2 != nums.length){//find the next negative number.
						 			ptr2++;
						  }
					}
				}
			if(ptr2==nums.length){
				  return nums;
			  }
			  nums[ptr1] = nums[ptr2];
			  ptr1++;
			  nums[ptr1] = temp;
		}
		
		return nums;
	}
}*/