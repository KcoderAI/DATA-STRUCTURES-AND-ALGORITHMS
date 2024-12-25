package Assessment2;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Problem4_findStartIndexOfAnagram {
	/*
	 * Input: Two Strings
	 * Output : list of indices
	 * Test Data:s = "cbaebabacd", p = "abc"; "abab", p = "ab";
	 * 
	 * Constraints:
	 * 1 <= s.length, p.length <= 3 * 104
	 * s and p consist of lowercase English letters.

	 * Pseudocode:
	 * initialize two pointers. p2 is fast pointer.p1 is slow pointer. set both p1 and p2 to zero.
	 * initialize count variable to length of string2.
	 * initialize list to store output indices.
	 * Initiaize the frequency count of ascii array for characters in string1 and load string1 char count.
	 * using p2 pointer in while loop check until p2<string1.length
	 * decrement the count, if characters of string2 is in array.(freqcount>0)
	 * decrement the freq count.
	 * p2++.
	 * If count reaches zero, then anagram is found.
	 * write the p1 index to the list.
	 * whenever the size exceeds the length of string2  , then adjust window size.
	 * if(p2-p1 = length of string2)
	 * add count for the character going out of the window.
	 * if freq count of p1 >=0, then count++;
	 * freqcountascii for p1 ++;
	 * p1++;
	 * 
	 * In the end, return list.
	 * 
	 * 
	 * Time Complexity:O(n)
	 * Space complexity:O(n) (list output)
	 * 
	 * 
	 * 
	 */
	
	//Unit Tests
		@Test
		public static void Test1() {
			String inpStr1 = "cbaebabacd";
			String inpStr2 = "abc";
			System.out.println(findAllAnagrams(inpStr1,inpStr2));
		}
		@Test
		public static void Test2() {
			String inpStr1 = "abab";
			String inpStr2 = "ab";
			System.out.println(findAllAnagrams(inpStr1,inpStr2));
		}
		
		//Code
		
		public static List<Integer> findAllAnagrams(String s,String p) {
			

			int p1 = 0, p2 = 0, count = p.length();
			
			 List<Integer> output = new ArrayList<>();
			 
			 int[] asciiCount = new int[26]; //lowercase Englist letters only.
			 
			 for(char c: p.toCharArray()) {
				 
				 asciiCount[c-'a']++;
				 
			 }
			 
			 while(p2 < s.length()) {
				 
				 if(asciiCount[s.charAt(p2)-'a'] >= 1) {
					 count--;
							 
				 }			 
				 asciiCount[s.charAt(p2)-'a']--;
				 
				 p2++;
			 
				 if(count==0) {
				 
					 output.add(p1);
			    }
			 
				 if (p2 - p1 == p.length()) { 
					 
				 char leftChar = s.charAt(p1);
				 
				 if (asciiCount[leftChar - 'a'] >= 0) { 
					 
					 count++;
					 
				 } 
				 
				 asciiCount[leftChar - 'a']++; 
				 
				 p1++; 
				} 
			 }
		
			 return output;
	    
				
		}
}
