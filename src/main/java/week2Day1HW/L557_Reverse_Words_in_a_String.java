package week2Day1HW;

import org.testng.annotations.Test;

public class L557_Reverse_Words_in_a_String {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? String 
	* What is the expected output? String 
	* Do I have constraints to solve the problem? Preserve white space and initial word order
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* "Let's take LeetCode contest"
	* "googlE"
	* "leetcode "
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
	* use a temp char variable and store the first char and keep swapping from front to back
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	@Test
	public static void Test1() {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
	@Test
	public static void Test2() {
		String s = "Mr Ding";
		System.out.println(reverseWords(s));
	}
	public static String reverseWords(String s) {
		
		
		String[] inpArray = s.split(" ");
	
		for (int i =0;i<inpArray.length;i++) {
			inpArray[i] = reverseWord(inpArray[i]);
		//	inpArray[i] = reverseWord(inpArray, i, end);
		}
				
		return  String.join(" ",inpArray);
		
	}
	
	public static String reverseWord(String S) {
		
		char temp ;
		int len = S.length();
		char[] charArray = S.toCharArray();
		for (int i =0;i<len/2;i++) {
			temp = charArray[i];
			charArray[i] =  charArray[(len-1)-i];
			charArray[(len-1)-i] = temp; 
		}
				
		return new String(charArray);
	}
	
/*public static String reverseWord(char[] words, int start, int end) {
		
		char temp ;
	//	int len = S.length();
	//	char[] charArray = S.toCharArray();
		for (int i =start;i<end;i++) {
			temp = words[i];
			words[i] =  words[end-i];
			words[end-i] = temp; 
		}
				
		return new String(charArray);
	}*/










}


/*/*Alternate Solution No: 1
 *  public String reverseWords(String s) {
        char[] words = s.toCharArray();
        int left = 0;
        int right = 0;
        int size = s.length();
        while(right < size) {
            if (words[right] == ' '){
                reverse(words, left, right - 1);
                left = right + 1;
            }
            right++;
        }
        reverse(words, left, right - 1);
        return new String(words);
    }

    private static void reverse(char[] words, int l, int r) {
        while (l < r) {
            char temp = words[l];
            words[l++] = words[r];
            words[r--] = temp;
        }
    }
 * 
 * 
 */







/*Alternate Solution No: 2
 *  public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] words = s.split(" ");
        for(String word : words){
            res.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return res.toString().trim();
    }
 *  
 */
 
