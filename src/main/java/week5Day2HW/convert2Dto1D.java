package week5Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class convert2Dto1D {
/*
 * Input: 2D matrix
 * Ouput: 1d array
 * Test Data:
 * {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
 * Pseudocode:
 * rows is matrix.length.
 * column is matrix(0).length.
 * output 1D array is rows*column length.
 * 
 * define two nested for loops, one for row and for column.
 * for each row, until rows
 * 			for each column until column.							
 * 				fill the output 1d array with row and column values.
 * 				increment 1d array index.
 * 
 * return result.
 */
	@Test
	public static void Test1() {
		int[][] inpArray = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(convert2DTo1D(inpArray)));
						
		}
	public static int[] convert2DTo1D(int[][] matrix) {
		
		if(matrix == null || matrix.length == 0) {
			return new int[] {};
		}
		
		int rows = matrix.length;
		int columns = matrix[0].length;
		int[] result = new int[rows*columns];
		int index = 0;
		
		for(int i=0;i<rows;i++) {
			for(int j = 0;j<columns;j++) {
				result[index] =  matrix[i][j];
				index++;
			}
		}
		return result;
	}
}
