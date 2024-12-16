package week6Day2;
public class SimpleQueue {

	private int front;
	private int rear;
	private int[] q;
	private int capacity;
	private int size;

	public SimpleQueue() {
		this.front = -1;
		this.rear = -1;
		this.size = 0;
		this.capacity = 10;
		q = new int[capacity];
	}

	public SimpleQueue(int capacity) {
		this.front = 0;
		this.rear = -1;
		this.size = 0;
		this.capacity = capacity;
		q = new int[capacity];
	}

	// it adds up the element to queue
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full..  ");
		} else {
			rear++;
			q[rear] = item;
			size++;
		}
	}

	// it removes the element from queue
	public void deque() {
		if (isEmpty())
			System.out.println("Queue is empty.. returning with garbage value");
		else {
			// int ele = q[front];
			q[front] = 0;
			front++;
			size--;
		}
	}
	
	// it returns the element at top
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty..");
			return -1;
		}
		return q[front];
	}

	// it returns the element at top and delete it
	public int poll() {
		if (isEmpty()) {
			System.out.println("Queue is empty.. returning with garbage value");
			return Integer.MIN_VALUE;
		}
		int ele = q[front];
		q[front] = 0;
		front++;
		size--;
		return ele;
	}

	// this returns the number of elements present inside the queue
	public int getSize() {
		return size;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// 5 - 6 (0,1,2,3,4,5)

	public boolean isEmpty() {
		// return size==0;
		return front == -1;
	}

	public static void main(String[] args) {

		SimpleQueue simpleQueue = new SimpleQueue(5);
		System.out.println("aaa");
		
		System.out.println(simpleQueue.getSize());
		System.out.println(simpleQueue.isEmpty());
		System.out.println(simpleQueue.isFull());
		
		simpleQueue.enqueue(3);
		System.out.println(simpleQueue.getSize());

		System.out.println(simpleQueue.peek());
		System.out.println(simpleQueue.getSize());

//		simpleQueue.deque();

		
		// Queue<Integer> integers = new LinkedList<>();
		// ArrayDeque<Integer> q = new ArrayDeque<>();
		// integers.pe
	}
}
