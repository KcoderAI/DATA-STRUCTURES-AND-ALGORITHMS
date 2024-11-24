package week3Day1;

import java.util.Arrays;

import org.testng.annotations.Test;


public class TwoDimensionalArraysumToExplain2D {
	
	
	@Test
	public static void Test1() {
		twoDArray();
	}	
	
	public static void twoDArray() {
	int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
    int sum=0;
    // go over the rows
    // O(n^2)
    for (int i=0;i<nums.length;i++){
        // go over the colums
        for(int j=0;j<nums[0].length;j++){
            sum+=nums[i][j];
        }
    }
    System.out.println(Arrays.deepToString(nums));
    System.out.println(sum);
}
}
