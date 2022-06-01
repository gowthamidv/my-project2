package multithreading;

public class thread2 extends Thread {
	int i=0;
	public void run() {
		System.out.println("thread1 started");
		while(i<4) {
			System.out.println("value of thread1:" + i);
			i++;
		}
		System.out.println("thread1 finished");
		}
	}

