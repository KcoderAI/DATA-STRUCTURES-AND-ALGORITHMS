package week3Day2HW;

import java.util.HashSet;

import org.testng.annotations.Test;

public class L1832_Check_if_the_Sentence_Is_Pangram {
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
	 * Define HAshmap. Initialize it with Key 0 and value 1. iterate through the input array, calculate prefixSum and add the PREFIX SUM as key in the map and count as value.
	 * Before adding, find sum-k = index value, if index value is present in the map, add it to the result. increment counter value and put it in the map both if else cases using getdefault.
	 * return result. 
	 */
	@Test
	public static void Test1() {
		String inpStr = "thequickbrownfoxjumpsoverthelazydog";
		boolean result = checkForPangram(inpStr);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		String inpStr = "aabbcdefghijklmnopqrstuvxyyz";
		boolean result = checkForPangram(inpStr);
		System.out.println(result);
	}
	
	@Test
	public static void Test3() {
		String inpStr = "leetcode";
		boolean result = checkForPangram(inpStr);
		System.out.println(result);
	}
	@Test
	public static void Test4() {
		String inpStr = "k";
		boolean result = checkForPangram(inpStr);
		System.out.println(result);
	}
	
	public static boolean checkForPangram(String sentence) {
		
		if(sentence.length()<26) {
			return false;
		}
		for(char c='a';c<='z';c++){
            if(sentence.indexOf(c)==-1){
                return false;
            }
        }
        return true;
	}
}






/*
 * Alternate solution1
 * if(sentence.length()<26) {
			return false;
		}
		HashSet<Character> set = new HashSet<>();
		
		for(int i =0; i<sentence.length();i++) {
			set.add(sentence.charAt(i));
		}
		if(set.size()==26) {
			return true;
		}
		return false;
		
	}
}	
Alternate Solution 2
boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }
        for (boolean b : seen) {
            if (!b) 
                return false;
        }
        return true;
    }
}

Alternate Solution 3
 * for(char c='a';c<='z';c++){
            if(sentence.indexOf(c)==-1){
                return false;
            }
        }
        return true;
       }
      }*/
