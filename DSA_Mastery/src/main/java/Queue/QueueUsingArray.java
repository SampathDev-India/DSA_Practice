package Queue;

public class QueueUsingArray {
	static final int MAX_SIZE = 30;
	int arr[];
	int front,rear ;
	
	public QueueUsingArray() {
		super();
		arr = new int[MAX_SIZE];
		front =-1;
		rear = -1;
	}
	
	public void enqueue(int val) {
		if(rear == MAX_SIZE -1) {
			throw new IndexOutOfBoundsException("Queue is Full");
		}
		
		if(front ==-1)
			front++;
		arr[++rear] =val;
	}
	
	public int dequeue() {
		if(front == -1 || front > rear)
			throw new IndexOutOfBoundsException("Queue is empty");
	
		int temp = arr[0];
		 for(int i=1;i<= rear;i++) {
			 arr[i-1]= arr[i];
		 }
		
		 System.out.println(" "+temp);
		return temp;
	}
	
	
	

}
