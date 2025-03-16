package dataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

// --------------------------------------------------------  List(I) And Set(I) ---------------------------------------------------------------------------------------------------

// List(I) basic Syntax:- 
//      interface List extends Collection {
//           Contains all methods of collection interface
//           Constructors...
//           Methods....
//         }

// Set(I) basic Syntax:- 
//       interface Set extends Collection {
//              Contains all methods of collection interface
//              Constructors...
//              Methods....
//           }

// List(I) and Set(I) both are extended root collection Interface so some same common features are available from inherited root collection features
// but they create their different objects so List implemented classes objects and Set implemented classes objects contain some other different features 
// that's why List(I) and Set(I) different from each other which are:-

// (1) List is an index-based data structure While Set is not index index-based structure. It stores the data according to the hashCode values.
// (2) List can store duplicate elements While Set does not allow to storing of duplicate elements.
// (3) List can store any number of null values While Set can store only one null value.
// (4) List follows the insertion order While Set does not follow the insertion order.
// (5) We can iterate(get) the List elements by Iterator(I) cursor & ListIterator(I) cursor While in we can iterate(get) the Set elements by Iterator(I) cursor only.

// Methods of List(I):-
// Contains all methods of Collection(I) while some common methods also override by List(I) and some are different which are:-

// (1) void add(int index, Object obj) -> To add the element in the given index position that means other elements exist in sequence by default. It will not return any value void returnType 

// (2) void addAll(int index, Collection c) -> To add all the elements of another collection or merge collection from a given index position in an existing collection. It will not return any value void returnType 

// (3) Object get(int index) -> To get an element from the collection in a given index position. It will return existing Object

// (4) Object remove(int index) -> To remove the element from the collection that is present in the given index position and return the removed Object 

// (5) Object set(int index, Object obj) -> To set the element in the collection in the given index position and remove the earlier object if it exists (replace old object by new object in same having index position)
//                                          and It will return the Replaceable object. If the given index position exceeds the length of the collection it will show the java.lang.IndexOutOfBoundsException exception

// (6) int indexOf(Object obj) -> To get the index position of object/element if it exists in the collection from starting otherwise return -1

// (7) int lastIndexOf(Object obj) -> To get the index position of object/element if it exists in the collection from ending otherwise return -1

public class ListAndSetInterface {
	public static void main(String[] args) {

		List l = new ArrayList(); // List implemented class Object
		l.add(100);
		l.add("Dev");
		l.add("Rathod");
		l.add(500);
		l.add(100);

		l.add(0, "Indore"); // add element on 0 index position
		l.add(4, "Mumbai"); // add element on 4 index position

		System.out.println(l); // direct print whole collection Object and follow insertion order with
								// duplicate elements

		System.out.println("get List elements by Iterator(I)");
		Iterator itr1 = l.iterator(); // Iterator(I) and iterator() method of collection(I)
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("get List elements by ListIterator(I)");

		ListIterator itr12 = l.listIterator(); // ListIterator(I) and listIterator() method of List(I)
		while (itr12.hasNext()) {
			System.out.println(itr12.next());
		}

		Set s = new HashSet(); // Set implemented class Object
		s.add(100);
		s.add("Dev");
		s.add("Rathod");
		s.add(500);

		System.out.println(s); // direct print whole collection Object and does not follow insertion order with
								// all unique elements

		System.out.println("get Set elements by Iterator elements");

		Iterator itr2 = s.iterator(); // Iterator(I) and iterator() method of collection(I)
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		l.addAll(0, s); // add all elements of collection s into collection l from index position 0
		System.out.println(l);

		int a = l.indexOf("Dev"); // return 2 i.e. Object "Dev" exists index position 3 from starting
		System.out.println(a);

		int b = l.indexOf("Deva"); // return -1 i.e. Object "Deva" does not exist in collection l
		System.out.println(b);

		int c = l.lastIndexOf("Dev"); // return 6 i.e. Object "Dev" exists index position 6 from ending
		System.out.println(c);

		Object d = l.get(3); // return 500 i.e. object 500 exists on index position 3 in collection l
		System.out.println(d);

		Object e = l.set(3, "India"); // return 500 i.e. object "India" is set on index position 3 which is the early
										// position for object 500 so object 500 is replaced by object "India"
		System.out.println(e);

		System.out.println(l); // updated collection

//		Object e1 = l.set(12, "India"); // It show the java.lang.IndexOutOfBoundsException exception i.e. Index 12
										// exceeds the length of the collection

		Object f = l.remove(0); // return "Rathod" i.e. removed the "Rathod" object which earlier existed in the
								// index position 0 in collection l
		System.out.println(f);

		System.out.println(l); // updated collection
	}
}
