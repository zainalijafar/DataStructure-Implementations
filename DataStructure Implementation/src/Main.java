public class Main {

	public static void main(String[]args) {
		
		LinkedList list = new LinkedList(1);
		list.insertItem(2);
		list.insertItem(4);
		list.insertItem(6);
		list.insertItem(8);
		
		list.printList();
		System.out.println();
		list.deleteItem(2);
		System.out.println("Updated list : ");
		list.printList();
		
/*		Queue q = new Queue();
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		q.showAll();
		System.out.println();
		q.dequeue();
		q.showAll();
		System.out.println();
		q.enqueue(4);
		q.showAll();
		q.dequeue();
		System.out.println();
		q.showAll(); */
		
/*		Stack s = new Stack();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		s.push(5);
		System.out.println(s.pop());
		System.out.println(s.pop()); */
	}
}