package dataStructure;

import java.util.ArrayList;
import java.util.Iterator;

//  ----------------------------------------------------  Data Structure and Algorithm  -------------------------------------------------------------

// Data Structure -> Data structure is like data types, It is the which we can efficiently store the data.
//                   where efficient way means data which is stored, consumes less memory, fast performance with taking less space and time(i.e. time and space complexity) to load the application.

// Algorithm -> An Algorithm is a step-by-step procedure designed to solve specific problems and perform tasks efficiently i.e. if we perform any task so, there are lots of ways to perform any task but if performing 
//              a task in a step so that steps are right fits for the task which its performance is good as compared to other steps for that task(i.e. less time and space complexity) is the algorithm of a task or a program.
//     For example:- If we develop any application or site and here I want to search, sort, and retrieve data or many do tasks so sorting, searching, and retrieving data that are algorithms so if steps of task(algorithm) 
//                   is good so it gives good performance of an application and best effect on a user.
//              

// Time Complexity -> The Time Complexity of an algorithm/code is the time taken or execution time to perform or complete the task and It is not equal to the actual time required to execute a particular code, 
//                    but the number of times a statement executes.

// Space Complexity -> The space Complexity of an algorithm is the total space(Auxiliary space) taken by the algorithm with respect to the input size. Space complexity includes both Auxiliary space and space used by input. 
//                     Where Auxiliary space is the extra space or temporary space used by an algorithm.

// Types of Data Structure:-
// There are two types of Data structure -

// -> (1) Primitive Data Structure -> Primitive Data Structure are also basic primitive data types that store the data of only one type. which means we can store only one data and a single primitive data type in a variable.
//         For example:- int a = 10; char c = 'D'; so here we can't store more data in a or c variable.

//  8 Primitive data types in Java are -> boolean, character, byte, short, int, long, float, and double where boolean is non-numeric while the rest all are numeric data types.

// -> (2) Non-Primitive Data Structure -> Non-primitive Data Structure are also non-primitive data types and some other classes and (Collection)frameworks included in Java that can store the data of more than one type.
//                                        This means we can store only multiple data, multiple primitive data types, or non-primitive data types in a variable.
//         For example:- int[] a = {1,3,4,6,'g',0,3,'d'}; , String s = "DEV"; here, in variable a, stored multiple int type values and in variable s stored multiple character type values.
//         Note:- ##character is also a numeric data type it's explicitly converted into int where we store characters with int types of data in an array.

// Non-Primitive Data Structure is divided into two categories/types -

// (i) Linear Data Structure ->  A linear data structure is a structure in which the elements are stored sequentially, and the elements are connected to the previous and the next element. As the elements are stored sequentially, 
//                               so they can be traversed or accessed in a single run. The implementation of linear data structures is easier as the elements are sequentially organized in memory. 
//         For example:- The data elements in an array are traversed one after another and can access only one element at a time.

// Linear data types in Java are -> String, Array, LinkedList, Set, Queue, Stack, ArrayList, Map, and many more.

// (ii) Non-Linear(Dynamic) Data Structure -> A non-linear(Dynamic) data structure is also another type of data structure in which the data elements are not arranged in a contiguous manner or the elements are arranged hierarchically or non-linear manner. 
//                                            As the arrangement is non-sequential, the data elements cannot be traversed or accessed in a single run. In the case of linear data structure, the element is connected to two elements 
//                                           (the previous and the next element), whereas, in the non-linear data structure, an element can be connected to more than two elements.
//         For example:- The data elements(tree branches) in a tree are connected to each other non-sequential but they are connected more than two elements.

//  2 Non-linear data types in Java are -> Tree and Graph.

// Where to use -> Primitive Data Structure is used in simple operations or to create simple sites that are where we can work with single data at a time and small tasks.
//                 like to create simple calculators, arithmetic operations, etc...
//          While Non-primitive Data structures are used in e-commerce sites, web applications, gaming sites, and applications where we can work with multiple types of data in a single unit.

public class DSAIntroduction {
	public static void main(String[] args) {
		int a = 10; // Primitive Data Structure(data type) i.e. a store only one value
		System.out.println("Primitive Data int a is: " + a);

		int[] b = { 1, 3, 4, 6, 'g', 0, 3, 'd' }; // Non-Primitive Data Structure(data type) and retrieve only one
													// element at a time in an array
		System.out.println("Non-Primitive Data array b first element is: " + b[0]);

		String s = "DEV"; // Non-Primitive Data Structure(data type) i.e. sequence of characters
		System.out.println("Non-Primitive Data Sting s is: " + s);

		ArrayList user = new ArrayList(); // Linear Data Structure i.e. ArrayList(Collection) stores multiple data in a
											// hierarchy manner
		user.add(a);
		user.add(b);
		user.add(s);

		Iterator itr = user.iterator(); // Retrieve Elements by Iterator Interface
		while (itr.hasNext()) {
			System.out.println("Linear Data ArrayList Elements are: " + itr.next());
		}
	}
}