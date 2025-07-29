package MultiThreading;

public class DemoSynchonization {
	public synchronized void printTens(int n) throws InterruptedException {		
		for(int i=1;i<n ;i++) {
			System.out.println(i*10);
			Thread.sleep(2000);
		}
		
	}

}
