package DSA_Executor;


import MultiThreading.DemoRunnable;
import MultiThreading.DemoSynchonization;
import MultiThreading.DemoThread;

public class TestMultiThreading {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("TestMultiThreading started ");
		DemoThread t1 = new DemoThread();
		t1.start();		
		if(t1.isAlive()) { // ------------------- check the thread still is its running or completed 
			System.out.println("T1 thread still is alive ");
		}
		System.out.println("before Set 10 -> "+t1.getPriority());

		t1.setPriority(Thread.MAX_PRIORITY); // ------- set the priority . Priority basis Thread_Sceduler execute the threads 
		System.out.println("After Set 10 -> "+t1.getPriority());
		t1.join();  // ------------------- wait the thread until t1 thread as complete
		System.out.println("bye ");
		
		
		
		
		//-------------- Runnable Thread Check ---------------
		DemoRunnable r1 = new DemoRunnable();
		Thread t2 = new Thread(r1);
		t2.start();
		
		
		//-------------- Synchronized method -----------
		DemoSynchonization s = new DemoSynchonization();
		System.out.println("Syynchronization satrts here ......");
		Thread s1 = new Thread () {
			public void run() {
				try {
					s.printTens(4);
				} catch (InterruptedException e) { e.printStackTrace(); }								
			}
		};
		
		Thread s2 = new Thread () {
			public void run() {
				try {
					s.printTens(7);
				} catch (InterruptedException e) { e.printStackTrace(); }								
			}
		};
		
		s1.start();
		s2.start();		
		
	}
} 
