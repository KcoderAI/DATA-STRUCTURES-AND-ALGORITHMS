package week6Day1;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Insertion_Sort {
	/*
	 * 
	 * Insertion sort : Always start from i = 1. save the current value in temp variable- here curr variable.
	 * it relatively sort the previous elements of i and then place the current value of i, in the correct position.
	 * At any point of time(all i-1 elements will be in sorted order) . 
	 * 
	 * while loop sorts the prev elements in the correct order. and after while loop current element will be placed
	 * in the correct position.
	 * take j as i-1. and start the comparison in while loop.
	 * 
	 * 
	 * 
	 */
	@Test
	public static void Test1() {
		int[] inpArray = {5,8,7,3,2,1};
		System.out.println(Arrays.toString(insertionSort(inpArray)));
	}
	public static int[] insertionSort(int[] nums){

	    for (int i=1;i<nums.length;i++){
	        int j=i-1;
	        int curr= nums[i];
	        while (j>=0 && nums[j]> curr){
	            nums[j+1]=nums[j];
	            j--;
	        }
	        nums[j+1]=curr;
	    }
	    return nums;
	}

}
