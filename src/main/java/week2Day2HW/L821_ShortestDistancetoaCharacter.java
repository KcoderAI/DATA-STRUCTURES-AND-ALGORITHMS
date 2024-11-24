package week2Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class L821_ShortestDistancetoaCharacter {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? String and character
	* What is the expected output? int array 
	* Do I have constraints to solve the problem? no
	*
	* 
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* Input: s = "loveleetcode", c = "e"
	* Output: [3,2,1,0,1,0,0,1,2,2,1,0]
	* 
	* Input: s = "aaab", c = "b"
	* Output: [3,2,1,0]
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
	* use two pointers
	* first pointer p1 to 0
	* find the char and set p1 to char index
	* set 2nd pointer p2 to p1. find next char index and set p2 to next char index.
	* 
	* while idx!=p2, from 0 to until length of string, fill the output array by calculating difference from first ptr to idx and second pointer to idx. whichever is nearest write it.
	* if no p2 found until length of array, then set both p1 and  p2 to same index.
	* 
	*
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	
/*	 use two pointers
		* first pointer p1 to 0
		* find the char and set p1 to char index
		* set 2nd pointer p2 to p1. find next char index and set p2 to next char index.
		* 
		* while idx!=p2, from 0 to until length of string, fill the output array by calculating difference from first ptr to idx and second pointer to idx. whichever is nearest write it.
		* if no p2 found until length of array, then set both p1 and  p2 to same index.
		* 
		**/
	 
		public static void Test1() {
		String inpStr = "loveleetcode";
		char findC = 'e';
		System.out.println(Arrays.toString(findShortestDistToChar(inpStr, findC)));
	}
	 
	public static void Test2() {
	
	String inpStr = "aaab";
	char findC = 'b';
	System.out.println(Arrays.toString(findShortestDistToChar(inpStr, findC)));
}
	 
	public static void Test3() {
	
	String inpStr = "c";
	char findC = 'c';
	System.out.println(Arrays.toString(findShortestDistToChar(inpStr, findC)));
}
	@Test
	public static void Test4() {
	
	String inpStr = "aaba";
	char findC = 'b';
	System.out.println(Arrays.toString(findShortestDistToChar(inpStr, findC)));
}
	
	public static int[] findShortestDistToChar(String s, char c) {
		
		int len = s.length();
		int[] outputArray = new int[len];
		int p1 = 0,p2 = 0;
		
		for(int idx = 0; idx <= len-1; idx++) {
				
			 if(idx > p2 || (p1==0) && (p2==0)) {
		
				 p1 = p2 ;
				 
				 while(s.charAt(p1) != c && (p1 < len-1)) {
					 p1++;
					}
			     
				 if((p1 < len-1)) {
				 	 p2 = p1 + 1;
				 }
		
				 else {
					 p2 = p1;
				 }
			      
				 while(s.charAt(p2) != c && (p2 < len-1)) {
					
			    	  p2++;
						
			      }
			    
				 if(p2 == len-1 && s.charAt(p2)!=c) {
			    	  p2=p1;
			      }
			     }   			 
					
			if(Math.abs(idx-p1) <= Math.abs(idx-p2)) {
				
				outputArray[idx] = Math.abs(idx-p1);
			
			}
			else
				outputArray[idx] = Math.abs(idx-p2);
		}
				
		return outputArray;
	}
}


/* adjusting loop
 * int n = s.length(); 
 * int[] outputArray = new int[n]; 
 * int p1 = -1, p2 = -1;
 *  // First pass: Find the first occurrence of 'c'
 *   for (int i = 0; i < n; i++) { 
 *   if (s.charAt(i) == c) {
 *    p1 = i; 
 *    break; 
 *    }
 *     }
 *      // Second pass: Find the next occurrence of 'c' 
 *      for (int i = p1 + 1; i < n; i++) { 
 *      if (s.charAt(i) == c) {
 *       p2 = i; 
 *       break; 
 *       } } for (int idx = 0; idx < n; idx++) {
 *        if (idx > p2 || (p1 == -1 && p2 == -1)) {
 *         p1 = p2; 
 *         // Find the next occurrence of 'c' after p1 
 *         for (int i = p1 + 1; i < n; i++) { 
 *         if (s.charAt(i) == c) {
 *          p2 = i;
 *           break; } } 
 *           if (p2 == -1) { p2 = p1; } }
 *            if (Math.abs(idx - p1) <= Math.abs(idx - p2)) { 
 *            outputArray[idx] = Math.abs(idx - p1); 
 *            } else { 
 *            outputArray[idx] = Math.abs(idx - p2); 
 *            }
 *             } 
 * 	return outputArray;*/
