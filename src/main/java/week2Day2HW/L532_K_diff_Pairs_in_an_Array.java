package week2Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class L532_K_diff_Pairs_in_an_Array {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? int array and integer k
	* What is the expected output? int number (count of different k pairs)
	* Do I have constraints to solve the problem? No
 	* 
	*
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* [3,1,4,1,5], k = 2
	* [1,2,3,4,5], k = 1
	* 
	* [1,3,1,5,4], k = 0
	* 
	* 
	* 
	* 
	* 
	* Validate with the interviewer if the data set is fine by his/her assumptions
	* 
	* 3) Do I know how to solve it?
	* yes using two pointers
	* Yes - great, is there an alternate?
	* brute force
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
	* first pointer  index starts from 0
	* second pointer is the index from length-1
	* while first pointer less than second pointer
	* find the difference
	* if difference is greater than k, then decrease j pointer 
	* if difference is lesser than k, then increase i pointer
	* once found the pair, increase count.
	* set i value to next unique element
	* set j to length -1.
	* at the end of while loop return count.
	* 
	* * 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	@Test
	public static void Test1() {
		int[] inputArray = {3,1,4,1,5};
		int k = 2;
		int count = findkUniquePairs(inputArray, k);
		System.out.println(count);
	}
	@Test
	public static void Test2() {
		int[] inputArray = {1,2,3,4,5};
		int k = 1;
		int count = findkUniquePairs(inputArray, k);
		System.out.println(count);
	}
	@Test
	public static void Test3() {
		int[] inputArray = {1,3,1,5,4};
		int k = 2;
		int count = findkUniquePairs(inputArray, k);
		System.out.println(count);
	}
	@Test
	public static void Test4() {
		int[] inputArray = {1,1,1,2,1};
		int k = 1;
		int count = findkUniquePairs(inputArray, k);
		System.out.println(count);
	}
	@Test
	public static void Test5() {
		int[] inputArray = {1,1,1,1,1};
		int k = 0;
		int count = findkUniquePairs(inputArray, k);
		System.out.println(count);
	}
	@Test
	public static void Test6() {
		int[] inputArray = {6,2,9,3,9,6,7,7,6,4};
		int k = 3;
		int count = findkUniquePairs(inputArray, k);
		System.out.println(count);
	}//2,3,4,6,6,6,7,7,9,9  //1 1 3 4 5 k =2
	public static int findkUniquePairs(int[] nums, int k) {
		
		Arrays.sort(nums); 
		
		int left = 0, right = 1, count = 0; 
		while (left < nums.length && right < nums.length) { 
			if (left == right || nums[right] - nums[left] < k) {
				
				right++; 
				
				} 
			else if (nums[right] - nums[left] > k) {
				
				left++;
				
				} 
			else { 
					
				count++;
				left++; 
				right++; 
				
				while (left < nums.length && nums[left] == nums[left - 1]) { 
					left++; 
					} 
				}
			 
		}
		return count;
		}
	
	
}
		
	/*	//Arrays.sort(nums);
		
		
	//	while(p1<p2) {
		while(p1<nums.length-1) {//2,3,4,6,6,6,7,7,9,9
			if(nums[p2]-nums[p1] > k) {
				p2--;
			}
			else if(nums[p2]-nums[p1] < k) {
				p1++;
			}
			else {
				count++;
				if(p2==nums.length-1 && p1==nums.length-2) {
					return count;
				}
				else {
				p2 = nums.length-1;
				for (int i =p1;i<nums.length-1;i++) {
					if(nums[i]!=nums[i+1]) {
						p1 = i+1;
						break;
					}
					if(i==nums.length-2) {
						return count;
					}
				  }
			//	return count;
				}	
			}
		}
		
		
		
		return count;
	}
}*/

/*
 * 
		int p1 =0;
		int p2 = nums.length-1;
		int count = 0;
		
	//	while(p1<p2) {
		while(p1<nums.length-1) {//2,3,4,6,6,6,7,7,9,9
			if(nums[p2]-nums[p1] > k) {
				p2--;
			}
			else if(nums[p2]-nums[p1] < k) {
				p1++;
			}
			else {
				count++;
				if(p2==nums.length-1 && p1==nums.length-2) {
					return count;
				}
				else {
				p2 = nums.length-1;
				for (int i =p1;i<nums.length-1;i++) {
					if(nums[i]!=nums[i+1]) {
						p1 = i+1;
						break;
					}
					if(i==nums.length-2) {
						return count;
					}
				  }
			//	return count;
				}	
			}
		}
		
		
		
		return count; }*/
