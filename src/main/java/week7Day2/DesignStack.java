package week7Day2;

 

public class DesignStack {
	//private int rear;
		private int size;
		private int capacity;
		private int[] stack;
		
		public DesignStack() {
			//this.rear=-1;
			this.size=0;
			this.capacity=10;
			stack=new int[capacity];
		}
		
		public void push(int value) {
			if(isFull()) {
				System.out.println("Stck is full");
			}
			else
				stack[size]=value;
				size++;
		}
		
		public int peek() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			
			return stack[size-1];  
		}
		
		public int pop() {
			if(isEmpty()) {
				System.out.println("nothing to pop");
				return -1;
			}
			size--;
			return stack[size];
			
		}
		
		public boolean isFull() {
			return size==capacity;
		}
		
		public boolean isEmpty() {
			return size==0;
		}
		
		public int getSize() {
			return size;
			//return stack.length;
		}
		
		public static void main(String[] args) {
			DesignStack stack = new DesignStack();
			System.out.println(stack.getSize());
			stack.push(5);
			System.out.println(stack.getSize());
			System.out.println(stack.peek());
			//System.out.println(stack.pop());
			stack.pop();
			System.out.println(stack.getSize());
		}
		

}
