package week4Day2HW;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class L904_Fruit_Into_Baskets {
/*
 * Input: int array
 * Output: 
 * Test Data:
 * Pseudocode:
 * 0,1
 * map.
 * find a max sub array in the given array of window size k = 2.
 * 2 unique numbers - 
 * count + 1. 
 * 
 * 
 * idx-- full traverse end of length
 * map update
 * map .size >2
 * calculate length.
 * Remove the elements
 * 
 * int maxLen = Math.max(maxlen, currentLen)
 * 
 * 
 * 
 * 
 */
	
	@Test
	public static void Test1() {
		int[] inpArray = {1,0,1,4,1,4,1,2,3};
		int result = findMaxNumOfFruits(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		int[] inpArray = {1,2,1};
		int result = findMaxNumOfFruits(inpArray);
		System.out.println(result);
	}
	
	@Test
	public static void Test22() {
		int[] inpArray = {0,1,2,2};
		int result = findMaxNumOfFruits(inpArray);
		System.out.println(result);
	}
	
	@Test
	public static void Test3() {
		int[] inpArray = {1,2,3,2,2};
		int result = findMaxNumOfFruits(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test4() {
		int[] inpArray = {1,1};
		int result = findMaxNumOfFruits(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test5() {
		int[] inpArray = {1,2};
		int result = findMaxNumOfFruits(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test6() {
		int[] inpArray = {1};
		int result = findMaxNumOfFruits(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test7() {
		int[] inpArray = {1,2,3};
		int result = findMaxNumOfFruits(inpArray);
		System.out.println(result);
	}
	public static int findMaxNumOfFruits(int[] fruits) {
		
		if(fruits.length==0) {
			return 0;
		}
		int maxLen = Integer.MIN_VALUE, left = 0;
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int idx = 0; idx < fruits.length;idx++) {
			map.put(fruits[idx] ,map.getOrDefault(fruits[idx], 0) + 1);
			
			if(map.size() > 2) {
								
				int firstFruit = fruits[left];
				map.put(firstFruit, map.get(firstFruit)-1);
				if(map.get(firstFruit) == 0) {
					
					map.remove(firstFruit);
				 
			  }
				left++;
			}
			int len = idx - left + 1;
			maxLen = Math.max(maxLen, len);
			
		}
				
		return maxLen;
	}
}
