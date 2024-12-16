package week5Day2HW;

import org.testng.annotations.Test;

public class L74_Search_a2DMatrix {
	@Test
	public static void Test1() {
		int[][] inputArr = {{1,2,3},{4,5,6},{7,8,9}};
		int k = 0;
		System.out.println(searchA2DMatrix(inputArr,k));
	}
	
	public static boolean searchA2DMatrix(int[][] matrix, int target) {
		
		
		int rows = matrix.length;
		int columns = matrix[0].length;
		int low = 0, high = (rows*columns)-1;
				
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			// int mid = low + (high-low)/2; ( To avoid overflow)
			if(matrix[mid / columns][mid % columns] == target) {
				return true;
			}
			else if(matrix[mid / columns][mid % columns] > target) {
				
				high = low - 1;
				
			}
			else {
				low = mid + 1;
			}
		}
		
		return false;
	}
}
