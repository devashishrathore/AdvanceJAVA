package dataStructure;

import java.util.ArrayList;

// -----------------------------------------------------------------  ArrayList Class  -----------------------------------------------------------------------------------------

// ArrayList -> ArrayList is an implemented Class of List Interface which is present in Java.util package. It is created based on the grow-able or re-sizable array.

//  ##Syntax:- class ArrayList implements List{
//            Contains all methods of Collection(I) and List(I)
//                  Constructors...
//                 ArrayList Methods.....
//              }

// Properties of ArrayList:-
// (1) ArrayList is are index-based Data structure.
// (2) ArrayList can store different data types or heterogeneous data types.
// (3) ArrayList can store duplicate values.
// (4) ArrayList can store any no. of null values.
// (5) ArrayList follows the insertion order.
// (6) ArrayList does not follow the sorting order.
// (7) ArrayList are non-synchronized so they are not thread safe.

// Constructors of ArrayList:-
// 3 Constructors exist in ArrayList 

// (1) ArrayList() -> It is used to build an empty array list with an initial capacity of 10 i.e. we can store 10 elements/objects but if the length is exceeds 
//                    its capacity is automatically increases by this formula  new capacity = (old capacity * 3)/2 + 1 ; 

// (2) ArrayList(int capacity) -> It is used to build an array list that has the specified initial capacity

// (3) ArrayList(collection c) -> It is used to build an array list that is initialized with the elements of the collection c or merge one ArrayList collection into another one.

// Methods of ArrayList:-
// In ArrayList, due to ArrayList is an implemented class of List Interface as well as List interface also extends the root collection interface 
// so all methods of List(I) and collection(I) contains in ArrayList Class.

// Some Different unique methods which are exist in ArrayList:-

// (1) addFirst(Object obj) -> 
// (2) addLast(Object obj) ->
// (3) getFirst() ->
// (4) getLast() ->
// (5) removeFirst() ->
// (6) removeLast() ->
// (7) reversed() -> 
// (8) sort(comparator) ->
// (9) equals(Object obj) -> 
// (10) toArray() -> 
// (11) trimToSize() ->
// (12) retainAll(collection c) ->

public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList(); // Empty argument Constructor with initial capacity is 10 by default
		arr1.add(100);

		System.out.println(arr1);

		ArrayList arr2 = new ArrayList(5); // int capacity argument Constructor i.e. set manually capacity of ArrayList
		arr2.add(200);

		System.out.println(arr2);

		ArrayList arr3 = new ArrayList(arr2); // collection c argument Constructor i.e. merge one collection into
												// another
		arr3.add(300);
		arr3.add(400);

		arr3.addFirst("Dev"); // add an element on the first position that means 0 index
		arr3.addLast("Rathod"); // add element on last position that means collection.size() - 1 index

		System.out.println(arr3.getFirst()); // get the first element of ArrayList collection that means 0 index
												// position object
		System.out.println(arr3.getLast()); // get last element of ArrayList collection that means collection.size() - 1
											// index position object
		System.out.println(arr3.removeFirst()); // remove the first element of ArrayList collection that means 0 index
												// position object
		System.out.println(arr3.removeLast()); // remove last element of ArrayList collection that means
												// collection.size() - 1 index position object
		System.out.println(arr3.reversed()); // reverse the all element of ArrayList collection

		arr3.sort(null); // sort on basis of null
		System.out.println(arr3);

		System.out.println(arr3.equals(arr2)); // return false i.e. arr3 is not equal to arr2
		System.out.println(arr3.toArray()); // convert the collection into simple array

		arr3.trimToSize(); // remove the unnecessary extra capacity of the collection
		System.out.println(arr3);

		System.out.println(arr3.retainAll(arr2)); // -------

		System.out.println(arr3);
	}
}
