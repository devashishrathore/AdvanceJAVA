package multitasking;

//Methods and Constructors in Thread class:-

// Constructors ->
// (1) public Thread(){-} - Default constructor
// (2) public Thread(Runnable target){-} 
// (3) public Thread(String name){-}
// (4) public Thread(Runnable target, String name){-} 
// (5) public Thread(ThreadGroup group, Runnable target){-}
// (6) public Thread(ThreadGroup group, String name){-}
// (7) public Thread(ThreadGroup group, Runnable target, String name){-}
// (8) public Thread(ThreadGroup group, Runnable target, String name, long stackSize){-}

//upper 4 are the simple constructors rest are the Thread group constructors, where we pass ThreadGroup group as a parameter.
//First one is default constructor while rest all are parameterized constructor.
//where "Runnable target" pass as the parameter that constructors are used in create thread by implementing Runnable interface.
//JVM always takes default names for threads but we can give by self using "String name" parameter in thread constructor.

// Some general methods in thread class:-
// (1) Basic methods -> run(){-}, start(){-}, currentThread(), isAlive();
// (2) Naming methods -> getName(){-}, setName("hello"){-} 
// (3) Daemon Thread methods -> isDaemon(){-}, setDaemon(boolean on){-} 
// (4) Priority Based methods -> getPriority(){-}, setPriority(int newPriority){-} 
// (5) Prevent Thread Execution methods -> sleep(long milliseconds)throws InterruptedException{-}, yield(), join()throws InterruptedException{-}, 
// [Deprecated methods by java - suspend(){-}, resume(){-}, stop(){-}, destroy(){-}] 
// (6) Interrupting thread methods - > interrupt(){-}, isInterrupted(){-}, interrupted(){-}

// -> (i) Basic methods -> 
//1. public void run(){-} - Define thread task inside the method.
//2. public synchronized void start(){-} - Invoke the thread. It is synchronized method.
//3. public static native Thread currentThread() - Static method to provide thread reference.native means doesn't created by java while created by another language.
//4. public final native boolean isAlive() - To check the thread status, that means check thread is died or not. It return boolean value.

// -> (ii) Naming methods -> 
// 1. public final String getName(){-} - To get the thread name.
// 2. public final synchronized void setName("hello"){-} - To set the thread name.

//Example(Basic & Naming Methods):-

//Example:-
class ThreadMethods extends Thread {
	public void run() {
		System.out.println("Hello Thread");
//	System.out.println("MyThreadName class thread name " + Thread.currentThread().getName());
//	Thread.currentThread().setName("Dev");  // we can customize thread name inside run method too but if single task in that method perform by multiple threads so it is difficult to get and set multiple thread name.    
//	System.out.println("Changed MyThreadName class thread name " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Current thread name: " + Thread.currentThread().getName()); // return "main" due to main
																						// method also has main thread
																						// for execution. JVM allocated
																						// name for every thread.

		Thread.currentThread().setName("Devashish"); // changed thread name by setName method
		System.out.println("Changed main thread name: " + Thread.currentThread().getName()); // now, return Devashish

		ThreadMethods t = new ThreadMethods(); // First Thread
		t.start();
		System.out.println("First thread name: " + t.getName()); // return "Thread-0" due to JVM takes thread names by
																	// default from 0 and as multiple thread is created
																	// JVM allocated name sequentially like Thread-0,
																	// Thread-1, Thread-2 so on...
		t.setName("Dev Thread");
		System.out.println("Changed first thread name: " + t.getName()); // now, return Dev Thread
		boolean a = t.isAlive(); // Check thread status by isAlive method
		System.out.println("Thread-0 status: " + a);

		ThreadMethods t1 = new ThreadMethods(); // Second Thread
		t1.start();
		System.out.println("Second thread name: " + t1.getName()); // return Thread-1
		t1.setName("Rathod Thread");
		System.out.println("Changed second thread name: " + t1.getName()); // now, return Rathod Thread
		boolean b = t1.isAlive();
		System.out.println("Thread-1 status: " + b);
	}
}
