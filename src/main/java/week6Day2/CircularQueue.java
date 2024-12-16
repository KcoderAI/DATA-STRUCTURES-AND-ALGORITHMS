package week6Day2;

public class CircularQueue {

    private int front;
    private int rear;
    private int[] q;
    private int capacity;
    private int size;

    public CircularQueue(){
        this.front=-1;
        this.rear=-1;
        this.size=0;
        this.capacity=10;
        q= new int[capacity];
    }
    public CircularQueue(int capacity){
        this.front=-1;
        this.rear=-1;
        this.size=0;
        this.capacity=capacity;
        q= new int[capacity];
    }
    // it adds up the element to queue
    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full...element can't be added...");
            return;
        }
        else if (rear==capacity-1 && front==0 || (rear==(front-1)%capacity)){
            System.out.println("Queue is full...element can't be added...");
        }
        else if(front==-1 && rear==-1){
            front=0;
            rear=0;
            q[rear]=item;
            size++;
        }
        else {
            rear=(rear+1)%capacity;
            q[rear]=item;
            size++;
        }
    }
    // it removes the element from queue
    public void deque(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
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
    }
    // it returns the element at top
    public int peek(){
        if(isEmpty()) System.out.println("Queue is empty..");
        return q[front];
    }
    // it returns the element at top and delete it
    public int poll(){
        if(isEmpty()) {
            System.out.println("Queue is empty.. returning with garbage value");
            return Integer.MIN_VALUE;
        }
        int ele = q[front];
        q[front]=0;
        front=(front+1)%capacity;
        size--;
        return ele;
    }
 // this returns the number of elements present inside the queue
    public int getSize() {
        return size;
    }
    public boolean isFull(){
        return size==capacity;
    }

    //5 (0,1,2,3,4,5)

    public boolean isEmpty(){
       // return size==0;
        return front==-1;
    }

    public static void main(String[] args) {

        CircularQueue simpleQueue = new CircularQueue(3);
      
        simpleQueue.enqueue(5);
        simpleQueue.enqueue(3);
        simpleQueue.enqueue(4);
        // expect overflow message
        simpleQueue.enqueue(2);
        simpleQueue.deque();
        simpleQueue.enqueue(2);


//        simpleQueue.enqueue(2);
//        simpleQueue.enqueue(1);
//        simpleQueue.enqueue(1);
    }
}