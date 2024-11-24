package week2Day1HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SwapVowels {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? integer 
	* Do I have constraints to solve the problem? Preserve white space and initial word order
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* {1,5,3,3,4,6,7,7,8};
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
	* No - That is still fine, proceed to solve by what you know !!
	* 
	* 6) If you know alternate solutions -> find out the O Notations
	* (Performance)
	* 
	* Then, explain either both or the best (depends on the time)
	* 
	* Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	* Approach 2: Write down the options and benefits and code the best
	* 
	* 7) Start always with Psuedo code // Bruteforce
	* sort it and 
	* compare first and next element if distinct increase count
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	
	@Test
	public static void Test1() {
		
		String inputStr = "Hello Everyone! Welcome to Testleaf";		
		String s = swapVowel(inputStr);
		//System.out.println(s);
		System.out.println(swapVowel(inputStr));
	}
	
	@Test
	public static void Test2() {
		
		String inputStr = "Hello Everyone! Welcome to Testleaf";
	//	System.out.println(swapVowel(inputStr));
	}
	
	@Test
	public static void Test3() {

		String inputStr = "Hello Everyone! Welcome to Testleaf";
	//	System.out.println(swapVowel(inputStr));
	}
	
	
	
	public static String swapVowel(String s) {
		
		char temp;
		char[] inpArray = s.toCharArray();
		int i = 0,j = inpArray.length-1;
		
		while(i<j) {
			
				while (i < j && !isVowel(inpArray[i])) { 
					i++;
					}
				while (i < j && !isVowel(inpArray[j])) { 
					j--;
					}
				if(i<j) {
					
					temp = inpArray[i];					
					inpArray[i] = inpArray[j];					
					inpArray[j] = temp;
					
					i++;
					j--;					
				}
			}
			
		return new String(inpArray);

	}
	
	public static boolean isVowel(char ch) {
		return "AEIOUaeiou".indexOf(ch) != -1;
	}
	
	}

	

