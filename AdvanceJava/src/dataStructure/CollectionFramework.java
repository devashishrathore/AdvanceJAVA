package dataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// --------------------------------------------------------  Collection Framework  --------------------------------------------------------------------------------------------------------------------------

// Collection -> It is the single entity or object which can store multiple data. Collection can store only non-primitive data.

// Framework -> It represents the library. In Java Collection is a group of predefined classes and Interfaces used to store data, meaning a set of classes and interfaces is Framework. 

// Collection Framework -> It is an API containing the set of pre-defined classes & interfaces used to store multiple data. or we can say that group of Collection classes, interfaces, and methods by which we can store multiple objects' data.

// Collection Framework Contains 2 parts -> 
// (1) Collection(Interface) -> It is the root interface (present in java.util.package) of all the collection objects by using this we can directly store the data which means directly storing objects in it without any key and value pair. It is present in java.util.collection.
// (2) Map(Interface) -> It is the second part or package available in the collection framework by using this we can store the data in Key and Value Pair form. It is present in java.util.map.

// Collections(Utility Class) -> The utility class contains only static methods. It is present in Java.

// Note:- ## Collection(I) is Interface while Collections(C) is utility Class both are different and present in different packages.

// Collection(Interface) Hierarchy ->
// Three Interfaces extends the root collection(Interface) which are:-

// -> (i) List(I) -> Three Classes implements the root List(Interface) which are:-
//                 (1) ArrayList Class, (2) LinkedList Class, and (3) Vector Legacy Class
//                                                                 -> Vector Legacy Class -> One Legacy Class extends the root Vector Legacy Class which is:- 
//                                                                                        -> Stack Legacy Class

// -> (ii) Set(I) -> One Class implements and One Interface extends this root Set(Interface) which are:-
//                  (1) HashSet(Class), and (2) SortedSet(Interface)
//                -> HashSet(C) -> One Class is extends the HashSet(Class) which is:- 
//                              -> LinkedHashSet Class
//                -> SortedSet(I) -> One Interface is extends this SortedSet(Interface) which is:-
//                                -> NavigableSet(I) -> One Class is implements this NavigableSet(Interface) which is:-
//                                                   -> TreeSet Class

// -> (iii) Queue(I) -> One Class implements and One Interface extends this root Queue(Interface) which are:-
//                     (1) PriorityQueue(Class), and (2) Deque(Interface)
//                                                    -> Deque(I) -> One Class is implements this Deque(Interface) which is:-
//                                                                -> ArrayDeque(Class) 

// Implemented Class -> Implemented Class tends to be any class that implements any Interface so that class is known as implemented class for that interface.
//             Like:- ArrayList, LinkedList, and Vector Legacy Classes are implemented classes for List(Interface). 

// Legacy Class -> Collection Framework was not present in early versions of Java. instead, it defines only several classes and one interface to store the objects.
//                 But when the Collection Framework came, these old classes were re-engineered or modified to support the collection Framework. These old classes are known are legacy classes.
//             Like:- Vector legacy class, and its child Stack legacy class

// Collection Object -> In Java every class can be created in the form of an Object so if we create that collection class object by using a new Keyword and storing it in different collection class objects 
//                      or other objects so this is known as a Collection Object. Or we can say that a collection object can store a group of other objects.

// Map(Interface) Hierarchy -> 
// Two classes implements and one Interface extends the root Map(Interface) which are:-

// -> (i) HashMap(C) -> One Class extends this HashMap(Class) which is:-
//                   -> LinkedHashMap Class

// -> (ii) HashTable(Class) -> This is a dictionary of map interface, no class or interface implements this class.

// -> (iii) SortedMap(I) -> One Interface extends this SortedMap(Interface) which is:-
//                       -> NavigableMap(I) -> One Class is implements this NavigableMap(Interface) which is:-
//                                          -> TreeMap Class

// Map Object -> In Java every class can be created in the form of an Object so if we create that map class object by using a new Keyword and storing it in different map class objects 
//               or other objects so this is known as a Map Object. Or we can say that a Map object can store a group of other objects.
//               Map Object stores only Key and value pair objects.

// Concurrent Class -> 

public class CollectionFramework {
	public static void main(String[] args) {

		List myCollection = new ArrayList(); // Collection Object i.e. here List is Collection interface by reference
												// this we can create their implemented class object but we can't create
												// interface object.
		myCollection.add(10);
		myCollection.add("Devashish"); // directly stores objects
		myCollection.add(false);
		myCollection.add(5000);
		myCollection.add("Devashish");

		System.out.println(myCollection);
		System.out.println("get List elements by Iterator(I)");

		Iterator itr = myCollection.iterator(); // get elements

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("get Set elements by Iterator(I)");

		Set mySetCollection = new HashSet(); // Collection Object
		mySetCollection.add("10");
		mySetCollection.add("Devashish"); // directly stores objects
		mySetCollection.add(false);
		mySetCollection.add(3000);

		System.out.println(mySetCollection);
		Iterator itr1 = mySetCollection.iterator(); // get elements

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("get Map elements by Iterator(I)");

		Map myMapCollection = new HashMap(); // Map Object
		myMapCollection.put(1, "Dev");
		myMapCollection.put(2, "Rathod"); // stores object as key and value pair.
		myMapCollection.put(3, "Devashish");
		myMapCollection.put(4, "Bhole");

		System.out.println(myMapCollection);
	}
}
