
public class Stack {

	private int total; 
	private int size; 
	private int top;
	private int [] stack;
	
	public Stack() {
		
		total = 0;
		size = 50;
		top = 0; 
		stack = new int [size];	
	}
	
	public boolean isFull() {
		
		if(total==size) {
			return true;
		}
		return false;
	}
	
	public boolean push(int a) {
		
		if(!isFull()) {
			stack[top] = a;
			top++;
			total++;
			return true;
		}
		return false;
	}
	
	public int pop() {
		
		top--;
		int item = stack[top];
		total--;
		return item;
	}
	
	public void showAll() {
		
		if(total!=0) {
			
			for(int i=0; i<total; i++) {
				System.out.print(stack[i] + " ");
			}
		}
	}
}