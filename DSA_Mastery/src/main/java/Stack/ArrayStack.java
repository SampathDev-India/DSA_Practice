package Stack;

public class ArrayStack<T> {

	static final int MAX_SIZE = 30;
	T arr[] = (T[])new Object [MAX_SIZE];
 	int top;
 	
 	
 	
 	public ArrayStack() {
		super();
		top =-1;
	}

	public void push(T val) {
		if(top == MAX_SIZE-1) {
			throw new IndexOutOfBoundsException("Stack over flow");
		}	else {
			arr[++top] = val;
		}
		
		
 	}
 	
 	public T pop() {
 		if(top == -1) {
 			throw new IndexOutOfBoundsException("Stack underFlow");
 		}else {
 	 		return arr[top--];

 		}
 		
 	}
 	public T peek() {
 		if(top == -1) {
 			throw new IndexOutOfBoundsException("Stack underFlow");
 		}else {
 	 		return arr[top];

 		}
 	}
 	
 	public boolean isEmpty() {
 		if(top == -1) {
 			return true;
 		}else {
 			return false;
 		}
 		
 	}
 	
 	public void display() {
 		int temp = top;
 		while(temp != -1) {
 			System.out.print(arr[temp]+" ");
 			temp --;
 		}
 	}
 	
}
