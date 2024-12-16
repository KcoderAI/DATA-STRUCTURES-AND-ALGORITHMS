package week5Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class L2022_Convert_1D_Array_Into_2D_Array {
/*
 * Input: int array , m and n for rows and columns
 * Output: 2d array
 * Test Data:
 * Input: original = [1,2,3,4], m = 2, n = 2
 * Output: [[1,2],[3,4]]
 * 
 * Input: original = [1,2,3], m = 1, n = 3
 * Output: [[1,2,3]]
 * 
 * Input: original = [1,2], m = 1, n = 1
 * Output: []
 * 
 * 
 * Pseudocode:
 * check whether length of array has m*n elements. if not return empty 2d array.
 * 
 * two nested for loops. 
 * [i] [j] until m rows - i is 
 * 
 * 
 * 
 * 
 * 
 */
	@Test
	public static void Test1() {
		int[] inpArray = {1,2,3,4};
		int m = 2, n = 2;
		
		System.out.println(Arrays.deepToString(convert1DTo2D(inpArray, m, n)));
	}
	
	@Test
	public static void Test2() {
		int[] inpArray = {1,2,3};
		int m = 1, n = 3;
		
		System.out.println(Arrays.deepToString(convert1DTo2D(inpArray, m, n)));
	}
	
	
	@Test
	public static void Test3() {
		int[] inpArray = {1,2};
		int m = 1, n = 1;
		
		System.out.println(Arrays.deepToString(convert1DTo2D(inpArray, m, n)));
	}

	@Test
	public static void Test4() {
		int[] inpArray = {2};
		int m = 1, n = 1;
		
		System.out.println(Arrays.deepToString(convert1DTo2D(inpArray, m, n)));
	}
	
	
	public static int[][] convert1DTo2D(int[] original, int m, int n){
		
		if(original.length!=(m*n)) {
		
			return new int[][] {};
		
		}
		
		int[][] output2D = new int[m][n];
		int index = 0;
		
		for (int i = 0;i<m;i++) {
			for (int j = 0;j<n;j++) {
				output2D[i][j] = original[index];
				index++;
						
				
			}
		}
		
		
		
		return output2D;
		
	}
	
}


/*Alternate solutions
 * public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][];
        
        switch (m * n == original.length ? 1 : 0) {
            case 1:
                int i = 0;
                while (i < m) {
                    result[i] = Arrays.copyOfRange(original, i * n, i * n + n);
                    i++;
                }
                break;
            default:
                return new int[0][0];
        }

        return result;
    }*/
