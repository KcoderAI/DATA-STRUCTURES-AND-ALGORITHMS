package week5Day1;

import org.testng.annotations.Test;

public class L35_Search_Insert_Position{
	





/*
	Binary search:
		- initialise two pointers low=0, high=nums.length-1
		- while (low<=high)
			- find the mid point
			- if (nums[mid]==target) return mid;
			- if <something> move left
				high=mid-1
			- if <something> move to right
				low=mid+1;
				
				*/
	@Test
public static void Test1() {
		int[] inputArr = {1,3,5,5,5,5,6};
		int k = 5;
		System.out.println(binarySearch(inputArr,k));
	}
	
	@Test
	public static void Test2() {
		int[] inputArr = {1,3,5,5,5,5,6};
		int k = 6;
		System.out.println(binarySearch(inputArr,k));
	}
	
	@Test
	public static void Test3() {
		int[] inputArr = {1,3,5,5,5,5,6};
		int k = 7;
		System.out.println(binarySearch(inputArr,k));
	}
	
	
/*public static int binarySearch(int[] arr, int k) {
	
	int left = 0, right = arr.length-1;
	
	while(left<right) {
		
		int mid = (left+right)/2;
		
		if(arr[mid] < k) {
			
			left = mid+1;
			
		}
		else
			
			right = mid;
		
		
	}
	
	return left;
}

}*/

	/*public static int binarySearch(int[] arr, int k) {
		
		int left = 0, right = arr.length-1;
		
		while(left<right) {
			
			int mid = (left+right)/2;
			
			if(arr[mid] < k) {
				
				left = mid+1;
				
			}
			else {
				
				right = mid;
			
			}
			
			
		}
		return left;
		
	
}*/
		/*	if(arr[mid]==k) {
				return mid;
			}
			else if(arr[mid]>k){
				right = mid-1;
			}
			else {
				left = mid+1;
			}*/


 public static int binarySearch(int[] nums, int target){
		  
		  int result = nums.length, low = 0, high = nums.length-1;
		  
		  while(low <= high) {
	    
	    
	       int  mid = (low + high)/2;
	    
	        if(nums[mid] >= target) {
	        
	            result = mid;
	            high = mid - 1;
	        }
	        else if(nums[mid]< target){
	        
	            low = mid+1;
	        }
	    }
	    
	    return result;
	    
	}
}