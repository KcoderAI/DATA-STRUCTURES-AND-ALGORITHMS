package week3Day2HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class StringWithOccurrences {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? String 
	* What is the expected output? String (String with append occurences)
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* Input: nums = "aabbccddde"
	* Output: a2b2c2d3e1
	* Input: nums = "a";
	* Output: a1
	*
	* 
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
	 * Define HAshmap.  iterate through the input string and write into the hash map with key as character and values as count until the end of the string.
	 * convert map to string and append whenever new char sequence comes.
	 * return result. 
	 */
	@Test
	public static void Test1() {
		String inpString = "aabbccddde";
		
		String result = appendStrWithOccurences(inpString);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		String inpString = "a";
		
		String result = appendStrWithOccurences(inpString);
		System.out.println(result);
	}
	
	public static String appendStrWithOccurences(String inpStr) {
		
		HashMap<Character,Integer> charCountMap = new HashMap<>();
		List<Character> arrayList = new ArrayList<>();
		
		
		for(int i =0; i<inpStr.length();i++) {
		
			char currentChar = inpStr.charAt(i);
			charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);

			if (i == inpStr.length() - 1 || inpStr.charAt(i + 1) != currentChar) {
				int count = charCountMap.get(currentChar); 
				arrayList.add(currentChar);
				arrayList.add((char)('0'+ count));
				count = 0;
				
			
			}
		
			
		}
		return arrayList.toString();
		
		
	}
}
/*Alternate Solution

HashMap<Character,Integer> charCountMap = new HashMap<>();
StringBuilder mapAsString = new StringBuilder();


for(int i =0; i<inpStr.length();i++) {
	char currentChar = inpStr.charAt(i);
	charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);

	if (i == inpStr.length() - 1 || inpStr.charAt(i + 1) != currentChar) {
		int count = charCountMap.get(currentChar); 
		mapAsString.append(currentChar).append(count); 
		charCountMap.remove(currentChar);
	}
	
}
return mapAsString.toString();
*/