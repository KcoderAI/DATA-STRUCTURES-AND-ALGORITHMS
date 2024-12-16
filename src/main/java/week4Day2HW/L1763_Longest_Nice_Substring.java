package week4Day2HW;

import org.testng.annotations.Test;

public class L1763_Longest_Nice_Substring {
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
			String s= "YazaAay";
			System.out.println(longestNiceSubstring(s));
		}

@Test
public void Test2() {
			String s= "Bb";
			System.out.println(longestNiceSubstring(s));
		}
@Test
public void Test3() {
			String s= "c";
			System.out.println(longestNiceSubstring(s));
		}

public String longestNiceSubstring(String s) {
	 int n = s.length();
	 if (n < 2) 
		 return ""; 
	String result = ""; 
	for (int i = 0; i < n; i++) {
	  int[] lower = new int[26]; 
	  int[] upper = new int[26]; 
	 
	 for (int j = i; j < n; j++) {
		 
		 char c = s.charAt(j); 
		 
		 if (Character.isLowerCase(c)) {
			 lower[c - 'a']++; 
		 } 
		 else {
			 upper[c - 'A']++;
		 }
		 if (isNice(lower, upper) && j - i + 1 > result.length()) { 
			 result = s.substring(i, j + 1); 
		  } 
		} 
	 }
	return result; 
 } 
private boolean isNice(int[] lower, int[] upper) {
	
	for (int i = 0; i < 26; i++) {
	
		if (lower[i] > 0 && upper[i] == 0 || lower[i] == 0 && upper[i] > 0) { 
			return false; 
		} 
	  } 
	return true;
  }		
}

/* Alternate Solutions
 * 
  public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";

        // Check for characters that break the "nice" condition
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!s.contains(Character.toString(Character.toUpperCase(c))) || 
                !s.contains(Character.toString(Character.toLowerCase(c)))) {
                // Split and process both halves
                String left = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i + 1));
                // Return the longer nice substring
                return left.length() >= right.length() ? left : right;
            }
        }

        // If no breaking character is found, the entire string is nice
        return s;
    }
 */
 