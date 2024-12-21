package week4Day2HW;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class FindLongestSubstringMUniqueChars {
	//	 Given a string you need to print longest possible substring that has exactly M unique characters. If there is more than one substring of longest possible length, then print any one of them.

	/*	Input: Str = “aabbcc”, k = 1
	 	Output: 2
	    Explanation: Max substring can be any one from {“aa” , “bb” , “cc”}.

		/*
		 *********  Uses Two Pointers, Hashing, Sliding Window.*****************
		 * Input: String
		 * Output: subString (that is maximum length substring .)
		 * 
		 **** Psuedocode:
		 *	  define left and right pointers and set to 0.. also start pointer and maxLen.
		 *left pointer is to remove the char from map when map size becomes greater than k.
		 *right map is to keep adding the characters into map.
		 *start pointer is to store the recent new character start position, so we can write it in the result as substring.
		 *maxLen is to store the maximum length of the subarray.(right-left+1).
		 *	define hashmap for storing char as key and its count as value.
		 *	start while loop and perform until p2<string length)
		 *	keep storing the characters in the map with count using getorDefault.
		 *	check for map.size>k inside while loop. this means more than k unique occurence came.
		 *	so start deleting the chars from hashmap by decrementing the count until left most char is completely
		 *removed using left++ from the map.decrement count. and when count is zero, then remove it. so map size gets reduced.
		 * whenever map size becomes k then keep calculating the maxlen and set start pointer to left.
		 *	return substring starting from start and start +maxLen.
		 *
		 *
		 *
		 *
		 */
		@Test
		public static void Test1() {
			String inpStr = "aabbcc";
			int k =1;
			String maxlenStr = findMaxSubStringMUniqueChar(inpStr,k);
			System.out.println(maxlenStr);
		}
		@Test
		public static void Test2() {
			String inpStr = "aabbcc";
			int k = 2;
			String maxlenStr = findMaxSubStringMUniqueChar(inpStr,k);
			System.out.println(maxlenStr);
		}
		
		@Test
		public static void Test3() {
			String inpStr = "aabbcc";
			int k = 3;
			String maxlenStr = findMaxSubStringMUniqueChar(inpStr,k);
			System.out.println(maxlenStr);
		}
		
		@Test
		public static void Test4() {
			String inpStr = "aaabbb";
			int k = 3;
			String maxlenStr = findMaxSubStringMUniqueChar(inpStr,k);
			System.out.println(maxlenStr);
		}
		
		@Test
		public static void Test5() {
			String inpStr = "aabacbebebe";
			int k = 3;
			String maxlenStr = findMaxSubStringMUniqueChar(inpStr,k);
			System.out.println(maxlenStr);
		}
		
		public static String findMaxSubStringMUniqueChar(String s, int k) {
			
			if (s == null || k == 0) {
				
				return ""; 
				
				} 
			Map<Character, Integer> map = new HashMap<>();
			
			int left = 0, maxLen = 0, start = 0; 
			
			for (int right = 0; right < s.length(); right++) {
				
				char rightChar = s.charAt(right); 
				map.put(rightChar, map.getOrDefault(rightChar, 0) + 1); 
				
				while (map.size() > k) {
					
					char leftChar = s.charAt(left);
					map.put(leftChar, map.get(leftChar) - 1); 
					
					if (map.get(leftChar) == 0) {
						
						map.remove(leftChar);
						
						} 
					left++; 
					
				} 
				//if (map.size() == k && (right - left + 1) > maxLen) {
					if (map.size() == k ) {
					
					maxLen = Math.max(maxLen, right - left + 1); 
					
					start = left; 
					
					} 
				} 
			
			System.out.println(maxLen);
			if(maxLen == 0) {
				return " Not enough unique characters ";
			}
			return s.substring(start, start + maxLen);
			
		}
}
