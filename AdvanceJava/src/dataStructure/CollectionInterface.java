package dataStructure;

import java.util.ArrayList;
import java.util.Iterator;

// ----------------------------------------------------------  Collection Interface  ---------------------------------------------------------------------------

// Collection(Interface) -> Collection is an Interface that is present in java.util package. It is introduced in the 1.2 version. Three other child interfaces extend this root Collection(Interface). 
//                          It is the root(Interface) of all classes and interfaces. no one class is directly-implements/implements this root Interface while three child interfaces 
//                          inherit this root interface.

// ##Syntax:- public interface Collection <E> extends Iterable <E> {
//                 methods...
//              }

// Methods of Collection(Interface):-
// Collection(Interface) is the root of all collection classes and interfaces by using this we can store multiple data and work with data with different cases and it is possible by some common behavior
// and methods work for all collection classes and interfaces so some common methods are ->

// -> (1) add() -> To add the elements/objects in any collection Object. if we want to print after using this it returns a boolean value that means the object is added or not.
//     ##Syntax:- public boolean add(Object o); returns boolean

// -> (2) addAll() -> To add the collection in any different collection or we can say that merge the two collections. if we want to print after using this it returns a boolean value that means the collection is added or not.
//     ##Syntax:- public boolean addAll(Collection c); returns boolean

// -> (3) contains() -> To check whether the element exists in the collection or not. it will return true if it exists otherwise returns false.
//      ##Syntax:- public boolean contains(Object o); returns boolean

// -> (4) isEmpty() -> To check whether the collection is empty or not. it will return true if the collection is empty otherwise return false.
//      ##Syntax:- public boolean isEmpty(); returns boolean

// -> (5) size() -> To check the no. of elements in collection. it will return an integer value.
//      ##Syntax:- public int size(); return int

// -> (6) remove() -> To remove the elements from the collection. There are 2 different methods for removing elements first is index-based the remove method for an integer acts as taking index argument 
//                    while for String or other object is matched with content due to ArrayList Class method remove invoked which is based on index position. so it will return the removed index position Object otherwise 
//                    It will show java.lang.IndexOutOfBoundsException exception if index position exceeds the length of collection size. The second method is object-based which means taking the argument as an object and 
//                    It will return true if the element is removed otherwise return false.

//      ##Syntax(1):- public boolean remove(Object o); return boolean - collection(I) method
//      ##Syntax(2):- public object remove(index position) return object - List(I) method

// -> (7) removeAll() -> To remove the common elements from one collection to another collection. it will return true if any one element is removed otherwise returns false.
//      ##Syntax:- public boolean removeAll(collection c); return boolean

// -> (8) clear() -> To remove all the elements from the collection. it is void return type no return any value.
//      ##Syntax:- public void clear(); void return type

// -> (9) containsAll() -> To check that all elements are contained in any collection compared to another collection. it will return true if all elements are matched with another collection otherwise return false.
//      ##Syntax:- public boolean containsAll(collection <?> c); return boolean

// -> (10) iterator() -> To retrieve or iterate the elements from the collection.
//     ##Syntax:- public  iterator(); return list

// And many more methods exist but they are the common and most used methods in all root collection classes in Java.

public class CollectionInterface {
	public static void main(String[] args) {

		ArrayList a1 = new ArrayList(); // Collection Object

		boolean b = a1.add(100); // true i.e. Integer object 100 is added
		System.out.println(b);

		a1.add(200);
		a1.add(300);
		a1.add(400);
		System.out.println(a1); // return whole collection

		ArrayList a2 = new ArrayList(); // second collection
		a2.add("dev");
		a2.add("rathod");
		a2.add("Har");
		a2.add("Mahadev");

		System.out.println(a2);

		boolean c = a1.addAll(a2); // return true i.e. all elements of the second collection are added to first
									// collection
		System.out.println(c);
		System.out.println(a1); // return updated collection

		boolean d = a1.contains(200); // return true i.e. Integer object 200 is exist in collection a1
		System.out.println(d);

		boolean e = a1.contains(500); // return false i.e. Integer object 500 does not exist in collection a1
		System.out.println(e);

		boolean f = a1.isEmpty(); // return false i.e. collection a1 is not empty
		System.out.println(f);

		int g = a1.size(); // return 8 i.e. 8 elements are exist in collection a1(length of collection
							// object)
		System.out.println(g);

//		Object h = a1.remove(200); // show java.lang.IndexOutOfBoundsException exception i.e. in argument Integer
		// value taken as index position so here exceeds the length of the collection

		Object i = a1.remove(1); // return 200 i.e. Integer object 200 which is early exists in 1 index position
									// is removed now
		System.out.println(i);

		boolean k = a2.containsAll(a1); // return false i.e. In a2 collection does not exist all elements of collection
										// a1
		System.out.println(k);

		boolean k1 = a1.containsAll(a2); // return true i.e. In a1 collection all elements of collection a2 are exist
		System.out.println(k1);

		boolean j = a1.remove("rathod"); // return true i.e. String Object "rathod" is now removed from collection a1
		System.out.println(j);

		a2.add(700);
		System.out.println(a2);

		boolean l = a1.removeAll(a2); // return true i.e. all common elements are removed from collection a1 which are
										// also exists in collection a2
		System.out.println(l);
		System.out.println(a1); // updated collection
		System.out.println(a2);

		boolean m = a1.containsAll(a2); // return false i.e. in a1 collection all elements are not exist which is exist
										// in collection a2
		System.out.println(m);

		Iterator itr = a1.iterator(); // return one-by-one elements of collection i.e. return collection list
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		boolean n = a2.removeAll(a2); // return true i.e. for single collection removedAll method treat as clear
										// method and removed all elements from the collection
		System.out.println(n);
		System.out.println(a2); // updated empty collection

		a1.clear(); // now collection a1 is empty i.e. clear method deletes all the elements of
					// collection a1
		System.out.println(a1);

		boolean o = a1.isEmpty(); // return true i.e. collection a1 is empty
		System.out.println(o);
	}
}
