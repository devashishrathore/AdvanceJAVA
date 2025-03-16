package multitasking;

//(2) Performing single task from multiple thread ->

//Example:-
public class ThreadCaseSTMT extends Thread {
	public void run() {
		System.out.println("Performing single task from multiple thread");
	}

	public static void main(String[] args) { // main method creates main thread that is always created by default by
												// JVM. So here is 5 threads.

		ThreadCaseSTMT m = new ThreadCaseSTMT(); // First Thread
		m.start();
		ThreadCaseSTMT m1 = new ThreadCaseSTMT(); // Second Thread
		m1.start();
		ThreadCaseSTMT m2 = new ThreadCaseSTMT(); // Third Thread
		m2.start();
		ThreadCaseSTMT m3 = new ThreadCaseSTMT(); // Fourth Thread
		m3.start();
	}
}
