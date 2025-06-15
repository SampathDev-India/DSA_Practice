package LinkedList;

import com.oracle.truffle.api.nodes.Node;

public class SinglyLinkedList {
	Node head; // initialize the head node
	
	// create the node class
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;	
			next = null;
		}
	}
	
	// create constructor mark it as null 
	public SinglyLinkedList() {
		super();
		head = null;
	}
	
	//Inserting the Values one by one
	public void insertAtBeginning(int val) {
		Node newNode = new Node(val);
		
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head; //new node next --> head Node
			head = newNode;			 
		}
	}
	
	//display the linked list existing values
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	//insert the value at the specific position 
	public void insertAtPos(int pos, int val) {
		
		if(pos ==0) { // if index 0
			insertAtBeginning(val);
			return;
		}
		
		Node newNode = new Node(val);
		Node temp = head;
		for(int i=1;i<pos;i++) { 
			temp = temp.next; //each iteration we move the node 
			
			if(temp == null) {
				throw new IllegalArgumentException("Argument possition value not available");
//				System.out.println("\n Invalid Possition");
//				return ;
			}
		}
		
		newNode.next= temp.next;
		temp.next = newNode;
	}
	
	//Get the value in the specific possition
	public void getIndexPossition(int pos) {
		Node temp = head;
		for(int i=1;i<pos;i++) { 
			temp = temp.next; //each iteration we move the node 			
		}		
		System.out.println("\n"+pos+" Possition = "+ temp.data);		
	}
	
	//delete at position
	public void deleteAtPos(int pos) {
		
		if(head ==null) {
			throw new IndexOutOfBoundsException("Given possition not available in this possitions");
		}
		Node temp = head;
		Node pre= null;
		for(int i=1;i<pos;i++) { 
			pre = temp;
			temp = temp.next; //each iteration we move the node 			
		}				
		pre.next = temp.next;
	}
	
//	delete the head node
	public void deleteHeadNode(){	
		head = head.next;
		return;
	}
	
	// reverse the linked list 
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = current.next;
		
		while(current != null) {
			next = current.next ;
			current.next = prev;  // this is reverse link 
			prev = current;
			current = next;
		}
		head = prev;
		
	}
	

}
