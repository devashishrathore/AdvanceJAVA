package dataStructure;

import java.util.ArrayList;
import java.util.Iterator;

// -----------------------------------------------------------  Array Vs Collection  ---------------------------------------------------------------------------

// Array and Collection, both store multiple data in a single unit which means we can store multiple primitive data or non-primitive data in one variable.
// But Some different features to differentiate Array from the collection are:-

// (1) An array can store primitive & non-primitive types of data While a Collection framework can contain only non-primitive types of data.
// (2) Array can store only homogeneous(similar/same) type of data While Collection can store heterogeneous(different) type of data.
// (3) Array size is fixed, we can't increase or decrease the size of an array at runtime While in Collection we can increase or decrease the size of collections at runtime.
// (4) Array is an inbuilt feature of Java & thus we have to develop an algorithm i.e. Array does not have its pre-defined methods While Collection framework is an API(Application Programming Interface) that provides predefined classes, interfaces, and methods.

public class ArrayVsCollections {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 8, 9 }; // An array can store only homogeneous data type
		int[] b = { 2, 4, 6, 8, 's', 10, 'h', 12, 'j' }; // Character is also numeric data and it's explicitly converted
															// into int data type.
		String[] s = { "Dev", "Rathod", "Ashish", "Har", "Har", "Mahadev" }; // An array can store non-primitive data
																				// type too.
		System.out.println("int type a array's 4th element is: " + a[3]); // array can retrieve only one element at a
																			// time.
		System.out.println("int type b array's 6th element is: " + b[5]);
		System.out.println("String object type array's 2nd element is: " + s[1]);

		ArrayList l = new ArrayList(); // Collection can store multiple non-primitive heterogeneous data types
		l.add(10); // here 10 in not int data type while it's wrapper class of int that means
					// Integer i = new Integer(10); i.e. storing object integer
		l.add("dev");
		l.add(true); // Boolean wrapper class
		l.add('D'); // Character wrapper class

		Iterator itr = l.iterator(); // retrieve elements by pre-defined interface

		while (itr.hasNext()) { // pre-defined methods to check elements
			System.out.println("Array List Elements: " + itr.next());
		}
	}
}
