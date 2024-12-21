package week6Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class G_N_meetings_in_one_room {
	/*
	 * Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.


	Input: intervals = [[0,30],[5,10],[15,20]]
	Output: false


	 Input: intervals = [[7,10],[2,4]]
	 Output: true

	 * 
	 * 
	 */
		@Test
		public static void Test1() {
			int[] inpArray1 =  {1, 3, 0, 5, 8, 5};
			int[] inpArray2 =  {2, 4, 6, 7, 9, 9};
			System.out.println(findMaxNoOfMeeting(inpArray1,inpArray2));
		}
		
		@Test
		public static void Test2() {
			int[] inpArray1 =  {10, 12, 20};
			int[] inpArray2 =  {20, 25, 30};
			System.out.println(findMaxNoOfMeeting(inpArray1,inpArray2));
		}
		
		public static int findMaxNoOfMeeting(int[] start,int[] end) {
			int result = 1;
			Arrays.sort(start);
			Arrays.sort(end);
		//	int starti = intervals[0][0];
		//	int temps = intervals[0][0];
			int endi = end[0];
		//	int tempe = intervals[0][1];
			
			for(int i =1;i<start.length;i++) {
				if(start[i] > endi) {
					result++;
			//		return false;
				}
			 	else {
				//	starti=intervals[i][0];
					//result++;
					 endi=end[i];
			 	}
			
			}
				
			
				return result;
			
			
			
			
		}
	
}
