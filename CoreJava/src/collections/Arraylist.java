package collections;

import java.util.ArrayList;

public class Arraylist {
	//ArrayList allow duplicates,insert,index,order
	// ArrayList<> is a wrapper class

//	### **ArrayList**
//
//	- Uses a dynamic array internally.
//	- Maintains insertion order.
//	- Allows duplicate elements.
//	- Allows null values.
//	- Fast for retrieving elements using index.
//
//	**Operations:**
//
//	| Operation     | Purpose                 |
//	| ------------- | ----------------------- |
//	| add()         | Adds elements           |
//	| addAll()      | Adds another collection |
//	| get()         | Gets an element         |
//	| set()         | Updates an element      |
//	| remove()      | Removes an element      |
//	| contains()    | Checks element          |
//	| indexOf()     | Finds first index       |
//	| lastIndexOf() | Finds last index        |
//	| size()        | Returns size            |
//	| clear()       | Removes all elements    |
//	| sort()        | Sorts elements          |
//	| subList()     | Gets a portion of list  |
//
	//**1. ArrayList**
	//
	//- add()
	//- addAll()
	//- get()
	//- set()
	//- remove()
	//- removeAll()
	//- retainAll()
	//- contains()
	//- containsAll()
	//- indexOf()
	//- lastIndexOf()
	//- size()
	//- isEmpty()
	//- clear()
	//- toArray()
	//- sort()
	//- subList()
	
	
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
			arr.add("Loops");
			arr.add("Oops");
			arr.add("Collections");
			arr.add("Thread");
			System.out.println(arr);
			System.out.println(arr.get(0));
			arr.addFirst("Java");
			arr.addLast("Programming");
			
			System.out.println(arr.size());
			System.out.println(arr.isEmpty());
			arr.clear();
			System.out.println(arr);
			System.out.println(arr.clone());
			System.out.println(arr.indexOf("Loops"));
	}

}
