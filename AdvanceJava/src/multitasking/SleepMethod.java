package multitasking;

// -> (v) Prevent Thread Execution methods -> 
// 1. public static native void sleep(long millis)throws InterruptedException{-} - Allows the current executing thread task to pause for the completion of given interval/time in Milliseconds as method parameter.
// 2. public static native void yield() - 
// 3. public final void join()throws InterruptedException{-} - Allows the current executing thread to wait for the completion of another thread.
//[Deprecated methods by java - suspend(){-}, resume(){-}, stop(){-}, destroy(){-}] 

//---> sleep(long millis) Method:-

//Java has 2 different sleep methods -> (1) public static native void sleep(long millis)throws InterruptedException{-}, (2) public static void sleep(long millis, int nanos)throws InterruptedException{-}

// 1. If the value of milliseconds is negative then "IllegalArgumentException" is thrown.
// 2. If the value of nanoseconds is not in the range 0-999999 then "IllegalArgumentException" is thrown.
// 3. Whenever we want to use the sleep() method we also need to handle the "InterruptedException". If we will not handle it, the JVM will show a compilation error.
// 4. When any thread is sleeping and if any other thread interrupts it, then it throws "InterruptedException".
// 5. The sleep() method always pauses the current thread execution.When the JVM finds the sleep() method in code, it checks that which thread is running and pause the execution of thread.
// 6. When we use sleep() method to pause the execution of thread. the thread scheduler assigns the CPU to another thread if any thread exists. So, there is no guarantee that the thread wakes up exactly after 
//    the time specified in sleep() method. It totally depends on the thread scheduler.
// 7. While the thread is sleeping, it doesn't lose any locks or monitors that it had acquired before sleeping.

//Example 1 (sleep() method):- 

//class SleepMethod extends Thread {
//	public void run() {
//		try {
//			for (int i = 0; i <= 5; i++) {
//				Thread.sleep(2000); // call/invoke directly due to static method
//				System.out.println("sleep for 2 second: " + i);
//			}
//		} catch (InterruptedException e) {
//			System.out.println("Exception: " + e);
//		}
//	}
//	public static void main(String[] args) {
//		SleepMethod s = new SleepMethod(); // here is Thread-0 is sleeping. While main thread is working constantly.
//		s.start();
//	}
//}

//Example 2 (sleep() method):- 

class SleepMethod { // Here, we are not extending the Thread class to create Thread , because if
					// execution code is in only main method so as main method always created main
					// thread so we can sleep main thread by using Thread class sleep method
					// directly.
	public static void main(String[] args) { // here is main thread is sleeping.
		try {
			for (int i = 0; i <= 5; i++) {
				Thread.sleep(1000); // call/invoke directly due to static method
				System.out.println("sleep for a second: " + i);
			}
		} catch (InterruptedException e) {
			System.out.println("Exception: " + e);
		}
	}
}
