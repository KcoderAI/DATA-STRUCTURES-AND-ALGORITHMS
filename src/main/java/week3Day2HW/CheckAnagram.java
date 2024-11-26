package week3Day2HW;

import org.testng.annotations.Test;

public class CheckAnagram {
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
		String inpStr1 = "geeks";
		String inpStr2 = "kseeg";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		String inpStr1 = "a";
		String inpStr2 = "a";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	@Test
	public static void Test3() {
		String inpStr1 = "a";
		String inpStr2 = "ab";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	@Test
	public static void Test4() {
		String inpStr1 = "ac";
		String inpStr2 = "ab";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	@Test
	public static void Test5() {
		String inpStr1 = "allergy";
		String inpStr2 = "allergic";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	@Test
	public static void Test6() {
		String inpStr1 = "aca";
		String inpStr2 = "ace";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	@Test
	public static void Test7() {
		String inpStr1 = "ace";
		String inpStr2 = "aca";
		boolean result = checkForAnagram(inpStr1,inpStr2);
		System.out.println(result);
	}
	public static boolean checkForAnagram(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		for(int i = 0; i<str1.length();i++){
            if((str1.indexOf(str2.charAt(i)) == -1 ) || (str2.indexOf(str1.charAt(i)) == -1)) {
               return false;
            }
        }
		return true;
	}
}
