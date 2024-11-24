package week2Day2HW;

import org.testng.annotations.Test;

public class L28_Find_Index_of_First_Occurrence_in_a_String {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? Two Strings 
	* What is the expected output? int (First occurence index) or -1 (if not present)
	* Do I have constraints to solve the problem? yes
	* 
	*1 <= haystack.length, needle.length <= 104
	*haystack and needle consist of only lowercase English characters.
	*
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* haystack = "sadbutsad"
	* needle = "sad"
	* 
	* haystack = "sadbutsad"
	* needle = "bad"
	* 
	* 
	* 
	* 
	* 
	* Validate with the interviewer if the data set is fine by his/her assumptions
	* 
	* 3) Do I know how to solve it?
	* yes using two pointers
	* Yes - great, is there an alternate?
	* brute force
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
	* first pointer  to length of needle string-1
	* second and third pointer to length of needle string-1
	* start comparing from last letter in needle, whether it is present. until it matches(i.e.needle length becomes zero.) if zero then return index. if not present
	* then , increase the haystack second pointer and third pointer to third pointer+1. and continue search. until third pointer exceeds haystack needle. if reached then return -1.
	*  
	*set first pointer and second pointer to 0. compare second pointer with string2 index, when mismatch occurs, increment first
	*pointer and reset second pointer to first pointer. continue search till end of length. If s2 reached end of length then
	*return index of first pointer (first occurence) else return -1. 
	*
	* 
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	
	//use two pointers
	//first pointer  to length of needle string-1
	// second and third pointer to length of needle string-1
	// start comparing from last letter in needle, whether it is present. until it matches(i.e.needle length becomes zero.) if zero then return index. if not present
	//then , increase the haystack second pointer and third pointer to third pointer+1. and continue search. until third pointer exceeds haystack needle. if reached then return -1.
	
	@Test
	public static void Test1() {
	
		String haystack = "bsadbutsad";
		String needle = "sad";
		int result = strStr(haystack, needle);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
	
		String haystack = "sadbutsad";
		String needle = "bad";
		int result = strStr(haystack, needle);
		System.out.println(result);
	}
	@Test
	public static void Test3() {
	
		String haystack = "sad";
		String needle = "sad";
		int result = strStr(haystack, needle);
		System.out.println(result);
	}
	
	public static int strStr(String haystack, String needle) {
		
		int s1p1 = 0 , s1p2 = 0;
		int s2 = 0;
		
		if(!haystack.contains(needle) || needle.length() == 0) { 
			return -1;
		}
		
			
		while(s1p2<=haystack.length() && s2<=needle.length()) {
			
			if(haystack.charAt(s1p2) != needle.charAt(s2)) {
				
				s1p2 = ++s1p1 ;
				s2 = 0;
			
			}
			else {
							
				if(s2 == needle.length()-1 ) {
					return s1p1;
				}
				
				s1p2++;
				s2++;
				}
			}
				
		return -1;
	}
}




/* alternate solutions
 * 
 * 
  if(needle.isEmpty()) return 0;
        if(needle.length()>haystack.length()) return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            if(haystack.substring(i,i+needle.length()).equals(needle))
            {
                return i;
            }
        }
   
        return -1;
 * 
 */



/* my initial solution with counter
int s1 = 0 , p1 = 0;
int s2 = 0;
int count = 0;

if(!haystack.contains(needle)) { 
	return -1;
}

	
while(s1<=haystack.length() && s2<=needle.length()) {
	if(haystack.charAt(s1) != needle.charAt(s2)) {
		
		s1 = ++p1 ;
		s2 = 0;
		count = 0;
	}
	else {
		
		if(s2==needle.length()-1 && count== needle.length()-1) {
		
			return p1;
		}	
			s1++;
			s2++;
			count++;
		}
	}
	
	return -1;
}
}*/

/* Alternate solution 2
 * if (needle.isEmpty()) {
            return 0; 
        }
        int needleLength = needle.length();
        int haystackLength = haystack.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j = 0;
            while (j < needleLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needleLength) {
                return i; 
            }
        }
        return -1;
       good one */
 

