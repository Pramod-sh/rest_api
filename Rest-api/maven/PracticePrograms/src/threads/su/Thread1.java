package threads.su;

public class Thread1 implements Runnable {
	
	public void run() {
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) {
	Main m1=new Main();
	Thread t2=new Thread(m1);
	t2.start();

	}

}
