package multitasking;

// ===========================================================================  Yield Method  =========================================================================================

// Yield Method -> This stops the currently executing thread and gives a chance to other threads for execution that have the same priority or high priority.

// Working -> In Java 5 version it's working as internally it used the sleep() method but from Java 6 Thread provides the hint to the thread-scheduler,
//            then it depends on the Thread-scheduler to accept or ignore the hint

// ##Syntax:- public static native void yield();


public class YieldMethod {

	public static void main(String[] args) {

	}

}
