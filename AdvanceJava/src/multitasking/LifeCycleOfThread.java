package multitasking;

// Life Cycle of A thread ---> 
// (1) object create by new Keyword (third step)  // Here step are creation steps for thread.
// (2) Runnable - JVM will allocate the processor [t.start()] (4th step)
// (3) Running - processing the task (2nd step)(interrupt NON Runnable State if we interrupt in thread)
// (4) death - died

// Non Runnable State -- disturbing the Running stage like we can implement new code for sleep , pause or suspend for specified times after that it is again in runnable stage and complete their life cycle.
// 5 stages due to NON runnable State

// So we can also assume that life cycle steps for a thread ---->
// 1.New(Object Creation) -> Thread is created but not yet started.
// 2.Runnable(Runnable) -> A thread in the Runnable state is exactly in the Java Virtual Machine but it may be waiting for other resources from the operating system.
// 3.Blocked(Running) -> A thread in the blocked state is waiting to enter a synchronized block/method(like entering in Join(), sleep(), etc..)
// 4.Waiting(Running) -> A thread will be in the waiting state for a unspecified period of time due to calling one of the methods like join(),wait() etc..
// 5.Timed-Waiting(Running) -> A thread will be in waiting state for another thread for a specified waiting time in the state.
// 6.Terminated (death)-> The thread has completed execution.

public class LifeCycleOfThread extends Thread {
	public void run() { // Running(processing the task, Blocked if interrupt to disturb thread by some
						// methods. --> Third Stage
		System.out.println("Life cycle of thread");
	}

	public static void main(String[] args) throws InterruptedException {
		LifeCycleOfThread life = new LifeCycleOfThread(); // New(Thread initialize) --> First Stage
		life.start(); // Runnable(in JVM wait for task by start method) --> Second Stage
		System.out.println(life.isAlive()); // true
		life.join(); // Running(Thread-0 is Waiting for unspecified period to invoke some methods,
						// here using join method and main Thread is Timed-Waiting for complete the
						// upper Thread task) --> Fourth & Fifth Stage
		System.out.println(life.isAlive()); // Death(terminated the thread) --> Sixth Stage
		System.out.println(Thread.currentThread().isAlive()); // main thread is still alive
	}
}
