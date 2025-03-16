package multitasking;

//=> (ii) Runnable (interface) -> By implementing Runnable Interface(it has only one method named run())
//It is also pre-defined interface in java programming existing in java.lang package which has only one run() method that is override by thread class, like thread implement runnable interface. It is a functional interface. 
//Better way to create thread as compare to thread class because of lack of multiple inheritance in java so we can easily create thread for already inherited class by runnable interface and also increases performance and improve coding standard.

//Steps to create thread by Runnable interface --> 
//(1) Implement the Runnable interface
//(2) Override the run() method
//(3) Create an object of the your class
//(4) Create an object of Thread class and pass the your class object as parameter in the constructor
//(5) Start the thread by using start() method

//Example :-

public class ThreadByRunnable implements Runnable {
	public void run() {
		System.out.println("Create a thread by Runnable Interface");
	}

	public static void main(String[] args) {
		ThreadByRunnable th = new ThreadByRunnable(); // create your task/class object/thread
		Thread t = new Thread(th); // create thread class object and pass your class object in constructor
		t.start(); // Invoke the thread
	}

}
