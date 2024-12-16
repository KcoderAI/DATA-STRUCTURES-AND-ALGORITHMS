package week5Day2;

import org.testng.annotations.Test;

public class L540_SingleElementinaSortedArray {
	@Test
    public void testOne()
    {
        int[] nums={1,1,2,3,3,4,4,8,8};
        int i = singleNonDuplicate(nums);
        System.out.println(i);
    }

    private int singleNonDuplicate(int[] nums) {

        int low=1,high=nums.length-2,mid=0;
        int n = nums.length;
        if(n==1) return nums [0];
        if (nums [0]!= nums [1]) 
        	return nums [0]; 
        if(nums [n-1] != nums[n-2]) 
        	return nums[n-1];

        
        while(low<=high)
        {  
        	mid=(low+high)/2;
        
        	if ((mid%2==0 && nums[mid]==nums[mid+1])||(mid%2==1 && nums[mid]==nums[mid-1]))
          {
        	  low=mid+1; 
          }
          else {
        	  high=mid-1;
          }
        }
     return nums[low];
    }
}

/*

int low=1,high=nums.length-2,mid=0;
int n = nums.length;
if(n==1) return nums [0];
if (nums [0]!= nums [1]) 
	return nums [0]; 
if(nums [n-1] != nums[n-2]) 
	return nums[n-1];


while(low<=high)
{  
	mid=(low+high)/2;
	
	if(nums[mid]!=nums[mid+1] && nums[mid]!= nums[mid-1])
	return nums[mid];

	if ((mid%2==0 && nums[mid]==nums[mid+1])||(mid%2==1 && nums[mid]==nums[mid-1]))
  {
	  low=mid+1; 
  }
  else {
	  high=mid-1;
  }
}
return -1;
*/