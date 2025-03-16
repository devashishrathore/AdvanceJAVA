package multitasking;

//(4) Performing multiple task from multiple thread ->

//Example:- 

class ThreadCasesMTMT extends Thread {
	public void run() { // Task-1
		System.out.println("Performing multiple task from multiple thread TASK 1");
	}

	public static void main(String[] args) { // main method creates main thread that is always created by default by
												// JVM. So here is 5 threads.

		ThreadCasesMTMT t = new ThreadCasesMTMT(); // First Thread
		t.start();
		MTMT1 t1 = new MTMT1(); // Second Thread
		t1.start();
		MTMT2 t2 = new MTMT2(); // Third Thread
		t2.start();
		MTMT3 t3 = new MTMT3(); // Fourth Thread
		t3.start();
	}
}

class MTMT1 extends Thread {
	public void run() { // Task-2
		System.out.println("Performing multiple task from multiple thread TASK 2");
	}
}

class MTMT2 extends Thread {
	public void run() { // Task-3
		System.out.println("Performing multiple task from multiple thread TASK 3");
	}
}

class MTMT3 extends Thread {
	public void run() { // Task-4
		System.out.println("Performing multiple task from multiple thread TASK 4");
	}
}
