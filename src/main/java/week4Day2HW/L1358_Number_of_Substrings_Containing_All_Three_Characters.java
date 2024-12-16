package week4Day2HW;

import org.testng.annotations.Test;

public class L1358_Number_of_Substrings_Containing_All_Three_Characters {
/*
 * Input : String
 * Output : int (count of valid substrings)
 * Test Data:
 * Pseudocode:
 * 
 * sliding window.
 * Start with k=3 size window. if all abc present, then calculate result by length - right pointer.
 * if not present then increase left pointer. and right pointer by one. until end of length. 
 * if all are present, then increase right pointer .
 * do this in for loop or while loop ,for each char in string
 * 
 * 
 * 
 */
	@Test
	public void Test1() {
		String s= "abcabc";
		System.out.println(findSubstringWithABC(s));
	}
	
	@Test
	public void Test2() {
		String s= "aaacb";
		System.out.println(findSubstringWithABC(s));
	}
	
	@Test
	public void Test3() {
		String s= "abc";
		System.out.println(findSubstringWithABC(s));
	}
	
	public static int findSubstringWithABC(String s) {
		
		
		 int[] asciiCount = new int[3];
		 int left = 0, right = 0, result = 0; 
		 
		 while (right < s.length()) { 
			 
			 asciiCount[s.charAt(right) - 'a']++; 
			 
			 while (asciiCount[0] > 0 && asciiCount[1] > 0 && asciiCount[2] > 0) {
				 
				 result += s.length() - right; 
				 asciiCount[s.charAt(left) - 'a']--; 
				 left++;
				 
			 } 
			 
			 right++; 
		 } 
		 
		 return result;
}
	
}
