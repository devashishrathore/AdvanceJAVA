package dataStructure;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

// -----------------------------------------  Iterator(I), ListIterator(I), And Enumeration(I)  --------------------------------------------------------------------------------------

// Cursor -> In Java we can print direct collection by using System.out.println(collection object name), and it prints the whole collection i.e. all elements of the collection 
//           But To retrieve one-by-one or separate elements from a collection use cursors.

// Three Cursors are used in Java to retrieve elements. They are pre-defined Interfaces and they have Some methods to work with the collection's elements.

// -> (i)  Iterator -> To retrieve the elements in a forward direction from a collection use Iterator cursors and Its universal interface for root collection interface.

// -> (ii) ListIterator -> To retrieve the elements in forward and backward directions from a collection use ListIterator cursors and It's used only with List interface implemented classes.

// -> (iii) Enumeration -> To retrieve the collection Objects one-by-one. It was introduced in the JDK 1.0 version. It can be used only with Legacy Classes i.e. Vector & Stack. 
//                         It can be get by elements() method i.e. Enumeration e = V.element();
//                         2 Methods of enumeration cursor are:- hasMoreElements(), & nextElement()
//                         It can be used to retrieve the elements only in the forward direction.
//                         It can be used only for read operations.                     

// Different between Iterator And ListIterator:-
// (1) We can get Iterator cursor by iterator() method i.e. Iterator itr1 = l.iterator();
//      While we can get ListIterator cursor by listIterator() method i.e. ListIterator itr2 = l.listIterator();
// (2) Iterator cursor can be used with any collection object i.e. It is universal for root Collection Interface
//      While ListIterator cursor can be used only with List Interface implemented classes i.e. ArrayList, LinkedList, Vector, and Stack
// (3) Iterator has 3 methods which are:- hasNext(), next(), remove()
//      While ListIterator has 6 methods which are:- hasNext(), next(), hasPrevious(), previous(), remove(), set()
// (4) By using the Iterator cursor, we can retrieve the elements only in the forward direction
//      While By using the ListIterator cursor we can retrieve the elements in forward and backward direction
// (5) By using the Iterator cursor, we can read & remove the elements
//      While By using the ListIterator cursor we can read, remove, replace, and add the elements

public class CollectionCursors {
	public static void main(String[] args) {

		List user1 = new ArrayList();
		user1.add("Dev");
		user1.add("Rathod");
		user1.add(8889524382L);
		user1.add("Indore");

		System.out.println(user1);

		Iterator itr1 = user1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		itr1.remove();
		System.out.println(user1);

		System.out.println("----------------------------------------------------");

		List user2 = new ArrayList();
		user2.add("Dev");
		user2.add("Rathod");
		user2.add(8889524382L);
		user2.add("Indore");

		ListIterator itr2 = user2.listIterator();

//		while (itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
		System.out.println("----------------------------------------------------");

		itr2.next();
		itr2.next();
		itr2.next();
		itr2.next();
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
//		itr2.add("Devashish");
//		System.out.println(user2);

//		itr2.remove();
//		System.out.println(user2);

		itr2.set(85);
		System.out.println(user2);

		System.out.println("----------------------------------------------------");

		Vector user3 = new Vector();
		user3.add(100);
		user3.add("indori");
		user3.add(800);
		user3.add("Hello");

		System.out.println(user3);

		Enumeration e = user3.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
