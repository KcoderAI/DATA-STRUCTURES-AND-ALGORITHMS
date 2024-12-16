package week4Day2HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class L438_Find_All_Anagrams_in_a_String {
/*
 * Input: Two Strings
 * Output : int array of indices
 * Test Data:
 * Pseudocode:
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
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
	
	public static List<Integer> findAllAnagrams(String s,String p) {
		
		
		int p1 = 0, p2 = 0, count = p.length();
		
		 List<Integer> output = new ArrayList<>();
		 int[] asciiCount = new int[26];
		 
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
