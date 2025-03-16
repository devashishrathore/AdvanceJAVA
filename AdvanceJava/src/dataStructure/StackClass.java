package dataStructure;

import java.util.Stack;

// -----------------------------------------------------------------  Stack Class  -----------------------------------------------------------------------------------

// Stack -> Stack is the legacy class that was introduced in the JDK 1.0 version. It is the child class of the Vector class which is present in java.util package        

// ## Basic Syntax:-  class Stack extends Vector {
//                   Constructors...
//                   Methods...
//                }

// Properties of Stack:-
// (1) Stack class was designed based on LIFO(Last In First Out) i.e. store elements in a container by pushing elements one-by-one and now if we retrieve elements so last element is retrieved or out first.  
// (2) Stack can be implemented based on arrays, ArrayList, LinkedList, and Vector. i.e. In array and ArrayList 0 index position is the bottom of the Stack While the last index position is the top of the Stack. 
//     In LinkedList first node is top of the Stack while the last node is bottom of the Stack.
// (3) Stack is an index-based data structure
// (4) Stack can store heterogeneous or different data types.

// Constructors of Stack:-
// Only one Constructor exists in Stack Class i.e. Stack();

// Methods of Stack:-
// Stack is an implemented class of List(I) as well as root Interface Collection(I), so Stack contains all methods of that interface and 
// Some main basic most used methods also exist in Stack that are only used for a Stack object which are:-

// (1) push(Object obj) -> To add or push the element in Stack Object container/collection and return the pushed Object
// (2) pop() -> To remove the top/last element of Stack Object collection and return the removed Object
// (3) peek() -> To check or look in the stack collection container and return the top element but it does not remove it.
// (4) search(Object obj) -> To search the Object in the Stack collection container and return the index position of the object. If the Object is not exist it will return -1. 
//                           In stack last/top element index position is 1 and the bottom/first element index position is Stack.size() 
//                           i.e. Stack count or run in top to bottom direction.
// (5) empty() -> To check whether the Stack collection is empty or not. It returns true if the collection is empty otherwise returns false.

public class StackClass {
	public static void main(String[] args) {

		Stack s = new Stack(); // No argument Constructor

		Object a = s.push("Dev"); // return Dev i.e. Object "Dev" is pushed or added in collection s
		System.out.println(a);

		s.push(200);
		s.push("Rathod");
		s.push(400);
		s.push("Indore");
		s.push(12.78);

		System.out.println(s);

		Object b = s.pop(); // return 12.78 i.e. Object 12.78(top elements) is removed from the Stack
							// Collection s
		System.out.println(b);
		System.out.println(s);

		Object c = s.peek(); // return Indore i.e. only look at the top element of Stack Collection and
								// return it.
		System.out.println(c);

		int d = s.search(200); // return 4 i.e. the index position of Object 200 is 4 in collection s
		System.out.println(d);

		int e = s.search(100); // return -1 i.e. Object 100 does not exist in collection s
		System.out.println(e);

		boolean f = s.empty(); // return false i.e. Stack collection s is not empty
		System.out.println(f);

		s.clear();
		System.out.println(s);

		boolean g = s.empty(); // return true i.e. Stack collection s is empty now
		System.out.println(g);

	}
}
