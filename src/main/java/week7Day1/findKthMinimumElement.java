package week7Day1;

import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class findKthMinimumElement {

	@Test
	public static void Test1(){
		 int[] nums= {3,16,4,8,5,12};
		 int k=3;
		 System.out.println(findKMinElement(nums,k));
	}
	
	public static int findKMinElement(int[]nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
//		int answer=0; 
//		//PriorityQueue<Integer> prior = new PriorityQueue<>((a,b)->b-a);
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		for(int i=0; i<nums.length;i++) {
//			pq.add(nums[i]); 
//		}
//		
//		while(k>0) {
//			answer = pq.poll();
//			k--;
//		}
//		return answer;
//		
//	}
		
	//	PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
		for (int i=0;i<k;i++) {
			pq.add(nums[i]);
		}
		
		for(int i=k;i<nums.length;i++) {
			if(nums[i]<pq.peek()) { // 9<7
				pq.poll();
				pq.add(nums[i]); //
			}
		}
		return pq.poll();
		
	}
		
	
}
