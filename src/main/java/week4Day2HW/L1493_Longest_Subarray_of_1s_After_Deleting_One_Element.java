package week4Day2HW;

import org.testng.annotations.Test;

public class L1493_Longest_Subarray_of_1s_After_Deleting_One_Element {
/*
 * Input: binary array
 * Output: count of max leng 1s
 * Test Data:
 * Pesudocode :
 * 
 *  Logic is to skip the zero and calculate length.
 * set three pointers idx, p1 and p2 and initialize to 0.
 * keep incrementing idx pointer, whenever 0 comes, increment the count and save the first occurence of 0 in p2 pointer.
 * whenever second zero occurence comes change p1 to p2+1 length. store the zero index in p2. decrement count.
 * 
 * find the length using idx - p1 difference.
 * 
 * Edge condition: There is no 0 element. but should delete one element hence, return nums.length -1 as maxLen.
 * 
 * 
 * 
 * 
 * 
 */
	@Test 
	public static void Test1() {
		int[] inpArray = {1,1,0,1};
		int result = findLongestSubarrayof1s(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		int[] inpArray = {0,1,1,1,0,1,1,0,1};
		int result = findLongestSubarrayof1s(inpArray);
		System.out.println(result);
	}
	@Test 
	public static void Test3() {
		int[] inpArray = {1,1,1};
		int result = findLongestSubarrayof1s(inpArray);
		System.out.println(result);
	}


public static int findLongestSubarrayof1s(int[] nums) {
	
	int maxLen = 0, length = 0, count = 0;
	
	int p1 = 0, p2 = 0,  idx = 0;
	
	while(idx<nums.length) {
		
		
	/*	if(nums[idx]!=0) {
		idx++;
	   }*/
		
		
		
		if(nums[idx]==0) {
			count++;
			
			if(count == 1) {
				p2 = idx;
			
			}
			else if(count>1){
				count--; 
				p1 = p2 + 1;
				p2 = idx;
			
				 
			}
		}
		
		
		length = idx - p1 ;
		maxLen = Math.max(maxLen, length);
		idx++;
	}
	
/*	if(maxLen == nums.length)
	{	return maxLen -1;}
	
	return maxLen;*/
	
	return (maxLen == nums.length) ? maxLen - 1 : maxLen;
}
}










/* Alternate solutions
 * public static int findLongestSubarrayOf1s(int[] nums) { 
int maxLen = 0; 
int left = 0;
 int count = 0;
 for (int right = 0; right < nums.length; right++) {
 if (nums[right] == 0) { 
count++;
 } while (count > 1) {
 if (nums[left] == 0) { 
count--; 
} 
left++;
 }
 maxLen = Math.max(maxLen, right - left);
 } 
return maxLen; 
}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
