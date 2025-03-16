package multitasking;

//-----------------------------------------------------------------  MULTITASKING  --------------------------------------------------------------

//Multitasking is a process of performing multiple tasks simultaneously using single processor.

//Multitasking can be achieved by two ways:-
//(1) Process based Multitasking (MULTIPROCESSING):-  It is a process to execute multiple processes at the same time and purely based on the number of processors available on the host computer.

//(2) Thread-Based Multitasking (MULTITHREADING):- It is a process to execute multiple threads at the same time without dependency of other threads.

// PROCESS & THREADS:-

//		  ## PROCESS->
//(1) A process which is in executing state.
//(2) Heavy weight.
//(3) Context switching :- process takes more time.
//(4) Communication :- take more time for internal process communication.
//(5) Address space :- each process has different address space.
//(6) Dependency :- process are not dependent on each other.
//(7) Synchronization :- process does not require synchronization.
//(8) Resource consumption :- more.
//(9) Time of creation :- more time.
//(10) Time for termination :- more time.

//		  ## THREAD->
//(1) It is the sub part of process(small task).
//(2) Light weight.
//(3) Context switching :- thread takes less time.
//(4) Communication :- take more time for internal thread communication.
//(5) Address space :- thread share same address space.
//(6) Dependency :- threads are dependent on each other.
//(7) Synchronization :- threads may require synchronization.
//(8) Resource consumption :- less.
//(9) Time of creation :- less time.
//(10) Time for termination :- less time.

//Two ways to create Thread:-
// => (i) Thread (class) -> By extending Thread Class (It implements Runnable Interface BY Default)
//It is pre-defined class in java programming existing in java.lang package which has 8 constructors(4 simple and 4 thread group), and many methods.

// Steps to create thread by Thread class --> 
//(1) Extend the Thread class
//(2) Override the run() method 
//(3) Create an object of the class
//(4) Start the thread by using start() method

//Example :-
public class ThreadByThreadClass extends Thread {

	public void run() {
		System.out.println("Create thread by using Thread class");
	}

	public static void main(String[] args) {
		ThreadByThreadClass s = new ThreadByThreadClass(); // single thread
		s.start();
	}
}

// -> (vi) Interrupting thread methods ->
//   1. public void interrupt(){-} - 
//   2. public boolean isInterrupted(){-} - 
//   3. public static boolean interrupted(){-} - 

// -> (vii) Inter thread communication methods -> 
// Used in communicating between threads.
// These methods are not available in Thread class while they are present in Object class.
//   1. public final void wait()throws InterruptedException{-} -  
//   2. public final native void notify(){-} -
//   3. public final native void notifyAll(){-} - 
