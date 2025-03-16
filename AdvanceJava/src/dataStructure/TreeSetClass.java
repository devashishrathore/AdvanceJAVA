package dataStructure;

import java.util.Iterator;
import java.util.TreeSet;

// -------------------------------------------------------------------------------  TreeSet Class  --------------------------------------------------------------------------------------

// TreeSet -> TreeSet is the directly implemented class of NavigableSet but indirectly implements SortedSet and Set interface and it was introduced in the JDK 1.2 version that is present in java.util package
//            TreeSet underlines data structure as "Balanced Tree".

// ## Basic Syntax:- class TreeSet implements NavigableSet{
//                       Constructors...
//                       Methods...
//                     }

// Properties of TreeSet:-
// (1) TreeSet is not an index-based data structure
// (2) TreeSet does not follow the insertion order
// (3) TreeSet follows the Sorting order due to suppose if we create a TreeSet Object and add values so the first value acts as the parent of all values 
//     now if we add another value it's greater than the parent value it added on the right side of the parent value now again another value
//     is added so if this value is less than the parent value it will added on the left side of the parent value now again fourth element is added
//     now if this value/element is greater than the parent it goes to the right side value and compares with it and now that element value is less than 
//     that right side value so it will be added on the left side of the right side value of the parent and again if elements are added so again this same process
//     will follow, so in TreeSet elements are added in tree shape and this phenomenon is possible due to the Comparable interface method compareTo(Object obj)
//     compares objects with existing parent and their child elements and puts elements where the compareTo() method found the last element with respect 
//     comparison element as the sequence. so if we retrieve elements they will be printed from left to right which means smaller to bigger or sorting order that's why it 
//     follows the "Sorting Order".

// (4) TreeSet stores homogeneous(same data-types) elements due to in backup or back side of TreeSet it's not possible to compare different data types elements/objects
//     with each other so does not create a tree shape and sorting order

// (5) TreeSet can't store the duplicate elements due to in TreeSet positive values are stored on the right side of the comparison element and negative values are stored on the left side of 
//     comparison element so there is no space for the same value it's not possible to store the same duplicate values.

// (6) TreeSet is a non-synchronized data structure so It is not thread-safe and does not show data consistency.

// (7) Null value can't be inserted in TreeSet due to occurs problem of comparing elements with null so it shows the nullPointerException from the earlier 1.6 version we can store only one null
//     value but now after the 1.6 version it was finally removed from TreeSet.

// Constructors of TreeSet:-
// (1) TreeSet() -> no argument Constructor
// (2) TreeSet(collection c) -> 
// (3) TreeSet(Comparator) ->
// (4) TreeSet(SortedSet) -> 

// Methods of TreeSet:-
// TreeSet is an implemented class of NavigableSet(I), SortedSet(I), Set(I) as well as root interface Collection(I) so all methods of that interface are contained in the TreeSet class.

public class TreeSetClass {
	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		ts.add(20);
		ts.add(80);
		ts.add(10);
		ts.add(50);
		ts.add(40);
		ts.add(30);
		ts.add(70);

		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.comparator());
		System.out.println(ts.ceiling(20));

		System.out.println("-------------------------------------");
		Iterator itr = ts.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-------------------------------------");

		Iterator itr2 = ts.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("-------------------------------------");
		System.out.println(ts.higher(60));
		System.out.println(ts.descendingSet());
		System.out.println(ts.lower(60));
		System.out.println(ts);

//		ts.add("dev"); // Show java.lang.ClassCastException exception i.e. store only homogeneous data types 
	}
}
