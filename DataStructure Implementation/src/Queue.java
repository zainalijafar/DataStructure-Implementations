public class Queue {

	private int total;
	private int front;
	private int rear; 
	private int size;
	private int [] queue;
	
	public Queue() {
		
		total = 0;
		front = 0;
		rear = 0;
		size = 50;
		queue = new int[size];
	}
	
	public boolean isFull() {
		
		if(total == size) {
			return true;
		}
		return false;
	}
	
	public boolean enqueue(int a) {
		
		if(!isFull()) {
			
			queue[rear] = a;
			rear = (rear+1) % size;
			total ++;
			return true;
		}
		return false;
	}
	
	public int dequeue() {
		
		int item = queue[front];
		front++;
		total--;
		return item;
	}
	
	public void showAll() {
		
		int f = front;
		
		if(total!=0) {
			
			for(int i=0; i<total; i++) {
				System.out.print(queue[f]+ " ");
				f = (f + 1)%size;
			}
		}
	}
}