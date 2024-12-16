package week6Day2;

import org.testng.annotations.Test;

public class L1700_NumberofStudentsUnabletoEatLunch {
/*
 * 
 * Input: int array, for students and another for sandwiches
 * Output: int - no. of students unable to eat lunch.
 * Test Data:
 * Pseudocode:
 * 
 * stud.length - count is the result.
 * Each time matching occurs, increase the count.
 * start from students array and match with p2 pointer of second array.
 * if match occurs. increase count. increase p1 pointer and p2 pointer.
 * if no match then increase p2 pointer and set rear to current num.
 * do this when rear co
 * 
 * 
 */
	@Test
	public static void Test1() {
		int[] inpArray1 = {1,1,0,0};
		int[] inpArray2 = {0,1,0,1};
		
		System.out.println(countStudents(inpArray1,inpArray2));
	}
	
	@Test
	public static void Test2() {
		int[] inpArray1 = {1,1,1,0,0,1}; 
		int[] inpArray2 = {1,0,0,0,1,1};
		
		System.out.println(countStudents(inpArray1,inpArray2));
	}
	
	@Test
	public static void Test3() {
		int[] inpArray1 = {0,1,0,1,0,1,1,1,0,0,0,0,1,1,1}; 
		int[] inpArray2 = {0,1,0,1,1,0,0,1,1,1,0,1,0,1,0};
		
		System.out.println(countStudents(inpArray1,inpArray2));
	}
	public static int countStudents(int[] students, int[] sandwiches) {
		
		int p1 = 0, p2 = 0, count = 0;
		boolean noswap = true, matched = false;
		
		while(p2 < sandwiches.length && noswap ) { 
			 p1 = p1 % students.length;

			if(students[p1] == sandwiches[p2]) {
				 
				students[p1] = -1;
				p1++;
				p2++;
				matched = true;
				count = 0;
			}
			else {
				p1++;
				matched = false;
				count++;
				
			}
			if(count==students.length && !matched) {
				noswap = false;
			}
		}
		
		
		return  sandwiches.length-p2;
    }
	
	
}

//Alternate solutions best

/*int[] count = {0, 0};
for (int student : students) {
    count[student]++;
}
for (int sandwich : sandwiches) {
    if (count[sandwich] > 0) {
        count[sandwich]--;
    } else {
        return count[0] + count[1];
    }
}
return 0;*/
