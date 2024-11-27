package randomProblems;

import org.testng.annotations.Test;

public class L371_Sum_of_Two_Integers {
	
	@Test
	public static void Test1() {
		int num1 = 2;
		int num2 = 7;
		int sum = getSum(num1,num2);
		System.out.println(sum);
	}
	public static int getSum(int a, int b) {
	       while (b != 0) { int carry = a & b; // Calculate the carry bits
	        a = a ^ b; // Sum bits without considering carry
	         b = carry << 1; // Shift carry bits to the left 
	         } 
	         return a; 
	    }
}
