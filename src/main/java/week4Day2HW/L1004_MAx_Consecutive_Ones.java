package week4Day2HW;

import org.testng.annotations.Test;

public class L1004_MAx_Consecutive_Ones {
	//	https://leetcode.com/problems/max-consecutive-ones-iii/description/
		/*
		 ********* Sliding Window.*****************
		 * Input: int Array (Either 0 or 1) and int k [0 <= k <= Array's length].
		 * 
		 * Output: int length (that is maximum number of consecutive 1s)
		 * 
		 **** Psuedocode:
		 *	  define maxlen and p1 and p2 pointers.
		 *	define hashmap for storing char as key and its count as value.
		 *	start while loop and perform until p2<string length)
		 *	keep storing the characters in the map with count using getorDefault.
		 *	check for count>1 inside while loop. this means duplicate occurence came.
		 *	so start deleting the chars from hashmap by decrementing the count until the duplicate occurence just added
		 *	 was found(using count>1) by incrementing p1 pointer(p1++);
		 *.(This is because , to remove all the prev characters until current duplicate char from subarray length count. 
		 *	so after removing this, new subarray remains in the map without duplicate and starts to calculate len.using maxlen.
		 *p2++.
		 * p2 is a fast pointer. p1 is a slow pointer. 
		 * p2 keeps adding character into the map. and stops when duplicate char occured.
		 * p1 pointer starts to delete occurence in map until this duplicate char is removed.(because prev chars should not come
		 * into the maxlength non duplicate length calculation.) so by keeping p1 pointer static, and using p2 current char count>2,
		 * updating the count in the map and increasing pointer till duplicate occurence is found.)
		 * so next time when another duplicate char comes. p1 again get incremented and deletes all prev characters from map until
		 * duplicate char occurence is found. this repeats until p2 reaches the end of the string.
		 * so in the end whatever the maxLen has, will be returned as maximum length.
		 *	. 
		 * 3 pointers required. one is to calculate starting position of valid 1.another is to check where first 0 is
		 * flipped. last one is to check where second 0 is flipped.
		 * once second zero is flipped, then calculate length. using current index - p1 + 1 gives length.
		 * after we finish flipping the second 0, we need to set pointers again. one to point the starting position of 1.
		 * another to point the second changed 0 as first pointer position. 
		 *
		 *
		 *
		 */
	
	@Test
	public static void Test1() {
		int[] inpArray = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		int len = findMax_Consecutive_Ones(inpArray,k);
		System.out.println(len);
	}
	
	@Test
	public static void Test2() {
		int[] inpArray = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k = 3;
		int len = findMax_Consecutive_Ones(inpArray,k);
		System.out.println(len);
	}
	
public static int findMax_Consecutive_Ones(int[] nums, int k) {//0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1
		
	int zeroCount = 0; //1,1,1,0,0,0,1,1,1,1,0
		
		int maxLen = 0, left = 0;
		
		
		for(int right = 0; right<nums.length; right++) {
			if(nums[right] == 0) {
				zeroCount++;
			}
			
			while (zeroCount > k) { 
				if (nums[left] == 0) {
					zeroCount--; 
					}
				left++;
				} 
			maxLen = Math.max(maxLen, right - left + 1);
			
			
		}
		
		return maxLen;
		
}
}

/*
if (nums[i] == 0) {
nums[i] = 1;				
count++;

if (count == 1) {
	p2 = i;
}
if(count == k) {
	count = 0;
	p2 =i;
	while(i<nums.length && nums[i]!=0) {
		i++;
	}
	currentLen = i-p1+1;
	maxLen = Math.max(maxLen, currentLen);
	p1 = p2 + 1;
	break;
}
}

}	

maxLen = p2;


for(int j = p2; j < nums.length; j++) {

if(nums[j] == 0) {
nums[j] = 1;
count++;
}
if(k==count) {
p1 = p2;
p2=j+1;

}
currentLen = 0;
currentLen += 0;
maxLen = Math.max(maxLen, currentLen);
}

return maxLen;*/


/*
for(int i =0;i<nums.length;i++) {
while(i<nums.length && nums[i]!=0) {
	i++;
}
if (i<nums.length) {
	count++;
	if (count == 1) {
		p2 = i;
	}
	if(count == k) {
		count = 0;
		p2 = i;
		while(i<nums.length && nums[i]!=0) {
			i++;
		}
		currentLen = i-p1+1;
		maxLen = Math.max(maxLen, currentLen);
		p1 = p2 + 1;
		break;
	}
}*/