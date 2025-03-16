package multitasking;

//Cases to executing Threads:-
//(1) Performing single task from single thread.
//(2) Performing single task from multiple thread.
//(3) Performing multiple task from single thread -> This is not possible due to single thread can't do multiple task at a time.
//(4) Performing multiple task from multiple thread.

// (1) Performing single task from single thread ->

// Example 1 :-

//public class ThreadCases extends Thread {
//	public void run() { // Single task
//		System.out.println("Performing single task from single thread ex 1");
//	}
//
//	public static void main(String[] args) {
//		ThreadCases s = new ThreadCases(); // Single thread in same class  --> Example:1
//		s.start();
//		
//	}
//}

//Example 2 :-

public class ThreadCases {
	public static void main(String[] args) {
		STST s1 = new STST(); // single thread with different class --> Example:2
		s1.start();
	}
}

class STST extends Thread {
	public void run() { // Single task
		System.out.println("Performing single task from single thread ex 2");
	}
}
