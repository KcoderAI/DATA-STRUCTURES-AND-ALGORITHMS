package week3Day2HW;

import org.testng.annotations.Test;

public class FindUncommonCharacters {
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
	 * From a to z check whether it is present in str1 and not in str2  or viceversa, print.
	 *
	 */
	@Test
	public static void Test1() {
		String inpStr1 = "characters";
		String inpStr2 = "alphabets";
		//boolean result = checkForUncommonChars(inpStr);
		checkForUncommonChars(inpStr1,inpStr2);
		//System.out.println(result);
	}
	@Test
	public static void Test2() {
		String inpStr1 = "geeksforgeeks";
		String inpStr2 = "geeksquiz";
		//boolean result = checkForUncommonChars(inpStr);
		checkForUncommonChars(inpStr1,inpStr2);
		//System.out.println(result);
	}
	
	
	public static void checkForUncommonChars(String str1, String str2) {
		
		if(str1.equals(str2)) {
			System.out.println(str1);
		}
		for(char c='a';c<='z';c++){
            if((str1.indexOf(c)==-1 && str2.indexOf(c) > -1 )||(str2.indexOf(c)==-1 && str1.indexOf(c) > -1 )) {
               System.out.print(c);
            }
        
		}

	}
}

