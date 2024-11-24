package week2Day2;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MergeSort {
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
		int[] inputArr1 = {1,2,3,0,0,0};
		int m=3;
		int[] inputArr2 = {2,5,6};
		int n = 3;
		inputArr1 = mergeSort(inputArr1,m,inputArr2,n);
		
	    System.out.println(Arrays.toString(inputArr1));
	}
	
	
	
	public static int[] mergeSort(int[] nums1, int m, int[] nums2,int n) {
	

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
		
		
		return nums1;
	}
	
		
}







/*fine tuned
 * int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;
        
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }*/


/*Brute force:
 *  int counter = 0;
        for(int i=m; i<nums1.length; i++){
            nums1[i] = nums2[counter];
            counter++;
        }Arrays.sort(nums1);*/
