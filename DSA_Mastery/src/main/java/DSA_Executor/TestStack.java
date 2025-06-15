package DSA.program;

import Stack.ArrayStack;

public class TestStack {
	public static void main(String[] args) {
		System.out.println("Stack ");
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
//		stack.pop();
		stack.display();
		stack.peek();
	}
}
