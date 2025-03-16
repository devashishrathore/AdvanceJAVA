package april1;

import java.util.ArrayList; // Here, we are using the ArrayList class, but we can use any collection class such as ArrayList, LinkedList, HashSet, TreeSet, HashMap, Comparator etc.
import java.util.Iterator;
//-------------------------------------------------------------Generics in java-----------------------------------------------------------------
//                                                                                                     ----> 01 April 2024 (Monday)

//It is used java 1.5v onwards.
//It  is used to resolve type-casting and type-saftey problem.
//It makes the code stable by detecting the bugs at compile time.

//Before generics, we can store any type of objects in the collection, i.e., non-generic. Now generics force the java programmer to store a specific type of objects.

//Type-saftey -> We can hold single type of objects in generics.It does not allow to store another objects.
//Type-casting -> There is no need to type cast the objects. Before Generics, we need to type cast.

//Syntax -> ClassOrInterface<Type> 

public class Generics {

	public static void main(String[] args) {
		int arr[] = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		// arr[2] = new String["Abc"];
		/*
		 * Arrays objects are by default type safe. i.e. if we declare integer array we
		 * can insert only integer objecys.By mistake if we are trying to insert any
		 * other elements we will get Compile Error.
		 */

		// Example 1 without Generics ->
		ArrayList l1 = new ArrayList(); // ArrayList is default pre-define Collection class by java to use store any
										// type of data
										// in one ArrayList class object. Collections objects are not type safe by
										// default.
		l1.add(1);
		l1.add("Amit");
		l1.add("False");
		l1.add(1.2f);

		Iterator itr1 = l1.iterator(); // Iterator is also default pre-define interface by java to retrieve the
										// collection data.
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		// Example 2 with Generics ->
		ArrayList<Integer> l2 = new ArrayList<Integer>(); // So here is "Integer" as parameter(arguments) in ArrayList
															// Collections is "Generics". It allows to store only
															// integer values in collection and safe data type i.e.
															// Type-safety. So type casting is not required.
		l2.add(1);
		l2.add(10);
//		l2.add("Amit");
//		l2.add("False");
//		l2.add(1.2f);
		/*
		 * Collections objects are not type safe by default.If our requirement is to add
		 * only string/Number object to ArrayList.By mistake if we are trying any other
		 * elements we will get Compile Error.
		 */
		l2.add(100);

		Iterator<Integer> itr2 = l2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		MyGen<Integer> m = new MyGen<Integer>(); // Generic Class
		m.add(2);
		// m.add("vivek"); // Compile time error
		System.out.println(m.get());

		TestGenericMethod genMeth = new TestGenericMethod(); // Generic Method
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'D', 'E', 'V', 'A', 'S', 'H', 'I', 'S', 'H' };

		System.out.println("Printing Integer Array");
		genMeth.printArray(intArray); // Method 1

		System.out.println("Printing Character Array"); // Method 1
		genMeth.printArray(charArray);

		genMeth.printString("Dev"); // Method 2
	}
}

//                                                                                                     ----->  03 April 2024 (Wednesday)

// Generic Class:-
// A class that can refer to any type is known as a generic class.
//Here, we are using the T type parameter to create the generic class of specific type.

// Type Parameters - > Type Parameters naming conventions are important to learn generics thoroughly.
// The common type parameters are as follows:
// T - Type
// E - Element
// K - Key
// N - Number
// V - Value

class MyGen<T> { // The T type indicates that it can refer to any type (like String, Integer, and
					// Employee). The type you specify for the class will be used to store and
					// retrieve the data.
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;

	}
}

// Generic Method:-
// Like the generic class, we can create a generic method that can accept any type of arguments.
// It allows static as well as non-static methods.

class TestGenericMethod {

	public <E> void printArray(E[] elements) { // Method 1
		for (E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public <T> void printString(String T) { // Method 2
		System.out.println(T);
	}
}
