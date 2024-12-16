package week5Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Count_Sort {
/*
 * 
 * Pseudocode:
 * use frequency array extra space after calculating max and min value. and calculate the length of freq array
 * using max-min+1 formula.
 * fill this freq array, using input array with ++.
 * 
 * fill the input array using freqarray.
 * 
 * 
 */
	@Test
public static void Test1() {
	
	int[] inpArray = {8,2,3,5,4,1,0};
	System.out.println(Arrays.toString(count_Sort(inpArray)));
	
}
	@Test
public static void Test2() {
	
	int[] inpArray = {4, 2, 2, 8, 3, 3, 1};
	System.out.println(Arrays.toString(count_Sort(inpArray)));
	
}

public static int[] count_Sort(int[] nums) {
	
	int max = nums[0];
	int min = nums[0];
	
	for(int i = 0;i<nums.length;i++) {
		
		if(nums[i]>max) {
			
			max=nums[i];
			
		}
		if(nums[i]<min) {
			
			min = nums[i];
			
		}
	}
	
	int[] freq_Array = new int[max-min+1];
	
	for(int i =0;i<nums.length;i++) {
		
		freq_Array[nums[i]-min]++;
		
	}
	
	int j = 0;
	
	for(int i =0;i<freq_Array.length;i++) {
		
		while(freq_Array[i]>0) {
			
		nums[j] = i+min;
		j++;
		freq_Array[i]--;
		
	}
	
	}
	
	return nums;
}
}
