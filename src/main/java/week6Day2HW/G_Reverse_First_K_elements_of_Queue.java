package week6Day2HW;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.testng.annotations.Test;



public class G_Reverse_First_K_elements_of_Queue {
/*
 * 
 * Input: Queue and integer
 * Output : Queue
 * 
 * 
 */
	@Test
	public static void Test1() {
		
		int k = 3;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println(modifyQueue(queue,k));
		
	}
	
	public static Queue<Integer> modifyQueue(Queue<Integer> queue, int K){
		
		if (queue == null || K <= 0 || K > queue.size()) {
			
			return queue; 
			
			} 
		Stack<Integer> stack = new Stack<>(); 
		
		for (int i = 0; i < K; i++) {
			
			stack.push(queue.remove()); 
		} 
		
		while (!stack.isEmpty()) { 
			
			queue.add(stack.pop()); 
		} 
		
		int size = queue.size(); 
		
		for (int i = 0; i < size - K; i++) {
			
			queue.add(queue.remove()); 
			
			} 
		
		return queue;
	}
}
