package DSA.program;

import Queue.QueueUsingArray;

public class TestQueue {
	public static void main(String[] args) {
		System.out.println("Queue Test");
		
		QueueUsingArray queue = new QueueUsingArray();
		queue.enqueue(1);
		
		queue.dequeue();
	}

}
