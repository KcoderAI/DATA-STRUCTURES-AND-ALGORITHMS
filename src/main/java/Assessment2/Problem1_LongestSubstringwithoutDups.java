package Assessment2;

import org.testng.annotations.Test;

public class Problem1_LongestSubstringwithoutDups {
/*
	*Input: String
	* Output: int - maximum length
	*Constraints:
	*0 <= s.length <= 5 * 104
	* s consists of English letters, digits, symbols and spaces.
	* Test Data: abcabcdabc;bbbbb;pwwkew
	* Pseudocode:
	* define two pointers p1 and p2. p2 is the fast pointer. p1 is the slow pointer.set both to 0.
	* Initialize maxLen to Integer.Minvalue
	* define an ascii array of size 128 because string consists of letters,digits,symbols and spaces.
	* start a while loop till p2 pointer is less than string length, keep adding the characters into ascii array.
	* after every update , check whether freq count is greater than 1(i.e.duplicate occurence) 
	* if condition satisfied(freq count is greater than 1) then start deleting characters using p1 slow pointer, by incrementing p1++ and checking using p2 pointer for duplicate removal(keep deleting all characters using p1 till freq count is greater than1)
	* calculate maxlen using math.max for p2-p1+1.
	* Increment p2++.
	* return the maxLen. 
	* Time complexity: O(n)
	* Space complexity: O(1) fixed size ascii array.
	   
	   */
	
	//Unit Tests
	@Test
	public static void Test1() {
		String inpStr = "abcabcdabc";
		int maxlen = findMaxSubArrayNoDuplicate(inpStr);
		System.out.println(maxlen);
	}
	@Test
	public static void Test2() {
		String inpStr = "bbbbb";
		int maxlen = findMaxSubArrayNoDuplicate(inpStr);
		System.out.println(maxlen);
	}
	@Test
	public static void Test3() {
		String inpStr = "pwwkew";
		int maxlen = findMaxSubArrayNoDuplicate(inpStr);
		System.out.println(maxlen);
	}
	
	
	//code
	
	public static int findMaxSubArrayNoDuplicate(String s) {
	
		int maxLen = Integer.MIN_VALUE, p1 = 0, p2 = 0;
		
		int[] ascii = new int[128];  //Because s has English letters, digits, symbols and spaces
				
		while(p2<s.length()) {
			ascii[s.charAt(p2) - ' ']++;
			 
			while(ascii[s.charAt(p2) - ' '] > 1) {
				ascii[s.charAt(p1) - ' ']--;
				 
				p1++;
			}
			maxLen = Math.max(maxLen, p2-p1+1);
			p2++;
		}
		
		return maxLen;
	}
}
