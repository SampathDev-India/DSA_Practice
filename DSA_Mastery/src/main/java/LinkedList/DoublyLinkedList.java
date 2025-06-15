package LinkedList;

import com.oracle.truffle.api.nodes.Node;

public class DoublyLinkedList {
	
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		Node previous;
		public Node(int val) {
			super();
			data = val;
			next = null;
			previous = null;
		}
		
	}	
	
	// constructor -> set head & tail -> null
	public DoublyLinkedList() {
		super();
		head = null;
		tail = null;
	}


	public void insertAtBegining(int val) {
		
		Node newNode = new Node(val);
		
		if(head ==null) {
			head = newNode;
			tail = head;			
		}else {			
			newNode.next = head;
			head.previous = newNode;
			head = newNode;			
		}			
	}
	
public void insertAtEnd(int val) {		
		Node newNode = new Node(val);
		
		if(head ==null) {
			head = newNode;
			tail = head;			
		}else {			
			newNode.previous = tail;
			tail.next = newNode;
			tail = newNode;			
		}			
	}

	public void deleteHeadNode(){
		if(head == null) {
			System.out.println("This is empty can't delete ");
		}else {
			head =head.next;
			head.previous = null;
		}
		
	}
	
	public void deleteTailNode(){
		if(tail == null) {
			System.out.println("This is empty can't delete ");
			return;
		}else {
			tail = tail.previous;
			tail.next= null;			
		}		
	}
	
	public void display() {
		if(head == null) {
			System.out.println(" The list is Null ");
		}else {
			Node temp =head;
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;				
			}
		}		
	}
	
	public void displayRev() {
		if(head == null) {
			System.out.println(" The list is Null ");
		}else {
			Node temp =tail;
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.previous;				
			}
		}		
	
		
	}

}
