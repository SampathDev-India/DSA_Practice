package DSA.program;

import LinkedList.CircularLinkedList;
import LinkedList.DoublyLinkedList;
import LinkedList.SinglyLinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		System.out.println("Test the Linked List Modules");
		
//		System.out.println("Test Singly Linked List");
//		SinglyLinkedList sl = new SinglyLinkedList();		
//		sl.insertAtBeginning(1);
//		sl.display();
		
		System.out.println("Test Circular LinkedList");
		CircularLinkedList<Integer> cl = new CircularLinkedList<>();

		cl.insertAtBegining(11);
		cl.insertAtBegining(11);
		cl.insertAtEnd(99);
		cl.display();
		
		
	}

}
