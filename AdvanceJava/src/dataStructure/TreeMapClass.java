package dataStructure;

import java.util.TreeMap;

//  ===================================================================  TreeMap Class  ==============================================================================================

// TreeMap -> TreeMap is an implemented class of NavigableMap but it also inherits the properties of the SortedMap & Map interface, 
//            which is present in java.util package and it was introduced in the JDK 1.2 version also its underlying data structure is a "Red-Black Tree".

// Properties of Red-Black Tree:-
// (1) Every node is either red or black color.
// (2) The root node is always black.
// (3) Every leaf node(Null node) is black.
// (4) If a node is red, then both its children are black.
// (5) For each node, all paths from the node to its descendant leaf nodes contain the same number of black nodes.

// ##Basic Syntax:- class TreeMap implements NavigableMap {
//                         Constructors...
//                         Methods...
//                      }

// Properties of TreeMap:-
// (1) we store the data in a Key-Value pair in which keys should be unique but values can be duplicated.
// (2) TreeMap does not follow the insertion order but follows the sorting order concerning Keys.
// (3) It can store homogeneous elements with a default sorting nature & heterogeneous elements with a user-defined sorting nature by using a comparator.
// (4) TreeMap can't store null values due to following the sorting order nature
// (5) TreeMap is a non-synchronized data structure

// Constructors of TreeMap:-
// There are 4 constructors in the TreeMap Class
// (1) TreeMap() -> no arguments Constructor
// (2) TreeMap(Comparator ) -> Comparator arguments Constructor, To handle the user-defined sorting order with comparator
// (3) TreeMap(Map ) -> Map arguments Constructor, To merge one Map/TreeMap into another TreeMap. 
// (4) TreeMap(sortedMap) -> sortedMap arguments Constructor, we can pass the sortedMap also in the constructor parameter.

// Methods of TreeMap:-
// TreeMap is an implemented class of NavigableMap but it also inherits the properties of the SortedMap & Map interface, so all methods of NavigableMap(I), SortedMap(I), and Map(I) are contained in TreeMap.
// 

public class TreeMapClass {
	public static void main(String[] args) {

		TreeMap tm = new TreeMap();
		
		tm.put(101, "dev");
		tm.put(102, "Raja");
		tm.put(103, "sort");
		tm.put(108, "celingKey");
		tm.put(104,"raj");
		tm.put(105, "rahul");
		
		System.out.println(tm);
		
	System.out.println(	tm.ceilingEntry(103));
	System.out.println(	tm.ceilingEntry(106));
	
	System.out.println(	tm.ceilingKey(103));
	System.out.println(	tm.ceilingKey(106));
	
	System.out.println(tm.floorEntry(103));
	System.out.println(tm.floorKey(103));
	
	System.out.println(tm.get(103));
	
	System.out.println(tm.higherKey(102));
	System.out.println(tm.higherKey(108));
	
	System.out.println(tm.lowerKey(102));
	System.out.println(tm.lowerKey(101));
	
	System.out.println(tm.headMap(104));
			
		
	}

}
