package week6Day2;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MinimumPlatforms {

	/*
	 * 
	 * 
	 * Input: two integer arrays
	 * Output: int (maximum number of platforms)
	 * Test Data:
	 * Pseudocode:
	 * 
	 * 
	 */
	@Test
	public static void Test1() {
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		System.out.println(findMinimumPlatform(arr,dep));
	}
	
	@Test
	public static void Test2() {
		int[] arr = {900, 1235, 1100};
		int[] dep = {1000, 1240, 1200};
		System.out.println(findMinimumPlatform(arr,dep));
	}
	
	@Test
	public static void Test3() {
		int[] arr = {1000, 935, 1100};
		int[] dep = {1200, 1240, 1130};
		System.out.println(findMinimumPlatform(arr,dep));
	}
	
	public static int findMinimumPlatform(int[] arr, int[] dep) {
		
		int count = 1,platform = 1;
		int p1=1,p2=0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		
		while(p1<arr.length&&p2<dep.length) {
			if(arr[p1]<=dep[p2]) {
				platform++;
				p1++;
			}
			else {
				platform--;
				p2++;
			}
			count = Math.max(platform, count);
		}
		
		
		
		return count;
		
	}
}
