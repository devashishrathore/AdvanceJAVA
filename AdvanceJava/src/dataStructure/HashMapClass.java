package dataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// -----------------------------------------------------------------------  HashMap Class  ----------------------------------------------------------------------------------------------

// HashMap -> HashMap is an implemented class of Map interface. that is present in java.util package. HashMap was introduced in the JDK 1.2 version.
//            Its underline Data structure is "HashTable"

// Basic Syntax:- class HashMap implements Map{
//                      Constructors...
//                      Methods...
//                   }

// Properties of HashMap:-
// (1) HashMap stores the value in the Key-Value pair. Each Key-Value pair is known as an Entry and 
//     This entry is a pre-defined Interface in Map by using this we can get a Key-Value pair with its pre-defined methods.
// (2) In HashMap the Key should always be unique but values can be duplicated. If inserted duplicate keys so the first key's value is replaced by the second or last duplicate Key's value.
// (3) HashMap contains a maximum of one null value in Key but it can store multiple null values in Value.
// (4) HashMap can store heterogeneous elements
// (5) HashMap does not follow the sorting & insertion order.
// (6) HashMap is a non-synchronized data structure.

// Constructors of HashMap:- 
// There are 4 Constructors in HashMap which are:-
// (1) HashMap() ->  no argument Constructor
// (2) HashMap(int capacity) -> capacity argument Constructor, HashMap capacity means the number of buckets in the hash table due to HashMap underlining data structure in the hash table.
//                              When we create HashMap, initialCapacity will be 16 which we can change.
// (3) HashMap(Map m) ->  Map argument Constructor, we can pass the reference of another Map
// (4) HashMap(int capacity, float loadFactor) ->  capacity and load factor arguments Constructor, Load Factor is a threshold when we add the elements in HashMap and it crosses this threshold then
//The capacity of HashMap will get increased. The default load factor is 0.75.

// Methods of HashMap:-
// HashMap is an implemented class of Map(I) so all methods of Map(I) are contained in the HashMap class.

// (1) put(Object Key, Object value) -> To add the elements in HashMap collection
// (2) remove(Object Key) -> To remove the elements from collection by key 
// (3) remove(Object Key, Object value) -> To remove the elements from the collection by key and value pair
// (4) containsKey(Object key) -> To check object Key is exist or not. if it exists it will return true otherwise false.
// (5) containsValue(Object value) -> To check object Value is exist or not. if it exists it will return true otherwise false.
// (6) get(Object key) -> To get element by corresponding key
// (7) putAll(Map m) -> To merge one HashMap into other Map.
// (8) entrySet() -> To convert map entry elements into set and help to retrieve key and value
// and many more methods exist...

// We can retrieve HashMap elements in 2 Ways:-
// (1) Using Set and Iterator interface but inbuilt Map.The entry interface is always used 
// (2) Directly i.e. without using the Set & Iterator interface but inbuilt Map.The entry interface is always used

public class HashMapClass {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap(); // no argument Constructor
		hm.put(10, "dev"); // add/put element
		hm.put(11, "deva");
		hm.put(12, "devansh");
		hm.put(13, "devesh");
		hm.put(14, "dev"); // contains duplicate Key's Value i.e. first and this element having same Key's
							// Value that is "dev".
		hm.put(10, "devraj"); // first element Key's(10) Value("dev") is replaced by this element Key's(10)
								// Value("devraj") due to duplicate Key

		System.out.println(hm);

//		Set set = hm.entrySet(); // Retrieve elements by Set and Iterator interface but it the old way
//		System.out.println(set);
//
//		Iterator itr = set.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			Map.Entry entry = (Map.Entry) itr.next(); // Using Entry interface to get one-by-one separate elements or
//														// Keys or Values, here itr.next() return value in an object so
//														//typecast the object in Map.Entry
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//			System.out.println(entry.getKey() + "->" + entry.getValue());
//		}

		for (Map.Entry me : hm.entrySet()) { // Retrieve elements Directly i.e. without using the Set & Iterator
												// interface separate keys or separate values for each loop but we need
												// to provide generic due to typecasting problem
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			System.out.println(me.getKey() + "->" + me.getValue());
		}
		System.out.println(hm.remove(13));
		System.out.println(hm.containsKey(14));
		System.out.println(hm.containsKey(13));

		System.out.println(hm.containsValue("dev"));
		System.out.println(hm.containsValue("raj"));

		System.out.println(hm.get(14));
	}
}
