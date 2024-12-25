package week5Day2HW;

import org.testng.annotations.Test;

public class L69_Sqrtx {
//https://leetcode.com/problems/sqrtx/description/
	/*
	 * Input: integer
	 * Output: integer(square root)
	 * 
	 * Test Data:
	 * Pseudocode:
	 * starting from the given number set right pointer and 1 to left pointer
	 * find the mid . calculate the square if it is greater than given integer, place high = mid-1.
	 * if calculated square is lesser than given integer then, place low = mid+1;
	 * do this until both are equal and return.
	 * 
	 * 
	 * 
	 */
	
	@Test
	public static void Test1() {
		
		int x = 4;
		System.out.println(findSquareRoot(x));
		
	}
	
	@Test
	public static void Test2() {
		
		int x = 8;
		System.out.println(findSquareRoot(x));
		
	}
	public static int findSquareRoot(int x) {


		if(x==0){
			
            return 0;
        
		}
		int high = x, low = 1;  
		
		while(low <= high) {
			
			int mid = (low+high)/2;  
			
			//if(mid*mid == x)
			
			if(mid == (x/mid)) {  
				return mid;
			}
			else if (mid > (x/mid) ) {   
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return high;
	}
}
