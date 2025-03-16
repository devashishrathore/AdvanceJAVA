package multitasking;

// ---> join() Method:-

// It allows the current executing thread to wait for the completion of another thread.

// Java has 3 different join methods -> (1) public final void join()throws InterruptedException{-}, (2) public final synchronized void join(long millis)throws InterruptedException{-}, (3) public final synchronized void join(long millis, int nano)throws InterruptedException{-}

// Syntax:- t.join()->[here t is reference thread, so that current thread is waiting to complete this t Thread]

//Example 1(wait main thread for thread-0 completion):- 
//class JoinMethod extends Thread {
//
//	public void run() {
//		try {
//			for (int i = 0; i <= 5; i++) {
//				Thread.sleep(2000);
//				System.out.println("Child thread: " + i);
//			}
//		} catch (Exception e) {
//			System.out.println("Exception :" + e);
//		}
//	}
//
//	public static void main(String[] args) {
//		try {
//			JoinMethod j = new JoinMethod();
//			j.start();
//			j.join(); // here, main thread is wait for the completion of j thread-0.
//			for (int i = 0; i <= 10; i++) {
//				Thread.sleep(1000);
//				System.out.println("Joined the main thread after completion upper child thread: " + i);
//			}
//
//		} catch (Exception e) {
//			System.out.println("Exception :" + e);
//		}
//	}
//}

//Example 2(wait Thread-0 for main thread completion):- 
//class JoinMethod extends Thread {
//	static Thread mainThread;
//
//	public void run() {
//		try {
//			mainThread.join(); // current thread is waiting to join after complete this main thread.
//			for (int i = 0; i <= 5; i++) {
//				Thread.sleep(2000);
//				System.out.println("Joined the Thread-0 after completion main thread: " + i);
//			}
//		} catch (Exception e) {
//			System.out.println("Exception :" + e);
//		}
//	}
//
//	public static void main(String[] args) {
//		mainThread = Thread.currentThread(); // create object reference for the main thread to join child thread.
//		try {
//			JoinMethod j = new JoinMethod();
//			j.start(); // here, Thread-0 is started but in run method use join method to wait for
//						// complete the main thread task.
//			for (int i = 0; i <= 10; i++) {
//				Thread.sleep(1000);
//				System.out.println("main thread: " + i);
//			}
//		} catch (Exception e) {
//			System.out.println("Exception :" + e);
//		}
//	}
//}

//Example 3(Hierarchy thread to join each other after completion respected thread):-
// to apply for license process by join method example -> first give medical , second test drive after that third process is officer signature so --->

class JoinMethod {
	public static void main(String[] args) { // main Thread
		try {
			Medical d = new Medical(); // First Thread
			d.start();
			d.join();

			TestDrive j = new TestDrive(); // Second Thread
			j.start();
			j.join();

			OfficerSign n = new OfficerSign(); // Third Thread
			n.start(); // So here, last both thread is not waiting for complete the upper first thread
						// task as well as last thread is also not waiting for second thread to complete
						// their task While in this case main thread is wait to execute next lines of
						// code because of we use upper thread reference to join main thread after
						// complete their respective task.
		} catch (Exception e) {
			System.out.println("Exception :" + e);
		}
	}
}

class Medical extends Thread {

	public void run() {
		try {
			System.out.println("Medical started");
			sleep(2000); // directly call sleep method due to static behavior.
			System.out.println("Medical completed");
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
	}
}

class TestDrive extends Thread {

	public void run() {
		try {
			System.out.println("Test drive started");
			sleep(4000); // Thread.currentThread().
			System.out.println("Test drive completed");
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
	}
}

class OfficerSign extends Thread {

	public void run() {
		try {
			System.out.println("Officer check status");
			sleep(3000); // Thread.currentThread().
			System.out.println("Officer approved license");
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
	}
}
