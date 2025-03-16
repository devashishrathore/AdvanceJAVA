package dataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// ----------------------------------------------------------------------  HashSet Class  ---------------------------------------------------------------------------------------------

// HashSet -> It is an implemented class of Set interface which is present in java.util package and it was introduced in the JDK 1.2 version. 
//            It's underline data structure is "HashTable" and HashSet is backed up by "Map".

//  ## Basic Syntax:- class HashSet implements Set{
//                        Constructors...
//                        Methods...
//                     }

// Properties of HashSet:-
// (1) HashSet is not an index-based data structure While they store the elements according to their "hashCode" value.
//     hashCode is the unique integer value of the HashSet collection object so if we create an object of the HashSet class JVM provides a unique value for that Object 
//     now other data Objects are added in HashSet Object so JVM also provides hashCode value for those data objects then in the back of HashSet actual data objects
//     are stored in Map(i.e. as Key and Value pair)

// (2) HashSet does not store duplicate elements due to in back HashSet storing data objects in "Map" so Map does not allow the duplicate Key for different Objects 
// (3) HashSet can't store multiple null values
// (4) HashSet can store heterogeneous(different) data-types
// (5) HashSet does not follow the insertion order
// (6) HashSet does not follow the sorting order
// (7) HashSet are non-synchronized data structures so they are not thread-safe and also do not show data consistency.

// Constructors of HashSet:-
// (1) HashSet() -> no arguments Constructor, It is used to build an empty HashSet collection Object 
// (2) HashSet(collection c) -> It is used to build a HashSet that is initialized with the elements of the collection c or merge one HashSet collection into another type of collection.
// (3) HashSet(int capacity) -> It is used to build a HashSet that has the specified initial capacity
// (4) HashSet(int initialCapacity, float loadFactor) -> It is used to build a HashSet that has the specified initial capacity and load factor

// Methods of HashSet:-
// HashSet is an implemented class of Set(I) as well as root interface Collection(I) so all methods of Collection(I) and Set(I) are contained in the HashSet class.

public class HashSetClass {
	public static void main(String[] args) {

		HashSet hs = new HashSet(); // no arguments constructor

		hs = new HashSet(20); // capacity argument constructor

		ArrayList arr = new ArrayList();
		arr.add(500);
		arr.add(1000);
		arr.add(5000);

		hs = new HashSet(arr); // collection argument constructor

		hs.add("Dev"); // So here "Dev" Object is stored in back up in "Map" and the same for all
						// Objects
		hs.add("rathod");
		hs.add(400);
		hs.add("Deva");
		hs.add(100);
		hs.add("Devashish");
		hs.add(800);

		System.out.println(hs);

		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(hs.size());

		hs.clear();
		System.out.println(hs);
	}
}
