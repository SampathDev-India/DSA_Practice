package ArrayList;

import java.util.Iterator;
import java.util.Scanner;

public class DynamicArrayDemo {
public static void main(String[] args) {
	
	int val, pos;
	DynamicArray<Integer> list = new DynamicArray<>();
	Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("\n"+"__________ List Menu _____________________");
			System.out.println("1. Insert At End");
			System.out.println("2. Display the List");
			System.out.println("3. Insert At the specific possiton");
			System.out.println("4. Delete from specific possiton");
			System.out.println("5. Exit");
			System.out.println("__________________________________________");
			System.out.println(" Enter the Choice : ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Enter the Data to Insert : ");
				val = scan.nextInt();
				list.add(val);
				break;
			case 2: 				
				list.display();
				break;
			case 3: 
				System.out.println("Enter possition to insert : starts with 0");
				pos = scan.nextInt();
				System.out.println("Enter Value ");				
				val = scan.nextInt();
				list.add(pos,val);
				break;
			case 4: 
				System.out.println("Enter possition to Delete : starts with 0");
				pos = scan.nextInt();
				if(pos <0) {
					System.out.println("Invalid Possition");
				}				
				list.delete(pos);
				break;
				
			case 5: 
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice");
			
			}
	}
}
}

class DynamicArray<T> implements Iterable<T>{
	
	static final int initialCapacity =16;
	private T arr[];	
	private int size;
	private int capacity;
	
	
	public  DynamicArray() {
		super();
		size =0;
		arr = (T[]) new Object[initialCapacity];
		capacity = initialCapacity;
	}

	//insert the Value at the End
	public void add(T val) {
		if(size == capacity)
			expandArray();
		
		arr[size++] = val;
	}
	
	// if the size has full increase size 
	private void expandArray() {
		capacity *=2;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}
	
	//Insert the value at the specific possition  size =3, pos =1  1,3,4
	public void add(int pos, T val) {
		if(size == capacity)
			expandArray();
		if(pos == size+1) {
			arr[size++] = val;
		}
		for(int i=size-1;i>=pos;i--) {
			arr[i+1] = arr[i];			
		}
		arr[pos] = val;
		size++;			
	}
	
	//Display the Array
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");			
		}
	}
		
	//delete the specific element based on possition
	public void delete(int pos) {
		for(int i= pos+1;i<size;i++) {
			arr[i-1]= arr[i];
		}
		size --;	
		
		if(capacity > initialCapacity && capacity > 3*size) {
			shrinkArray();
		}
	}
	
	//Shrink array when more space
	private void shrinkArray() {
		
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>(){
			int index =0;
			public T next() {
				return arr[index++];
			}
			public boolean hasNext() {
				return index <size;
			}
			
		};
	}
	
	}