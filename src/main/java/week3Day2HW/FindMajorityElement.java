package week3Day2HW;

import java.util.HashMap;

import org.testng.annotations.Test;

public class FindMajorityElement {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? integer (maxKSum)
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* * 
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
	* BruteForce with nested loops. - That is still fine, proceed to solve by what you know !!
	* 
	* 6) If you know alternate solutions -> find out the O Notations
	* (Performance)
	* Time : O(N)
	* Space: O(N)
	* 
	* Then, explain either both or the best (depends on the time)
	* 
	* Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	* Approach 2: Write down the options and benefits and code the best
	* 
	* 7) Start always with Psuedo code // Two Pointer
	* 
	* 
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	/*PsuedoCode:
	 * If length of both the strings are not matching then return false
	 * Inside for loop check for the following condition until length of str1(any string) 
	 * If char at str1 not present in str2 or chat at str2 not present in str1 then return false.
	 * At the end of the loop, return true.
	 *
	 */
	@Test
	public static void Test1() {
		int[] inpArray = {3,2,3};
		int result = findMajorityElement(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		int[] inpArray = {2,2,1,1,1,2,2};
		int result = findMajorityElement(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test3() {
		int[] inpArray = {1};
		int result = findMajorityElement(inpArray);
		System.out.println(result);
	}
	public static int findMajorityElement(int[] nums) {
				
		int len = nums.length;
		
		if(len==1){
        
			return nums[0];
        
		}
		
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		
		for(int i =0; i< len;i++) {
			
			hashMap.put(nums[i],hashMap.getOrDefault(nums[i], 0)+1);
			
			if ((hashMap.get(nums[i])) > len/2) {
			
				return nums[i];
				
			}
			
		}
		
		return -1;
		
	}
}




/*Alternate Solution
 *  public int helper(int[] nums,int i,int element){
        int count=0;
        for(int j=i;j<nums.length;j++){
             if(nums[j]==element){
            count++;
        }else{
            count--;
        }
        if(count<0){
            return helper(nums,j,nums[j]);
        }
        }
        return element;

    }
    public int majorityElement(int[] nums) {
        return helper(nums,0,nums[0]);
    }
}*/


/*
 * int len = nums.length;
		if(len==1){
            return nums[0];
        }
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		
 
for(int i =0; i< len;i++) {
if(hashMap.containsKey(nums[i])) {
	
	if ((hashMap.get(nums[i])+1) > len/2) {
		return nums[i];
	}
}
hashMap.put(nums[i],hashMap.getOrDefault(nums[i], 0)+1);
}

return -1;*/