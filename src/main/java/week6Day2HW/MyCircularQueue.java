package week6Day2HW;

public class MyCircularQueue {
	
		private int front;
	    private int rear;
	    private int[] q;
	    private int capacity;
	    private int size;

	    public MyCircularQueue(int k) {
	    	
	    	this.front=-1;
	        this.rear=-1;
	        this.size=0;
	        this.capacity=k;
	        q= new int[capacity];
	    	
	    
	    }
	    
	    public boolean enQueue(int value) {
	    	 if(isFull()){
	             System.out.println("Queue is full...element can't be added...");
	             return false;
	         }
	         else if (rear==capacity-1 && front==0 || (rear==(front-1)%capacity)){
	             System.out.println("Queue is full...element can't be added...");
	             return false;
	         }
	         else if(front==-1 && rear==-1){
	             front=0;
	             rear=0;
	             q[rear]=value;
	             size++;
	         }
	         else {
	             rear=(rear+1)%capacity;
	             q[rear]=value;
	             size++;
	         }
	    	
	    	return true;
	        
	    }
	    
	    public boolean deQueue() {
	    	if(isEmpty()){
	            System.out.println("Queue is empty");
	            return false;
	        }
	        if(front==rear){
	            q[front]=0;
	            size--;
	            rear=-1;
	            front=-1;
	        }else {
	            q[front]=0;
	            front=(front+1)%capacity;
	            size--;
	        }
	        return true;
	    }
	    
	    public int Front() {
	        if(isEmpty()) {
	        	return -1;
	        }
	        else {
	        	return q[front];
	        }
	    }
	    
	    public int Rear() {
	        
	    	 if(isEmpty()) {
		        	return -1;
		        }
		        else {
		        	return q[rear];
		        }
	    }
	    
	    public boolean isEmpty() {
	        
	    	return front==-1;
	    	
	    }
	    
	    public boolean isFull() {
	     
	    	return size==capacity;
	    }
	    
	    public static void main(String[] args) {
	    	MyCircularQueue obj = new MyCircularQueue(5);
	    	int value = 1;
			boolean param_1 = obj.enQueue(value );
			boolean param_11 = obj.enQueue(value );
			boolean param_12 = obj.enQueue(value );
			System.out.println(param_1);
			boolean param_2 = obj.deQueue();
			System.out.println(param_2);
			int param_3 = obj.Front();
			System.out.println(param_3);
			int param_4 = obj.Rear();
			System.out.println(param_4);
			boolean param_5 = obj.isEmpty();
			System.out.println(param_5);
			boolean param_6 = obj.isFull();
			System.out.println(param_6);
	    }
	    
	}

	/**
	 * Your MyCircularQueue object will be instantiated and called as such:
	 * MyCircularQueue obj = new MyCircularQueue(k);
	 * boolean param_1 = obj.enQueue(value);
	 * boolean param_2 = obj.deQueue();
	 * int param_3 = obj.Front();
	 * int param_4 = obj.Rear();
	 * boolean param_5 = obj.isEmpty();
	 * boolean param_6 = obj.isFull();
	 */


