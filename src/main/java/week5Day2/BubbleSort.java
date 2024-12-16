package week5Day2;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BubbleSort {
	@Test
	public static void Test() {
		int[] inpArray = {3,4,5,1,2};
		System.out.println(Arrays.toString(bubbleSort(inpArray)));
	}

	    public static int[] bubbleSort(int[] nums){
	        boolean swapped=false;
	        for(int i=0;i<nums.length;i++){
	            swapped=false;
	        //    for(int j=0;j<nums.length-1;j++){
	            for(int j=0;j<nums.length-i-1;j++){
	                // if the left ele is greater than right ele
	                if(nums[j]>nums[j+1]){
	                    // swap
	                    int temp= nums[j];
	                    nums[j]=nums[j+1];
	                    nums[j+1]=temp;
	                    swapped=true;
	                }
	            }
	            if(!swapped) break;
	        }
	        return nums;
	    }
}
