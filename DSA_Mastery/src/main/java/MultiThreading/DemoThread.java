package MultiThreading;

public class DemoThread extends Thread{
	public void run() {
		int n =5;
		for(int i=1;i<n ;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
		
	}

}
