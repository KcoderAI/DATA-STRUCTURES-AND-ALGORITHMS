package week6Day1;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MergeSort_New {
/*
 * 
 * merge two arrays
 */
	@Test
	public static void Test1() {
		int[] inpArray = {5,3,4,2,1};
		mergeSort(inpArray,0,inpArray.length-1);
		System.out.println(Arrays.toString(inpArray));
	}
	
	public static void mergeSort(int[] nums, int low, int high) {
		if(low>=high) {
			return;
		}
		int mid = (low+high)/2;
		mergeSort(nums,low,mid);
		mergeSort(nums,mid+1,high);
		
		merge(nums,low,mid,high);
	}
	
	public static void merge(int[] nums,int low,int mid,int high) {
		
		int p1=0,p2=0,index=low;
		
		int[] left = Arrays.copyOfRange(nums, low, mid+1);
		int[] right = Arrays.copyOfRange(nums, mid+1, high+1);
		
		while(p1<left.length&&p2<right.length) {
			
			if(left[p1]<=right[p2]) {
				
			nums[index++]= left[p1++];
			
			}
			else {
				
				nums[index++]= right[p2++];
				
			}
		}
			while(p1<left.length) {
				
				nums[index++]= left[p1++];
				
			}
			while(p2<right.length) {
				
				nums[index++]= right[p2++];
				
			}
		
		
	}
}
