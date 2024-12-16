package week4Day2;

import java.util.HashMap;

import org.testng.annotations.Test;

public class LongestSubstringWithoutRepeatingChars {

//	https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
/*
 ********* Very Very Important Problem: Uses Two Pointers, Hashing, Sliding Window.*****************
 * Input: String
 * Output: int length (that is maximum length of the subarray in the given input string.)
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
 *
 *
 *
 *
 */
	
	@Test
	public static void Test1() {
		String inpStr = "abcabcdabc";
		int maxlen = findMaxSubArrayNoDuplicate(inpStr);
		System.out.println(maxlen);
	}
	
	public static int findMaxSubArrayNoDuplicate(String s) {
		int maxLen = Integer.MIN_VALUE, p1 = 0, p2 = 0;
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		while(p2<s.length()) {
			
			map.put(s.charAt(p2), map.getOrDefault(s.charAt(p2), 0) + 1);
			while(map.get(s.charAt(p2))>1) {
				map.put(s.charAt(p1), map.getOrDefault(s.charAt(p1), 0) - 1);
				p1++;
			}
			maxLen = Math.max(maxLen, p2-p1+1);
			p2++;
		}
		
		
		
		return maxLen;
	}
	
	
}
