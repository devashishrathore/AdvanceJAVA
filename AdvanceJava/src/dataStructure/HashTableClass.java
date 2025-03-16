package dataStructure;

import java.util.Hashtable;

// =========================================================================  Hashtable Class =================================================================================================

// Hashtable -> Hashtable is the directly implemented class of the Map interface and it is a legacy class that was introduced in the JDK 1.0 version and 
//              Its underlying data structure is Hashtable. 

// ##Basic Syntax:- class Hashtable implements Map{
//                   Constructors...
//                   Methods...
//                  }

// Properties of Hashtable:- 
// (1) Hashtable contains the data in key-value pair & each key-value pair is known as entry
// (2) In Hashtable, keys should always be unique but values can be duplicated
// (3) Hashtable can store heterogeneous elements or different types of elements at key position
// (4) We cannot store a null value in Hashtable
// (5) Hashtable does not follow the insertion and sorting order
// (6) Hashtable are synchronized data-structure

// Working of Hashtable:-
// In Hashtable default initial capacity is 11 i.e. 11 elements can be stored in the form of Hashtable so whenever any object is created for Hashtable Class it creates a table with 11 buckets now
// If we put elements in the Hashtable collection, JVM will provide every object hashCode value and it is unique for every element so now the element hashCode value is divided by its no.of buckets
// or capacity so the reminder value is the index position of elements from 11 buckets, now if a condition occurs with 2 elements having the same reminder value then other/second elements are attached as 
// LinkedList form by creating other nodes and this situation is known as Hash-Collision and now retrieve elements from top to bottom of the table(i.e. last index position to 0 index position) 
// and from right to left(if two or more elements have the same index position).

// Hash-Collision -> It is the situation when multiple data share the same indices(index position) value.

public class HashTableClass {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable(); // Hashtable object with initial capacity is 11.
		ht.put(101, "dev");
		ht.put(102, "rathod");
		ht.put(105, "raj");

		System.out.println(ht);
	}
}
