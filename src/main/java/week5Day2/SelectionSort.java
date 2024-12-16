package week5Day2;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SelectionSort {
	
	@Test
	public static void Test() {
		int[] inpArray = {3,4,5,1,2};
		System.out.println(Arrays.toString(selectionSort(inpArray)));
	}
	
	public static int[] selectionSort(int[] nums){
		
        for (int i=0;i<nums.length;i++){
        	
            int minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex=j;
                }
            }
            // swap i, minIndex
            int temp= nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;
        }
        return nums;
    }
}
