package week7Day1;

import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class minCostRopeLen {

	@Test
	public static void Test1() {
		int arr[] = {4,3,2,6};
		int N = 4;
		System.out.println(findMinCost(arr,N));
	}
	public static int findMinCost(int[] nums, int k) {
		int sum = 0, cost = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(nums[i]);// 2,4,3,6
		}
		sum = pq.poll();
		for (int i = 1; i < nums.length; i++) {
			sum += pq.poll();
			cost += sum;
		}
		return cost;
		
		
	}
}
