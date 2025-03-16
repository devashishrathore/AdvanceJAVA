package multitasking;

// Daemon Thread -> Which runs in the background of another thread. uses of these threads are to provide service to the threads.
//        Example:- Garbage Collector, finalizer, Attach Listeners, Signal dispatches etc

// -> (iii) Daemon Thread methods ->
// 1. public final boolean isDaemon(){-} - To check the thread is daemon or not. It returns a boolean value.
// 2. public final void setDaemon(boolean on){-} - Change the thread by passing the boolean value as a parameter in this method although create a normal thread to daemon or daemon thread to normal.

// Some Important Cases for Daemon Thread:-
// (1) We have to create a daemon thread before starting the thread, If we create a daemon thread after starting it, it will throw a run-time exception i.e. IllegalThreadStateException 
// (2) We can't create the main thread as a daemon thread, If we try to create a daemon thread it will throw a run-time exception i.e. IllegalThreadStateException due to it's already started.
// (3) As the daemon thread provides service to another thread, if the respected thread does not do any task their daemon thread also is not doing any task.
// (4) Its life depends on the respected thread, as the respected thread dies so their daemon thread will die.
// (5) Daemon thread inherits the nature/properties from its parent thread. So if the parent thread is a daemon thread their child thread is by default a daemon thread.
// (6) JVM role in Daemon thread, JVM does not depend on daemon threads it kills all the daemon threads after completion of all normal threads and then shuts down itself. 
// (7) Most of the time, the Daemon thread has low priority but we can change its priority according to our needs.

public class DaemonThreadMethods extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Child Daemon thread methods");
	}

	public static void main(String[] args) {
		System.out.println("Main thread");
		DaemonThreadMethods daemonThread = new DaemonThreadMethods();
		daemonThread.setDaemon(true); // Now this thread is run in the background with the main thread
		daemonThread.start();
	}
}
