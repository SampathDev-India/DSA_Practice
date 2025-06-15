package LinkedList;

import java.util.Iterator;

public class LinkedListExcecise1<T> implements Iterable<T>{
	// 2. Initialize the head
		Node head;
		
	// 1. create the node class
	class Node{
		T data;
		Node next;
		Node(T d){
			data=d;			
		}
	}
	
	
	//3. constructor set head = null
	public LinkedListExcecise1() {		
		head = null;
	}
	
	
	//Insert the node
	public void insertNode(T val) {
		//node created
		Node newNode = new Node(val);		
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}	
	}
	
	//display the all nodes
	public void display(){
		Node temp =head;
		while(temp != null) {	
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	//update the value
		public void updateVal(T val, int pos){
			if(head ==null) {
				throw new IndexOutOfBoundsException("head null");
			}else {
				Node temp =head;
				Node pre =temp;
				for(int i=1;i<pos;i++) {
					temp = temp.next;	
					if(temp == null) {
						System.out.println(" out of boundary");
						return;
					}
				}
				temp.data = val;
						
			}						
		}
		
		//Inset at end
				public void insetAtEnd(T val){
					if(head ==null) {
						throw new IndexOutOfBoundsException("head null");
					}else {
						Node temp =head;
						Node pre =temp;
						Node newNode = new Node(val);
						while(temp != null) {
							pre = temp;
							temp = temp.next;					
						}			
						pre.next = newNode; 
//						return;
					}						
				}
		
		//delete at end
				public void deleteAtEnd(){
					if(head ==null) {
						throw new IndexOutOfBoundsException("head null");
					}else {
						Node temp =head;
						Node pre =temp;
						while(temp.next != null) {
							pre = temp;
							temp = temp.next;					
						}			
						pre.next = null; 
//						return;
					}						
				}
				
				//search value return the index 
				public void searchValueIndex(T val) {
					if(head ==null) {
						throw new IndexOutOfBoundsException("head null");
					}
						Node temp ;
						temp = head;
						int index =0;
						
						while(temp != null) {
							if(temp.data ==val) {
							System.out.println("\n Given the Value "+ val+ " is present in "+index);
							return;
							}
							temp = temp.next;	
							index++;
							
						}
						System.out.println("Given the Value "+ val+ " Not available in the linked list ");
				}
				
				//reverse the linked list
				public void reverse() {
					Node prev = null;
					Node cur = head;
					Node next = cur.next;
					
					while(cur != null) {
						next = cur.next;
						cur.next = prev;
						prev = cur;
						cur= next;
					}
					head =prev;
				}


				@Override
				public Iterator<T> iterator() {
					// TODO Auto-generated method stub
					return new Iterator<T>() {
						Node temp = head;
						
						public boolean hasNext(){
							return temp!=null;
						}
						
						public T next() {
							T val = (T) temp.data;
							temp = temp.next;
							return val;
						}
						
					};
				}
				




	

}
