package week2Day2HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class L15_3Sum {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? integer 
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
	* sort it and 
	* compare first and next element if distinct increase count
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	
	
	public static void Test1() {
		int[] inpArray = {-1,0,1,2,-1,-4}; // {-4,-1,-1,0,1,2}
		System.out.println(findTriplets(inpArray));
	}
	
	
	public static void Test2() {
		int[] inpArray = {0,0,0,0,0}; // {-4,-1,-1,0,1,2}
		System.out.println(findTriplets(inpArray));
	}
	
	public static void Test3() {
		int[] inpArray = {1,1,0}; // {-4,-1,-1,0,1,2}
		System.out.println(findTriplets(inpArray));
	}
	
	public static void Test4() {
		int[] inpArray = {-1,0,1,0}; // {-4,-1,-1,0,1,2} [-2,0,1,1,2]
		System.out.println(findTriplets(inpArray));
	}
	
	public static void Test5() {
		int[] inpArray = {-2,0,1,1,2}; // {-4,-1,-1,0,1,2} [-2,0,1,1,2]
		System.out.println(findTriplets(inpArray));
	}
	//-1,0,1,2,-1,-4,-2,-3,3,0,4
	@Test
	public static void Test6() {
		int[] inpArray = {-1,0,1,2,-1,-4,-2,-3,3,0,4}; 
		System.out.println(findTriplets(inpArray));
	}
	
	public static List<List<Integer>> findTriplets(int[] nums){
		
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue; 
				}
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
			
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) { result.add(Arrays.asList(nums[i], nums[left], nums[right]));
				// Skip duplicates for left and right
				while (left < right && nums[left] == nums[left + 1]) {
					left++;
				} 
				while (left < right && nums[right] == nums[right - 1]) {
					right--;
				}
				left++; 
				right--;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				} 
				} 
			} 
		return result; 
		} 
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	Arrays.sort(nums);
			
			int p1 = 1;
			int p2 = nums.length-1;
			
			List<List<Integer>> listOfLists = new ArrayList<>();
			
			
			for(int i =0;i<nums.length-1; i++) {
				
												   // 0  1	2  3  4 5 6 7 8 9 10
				while(p1<=nums.length-1 && p2>=0) {//-4,-3,-2,-1,-1,0,0,1,2,3,4}
					int tempSum = nums[p1] + nums[p2];
					if(p1 == i || p2 == p1 ) {
						p1++;
								
					}
					else if( i == (nums.length-p2) || p2 == i) {
						p2--;
							
					}
					
					else if((p1!=i) && tempSum + nums[i] == 0) {//-1,0,0,1
						List<Integer> tempList = new ArrayList();
						 tempList.add(0,nums[i]);
						 tempList.add(1,nums[p1]);
						 tempList.add(2,nums[p2]);
						 
						 Collections.sort(tempList);
					//	if(!listOfLists.contains(Arrays.asList(tempArray))) {
						 if(!containsSortedSublist(listOfLists, tempList)) {
							listOfLists.add(new ArrayList<>(tempList));
						}
						
						p2 --;
						p1 ++;
					}
				//	else if(Math.abs(tempSum) < Math.abs(nums[i])) {
					else if(tempSum <= nums[i]) {
						
						p1++;
					}
				//	else if(Math.abs(tempSum) > Math.abs(nums[i])) {
					else if(tempSum > nums[i]) {
						
						p2--;
					}
					
			    }
				p1=0;
				p2=nums.length-1;
				
				
			}
			
			return listOfLists;
	}
//}

public static boolean containsSortedSublist(List<List<Integer>> listOfLists, List<Integer> tempArray) {
	for (List<Integer> sublist : listOfLists) { 
				if (sublist.equals(tempArray)) {
			return true;
			} 
		} 
	return false;
}
}*/
/*
for(int p1 =0;p1<nums.length-1;p1++) {
tempSum = nums[p1] +nums[p1+1];
if(nums[p2]+tempSum == 0) {
	listOfLists.add(Arrays.asList(nums[p1],nums[p1+1],nums[p2]));
	tempSum = 0;
	p2++;
}
}
return listOfLists; */