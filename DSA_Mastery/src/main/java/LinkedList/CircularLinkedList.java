package LinkedList;

public class CircularLinkedList <T>{
	Node last;
	
	class Node {
		T data;
		Node next;
		public Node(T val) {
			super();
			data = val;
		}		
	}

	public CircularLinkedList() {
		super();
		last = null;
	}
	
	// insert at the beggining 
	public void insertAtBegining(T val) {
		Node newNode = new Node(val);
		if(last == null) {
			last = newNode;
			last.next = last;
		}else {
			newNode.next = last.next;
			last.next = newNode;
		}
	}
	
	//insert at the end 
	public void insertAtEnd(T val) {
		Node newNode = new Node(val);
		
		newNode.next = last.next;
		last.next = newNode;
//		newNode = last;
		last = newNode;
	}
	
	public void display() {
		Node temp =last.next;
		
		if(last == null ) {
			System.out.println("Circular Linked List Empty");
			return;
		}else if(temp == last) {
			System.out.println(temp.data);	
			return;
		}
		
		do {
			System.out.print(temp.data+" ");
			temp = temp.next;
			
		}while(temp.next != last);
		
		
		
	}
	

}
