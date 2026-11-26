package collections;

public class operationsUsedInCollections {

	public static void main(String[] args) {
		
//		# **Complete Java Collections Framework – Detailed Notes for Interviews**
//
//		Let's learn the **Java Collections Framework from basics to advanced level**, including definitions, hierarchy, interfaces, implementation classes, operations, examples, advantages, disadvantages and interview differences.
//
//		I'll explain each concept in simple English so you can understand it and confidently answer when an interviewer asks questions.
//
//		# **PART 1: COLLECTION FRAMEWORK**
//
//		## **1. What is a Collection?**
//
//		A Collection in Java is an object that represents a group of individual objects as a single unit.
//
//		It is used to store, retrieve, insert, delete and manipulate multiple elements.
//
//		**Example:**
//
//		Suppose we want to store five student names.
//
//		Without Collection:
//
//		```
//		String s1 = "Ram";
//		String s2 = "Sam";
//		String s3 = "Ravi";
//		String s4 = "John";
//		String s5 = "Kiran";
//		```
//
//		Using Collection:
//
//		```
//		ArrayList<String> students = new ArrayList<>();
//
//		students.add("Ram");
//		students.add("Sam");
//		students.add("Ravi");
//		students.add("John");
//		students.add("Kiran");
//
//		System.out.println(students);
//		```
//
//		Output:
//
//		```
//		[Ram, Sam, Ravi, John, Kiran]
//		```
//
//		Instead of creating multiple variables, we can store multiple elements in one collection object.
//
//		## **2. What is the Collection Framework?**
//
//		The Java Collections Framework is a set of predefined interfaces, classes and methods used to store and manipulate groups of objects.
//
//		It provides ready-made data structures, so developers don't need to implement everything from scratch.
//
//		### **Why do we use the Collection Framework?**
//
//		1. To store multiple objects.
//		2. To add and remove elements dynamically.
//		3. To search for elements.
//		4. To sort elements.
//		5. To eliminate duplicate elements.
//		6. To store data in different formats.
//		7. To reduce programming effort.
//		8. To improve code reusability.
//
//		## **3. Collection vs Collection Framework**
//
//		| Collection                              | Collection Framework                        |
//		| --------------------------------------- | ------------------------------------------- |
//		| An interface in Java                    | A complete architecture                     |
//		| Represents a group of objects           | Contains interfaces, classes and algorithms |
//		| Parent interface of List, Set and Queue | Provides data storage and manipulation      |
//		| Part of `java.util`                     | Mainly provided through `java.util`         |
//
//		## **4. Collection Framework Hierarchy**
//
//		[Структуры данных Java #неОпятьАСнова #javaJunior / Хабр](https://images.openai.com/static-rsc-4/asFLbAgzDrFmZIIVwjeORVS0tOAdyaIJ7OqFyMF4uCnW5mRDNraWXUWB-ED0HamSzGwYQg2zgKgtSlXqkFbDd1vkblLqxgvK5lE_oQyR0oBSRYQ39q1ejeS8R0y2PtuQ1uNGRo5haljOJdMcJQsK1zBrWlgFlLRz1pw4AI0G9cA?purpose=inline)
//
//		[habr.com](https://habr.com/ru/articles/696184/?utm_source=chatgpt.com)
//
//		The framework is divided into two major branches:
//
//		**A. Collection interface branch**
//
//		- List
//		- Set
//		- Queue
//		- Deque
//
//		**B. Map interface branch**
//
//		- HashMap
//		- LinkedHashMap
//		- TreeMap
//		- Hashtable
//
//		Important: Map is part of the Collections Framework, but it does not extend the Collection interface.
//
//		## **5. What is an Interface?**
//
//		An interface is a blueprint that specifies a set of methods that implementing classes provide.
//
//		For example:
//
//		```
//		List<Integer> list = new ArrayList<>();
//		```
//
//		Here:
//
//		- `List` is an interface.
//		- `ArrayList` is an implementation class.
//		- `list` is a reference variable.
//
//		The advantage is that we can change the implementation without changing much of our code.
//
//		## **6. What is a Class?**
//
//		A class is a blueprint used to create objects.
//
//		In Collections, classes provide actual implementations of collection interfaces.
//
//		Examples:
//
//		- ArrayList implements List.
//		- HashSet implements Set.
//		- PriorityQueue implements Queue.
//		- HashMap implements Map.
//
//		# **PART 2: LIST INTERFACE**
//
//		## **7. What is List?**
//
//		List is an interface in Java that is used to store multiple elements in a single object.
//
//		**Characteristics:**
//
//		1. Allows duplicate elements.
//		2. Maintains insertion order.
//		3. Allows multiple null values in its common implementations.
//		4. Supports index-based access.
//		5. Elements can be inserted, updated and deleted.
//		6. It is part of the Collection interface hierarchy.
//
//		**Example:**
//
//		```
//		List<Integer> list = new ArrayList<>();
//
//		list.add(10);
//		list.add(20);
//		list.add(10);
//		list.add(30);
//
//		System.out.println(list);
//		```
//
//		Output:
//
//		```
//		[10, 20, 10, 30]
//		```
//
//		Notice that 10 appears twice. This is allowed in List.
//
//		## **8. Types of List**
//
//		List has four commonly taught implementation classes:
//
//		1. ArrayList
//		2. LinkedList
//		3. Vector
//		4. Stack
//
//		## **9. ArrayList**
//
//		Important for interviews
//
//		**Definition:** ArrayList is a resizable-array implementation of the List interface. It stores elements in a dynamic array.
//
//		### **Characteristics**
//
//		- Maintains insertion order.
//		- Allows duplicate elements.
//		- Allows multiple null values.
//		- Supports index-based access.
//		- Its capacity grows automatically when required.
//		- Not synchronized.
//		- Retrieving elements by index is generally fast.
//
//		### **Internal working**
//
//		ArrayList uses an array internally.
//
//		For example:
//
//		```
//		ArrayList<Integer> list = new ArrayList<>();
//
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		```
//
//		Conceptually, the elements are stored like this:
//
//		**ArrayList internal representation**
//
//		**10**
//
//		Index 0
//
//		**20**
//
//		Index 1
//
//		**30**
//
//		Index 2
//
//		Elements are accessed using their indexes, starting from zero.
//
//		### **ArrayList constructors**
//
//		```
//		ArrayList<Integer> a = new ArrayList<>();
//		```
//
//		Creates an empty ArrayList.
//
//		```
//		ArrayList<Integer> b = new ArrayList<>(20);
//		```
//
//		Creates an ArrayList with an initial capacity of 20.
//
//		```
//		ArrayList<Integer> c = new ArrayList<>(a);
//		```
//
//		Creates an ArrayList containing elements from another collection.
//
//		### **Every important ArrayList operation**
//
//		| Operation         | Explanation                                        |
//		| ----------------- | -------------------------------------------------- |
//		| `add(e)`          | Adds an element at the end                         |
//		| `add(index,e)`    | Adds an element at a particular index              |
//		| `addAll(c)`       | Adds all elements from another collection          |
//		| `addAll(index,c)` | Adds another collection at a particular index      |
//		| `get(index)`      | Retrieves an element                               |
//		| `set(index,e)`    | Replaces an existing element                       |
//		| `remove(index)`   | Removes an element by index                        |
//		| `remove(object)`  | Removes a matching element                         |
//		| `removeAll(c)`    | Removes all elements present in another collection |
//		| `retainAll(c)`    | Keeps only common elements                         |
//		| `contains(e)`     | Checks whether an element exists                   |
//		| `containsAll(c)`  | Checks whether all specified elements exist        |
//		| `indexOf(e)`      | Returns first matching index                       |
//		| `lastIndexOf(e)`  | Returns last matching index                        |
//		| `size()`          | Returns number of elements                         |
//		| `isEmpty()`       | Checks whether list is empty                       |
//		| `clear()`         | Removes all elements                               |
//		| `toArray()`       | Converts list into an array                        |
//		| `subList(a,b)`    | Returns a portion of the list                      |
//		| `sort()`          | Sorts the list                                     |
//		| `iterator()`      | Traverses the elements                             |
//		| `listIterator()`  | Traverses forward and backward                     |
//		| `forEach()`       | Performs an action on each element                 |
//
//		### **Example program**
//
//		```
//		import java.util.*;
//
//		public class ArrayListDemo {
//		    public static void main(String[] args) {
//
//		        ArrayList<Integer> list = new ArrayList<>();
//
//		        // Adding elements
//		        list.add(10);
//		        list.add(20);
//		        list.add(30);
//		        list.add(10);
//
//		        System.out.println(list);
//
//		        // Accessing
//		        System.out.println(list.get(1));
//
//		        // Updating
//		        list.set(1, 50);
//
//		        // Removing
//		        list.remove(Integer.valueOf(30));
//
//		        // Checking
//		        System.out.println(list.contains(10));
//
//		        // Size
//		        System.out.println(list.size());
//
//		        // Sorting
//		        Collections.sort(list);
//
//		        // Traversing
//		        for (int n : list) {
//		            System.out.println(n);
//		        }
//
//		        // Clearing
//		        list.clear();
//		    }
//		}
//		```
//
//		### **Advantages**
//
//		- Easy to use.
//		- Fast retrieval using indexes.
//		- Automatically resizes.
//		- Allows duplicates.
//
//		### **Disadvantages**
//
//		- Inserting or deleting elements in the middle may require shifting elements.
//		- Not synchronized.
//		- May require resizing when capacity is exhausted.
//
//		### **When do we use ArrayList?**
//
//		When we need frequent retrieval of elements and don't need frequent insertion or deletion in the middle.
//
//		## **10. LinkedList**
//
//		**Definition:** LinkedList is a class that implements both List and Deque interfaces. It uses a doubly linked list internally.
//
//		### **What is a Node?**
//
//		A node is an individual element containing:
//
//		1. Data.
//		2. Reference to the previous node.
//		3. Reference to the next node.
//
//		**LinkedList internal representation**
//
//		**10**
//
//		Node 1
//
//		**20**
//
//		Node 2
//
//		**30**
//
//		Node 3
//
//		Each node connects to the previous and next node.
//
//		### **Characteristics**
//
//		- Maintains insertion order.
//		- Allows duplicates.
//		- Allows null elements.
//		- No index-based direct array access.
//		- Efficient insertion and deletion at the ends.
//		- Not synchronized.
//		- Implements List and Deque.
//
//		### **Constructors**
//
//		```
//		LinkedList<Integer> list = new LinkedList<>();
//		```
//
//		```
//		LinkedList<Integer> list2 = new LinkedList<>(list);
//		```
//
//		### **Operations**
//
//		| Operation                 | Explanation                     |
//		| ------------------------- | ------------------------------- |
//		| `add()`                   | Adds an element                 |
//		| `addFirst()`              | Adds at beginning               |
//		| `addLast()`               | Adds at end                     |
//		| `get()`                   | Retrieves by index              |
//		| `getFirst()`              | Retrieves first element         |
//		| `getLast()`               | Retrieves last element          |
//		| `set()`                   | Updates an element              |
//		| `remove()`                | Removes an element              |
//		| `removeFirst()`           | Removes first element           |
//		| `removeLast()`            | Removes last element            |
//		| `removeFirstOccurrence()` | Removes first matching element  |
//		| `removeLastOccurrence()`  | Removes last matching element   |
//		| `peek()`                  | Retrieves head without removing |
//		| `poll()`                  | Retrieves and removes head      |
//		| `offer()`                 | Inserts an element              |
//		| `size()`                  | Returns size                    |
//		| `contains()`              | Checks element                  |
//		| `clear()`                 | Removes everything              |
//
//		### **Example**
//
//		```
//		import java.util.*;
//
//		public class LinkedListDemo {
//		    public static void main(String[] args) {
//
//		        LinkedList<Integer> list = new LinkedList<>();
//
//		        list.add(10);
//		        list.add(20);
//
//		        list.addFirst(5);
//		        list.addLast(30);
//
//		        System.out.println(list);
//
//		        System.out.println(list.getFirst());
//		        System.out.println(list.getLast());
//
//		        list.removeFirst();
//		        list.removeLast();
//
//		        System.out.println(list);
//		    }
//		}
//		```
//
//		### **Advantages**
//
//		- Easy insertion and deletion at both ends.
//		- Implements List and Deque.
//		- No fixed array capacity.
//
//		### **Disadvantages**
//
//		- Accessing an element by index requires traversal.
//		- Requires extra memory for node references.
//
//		### **When do we use LinkedList?**
//
//		When we need frequent insertions and deletions at the beginning or end, or need to use a list as a queue or deque.
//
//		## **11. Vector**
//
//		**Definition:** Vector is a resizable-array implementation of the List interface. It is similar to ArrayList, but its methods are synchronized.
//
//		### **Characteristics**
//
//		1. Maintains insertion order.
//		2. Allows duplicate elements.
//		3. Allows multiple null values.
//		4. Supports index-based access.
//		5. Automatically increases its capacity.
//		6. Synchronized, so individual operations are thread-safe.
//		7. Generally slower than ArrayList in single-threaded programs due to synchronization overhead.
//
//		### **Internal working**
//
//		Vector internally uses a dynamic array.
//
//		For example:
//
//		```
//		Vector<Integer> v = new Vector<>();
//
//		v.add(10);
//		v.add(20);
//		v.add(30);
//		```
//
//		### **Constructors**
//
//		```
//		Vector<Integer> v1 = new Vector<>();
//		```
//
//		Creates an empty Vector.
//
//		```
//		Vector<Integer> v2 = new Vector<>(20);
//		```
//
//		Creates a Vector with initial capacity 20.
//
//		```
//		Vector<Integer> v3 = new Vector<>(10, 5);
//		```
//
//		Initial capacity is 10 and capacity increases by 5 when needed.
//
//		### **Operations**
//
//		| Operation           | Explanation                                |
//		| ------------------- | ------------------------------------------ |
//		| `add()`             | Adds an element                            |
//		| `addElement()`      | Adds an element at the end                 |
//		| `addAll()`          | Adds another collection                    |
//		| `get()`             | Retrieves an element by index              |
//		| `elementAt()`       | Retrieves an element at a particular index |
//		| `firstElement()`    | Returns first element                      |
//		| `lastElement()`     | Returns last element                       |
//		| `set()`             | Updates an element                         |
//		| `setElementAt()`    | Updates at a particular index              |
//		| `remove()`          | Removes an element                         |
//		| `removeElement()`   | Removes a matching element                 |
//		| `removeElementAt()` | Removes by index                           |
//		| `removeAll()`       | Removes all matching elements              |
//		| `contains()`        | Checks whether element exists              |
//		| `capacity()`        | Returns current capacity                   |
//		| `size()`            | Returns number of elements                 |
//		| `isEmpty()`         | Checks whether empty                       |
//		| `clear()`           | Removes all elements                       |
//		| `elements()`        | Returns an Enumeration                     |
//
//		### **Example**
//
//		```
//		import java.util.*;
//
//		public class VectorDemo {
//		    public static void main(String[] args) {
//
//		        Vector<Integer> v = new Vector<>();
//
//		        v.add(10);
//		        v.add(20);
//		        v.add(30);
//
//		        v.addElement(40);
//
//		        System.out.println(v);
//
//		        System.out.println(v.firstElement());
//		        System.out.println(v.lastElement());
//
//		        v.set(1, 50);
//
//		        v.removeElement(30);
//
//		        System.out.println(v);
//		        System.out.println(v.capacity());
//		    }
//		}
//		```
//
//		### **When do we use Vector?**
//
//		When working with older Java applications that require synchronized list operations. For modern concurrent applications, other concurrency solutions may be more suitable.
//
//		## **12. Stack**
//
//		Important for interviews
//
//		**Definition:** Stack is a class in Java that follows the LIFO principle.
//
//		LIFO means Last In First Out.
//
//		The element inserted last will be removed first.
//
//		### **Real-time example**
//
//		Think about a stack of plates.
//
//		- First, you place plate 1.
//		- Then, plate 2.
//		- Finally, plate 3.
//		- When you take a plate, plate 3 comes out first.
//
//		This is how Stack works.
//
//		## **Stack – LIFO**
//
//		Top – Removed first
//
//		30
//
//		20
//
//		10
//
//		Bottom – Inserted first
//
//		### **Characteristics**
//
//		1. Follows LIFO.
//		2. Allows duplicate elements.
//		3. Allows null elements.
//		4. Extends Vector.
//		5. Its methods are synchronized through Vector.
//		6. Supports push and pop operations.
//
//		### **Operations**
//
//		| Operation  | Explanation                                                           |
//		| ---------- | --------------------------------------------------------------------- |
//		| `push()`   | Adds an element to the top                                            |
//		| `pop()`    | Removes and returns the top element                                   |
//		| `peek()`   | Returns top element without removing                                  |
//		| `empty()`  | Checks whether stack is empty                                         |
//		| `search()` | Searches for an element and returns its 1-based position from the top |
//
//		### **Example**
//
//		```
//		import java.util.*;
//
//		public class StackDemo {
//		    public static void main(String[] args) {
//
//		        Stack<Integer> stack = new Stack<>();
//
//		        stack.push(10);
//		        stack.push(20);
//		        stack.push(30);
//
//		        System.out.println(stack);
//
//		        System.out.println(stack.peek());
//
//		        System.out.println(stack.pop());
//
//		        System.out.println(stack.search(10));
//
//		        System.out.println(stack.empty());
//		    }
//		}
//		```
//
//		Output:
//
//		```
//		[10, 20, 30]
//		30
//		30
//		2
//		false
//		```
//
//		### **When do we use Stack?**
//
//		- Undo and redo operations.
//		- Browser history.
//		- Expression evaluation.
//		- Function call management.
//		- Parentheses matching.
//
//		**Interview point:** In modern Java, `ArrayDeque` is generally preferred over the legacy Stack class for stack operations.
//
//		# **PART 3: SET INTERFACE**
//
//		## **13. What is Set?**
//
//		**Definition:** Set is an interface that stores unique elements. It does not allow duplicate elements.
//
//		### **Characteristics**
//
//		1. Does not allow duplicates.
//		2. Order depends on its implementation.
//		3. Does not support index-based access.
//		4. Provides methods to add, remove and search elements.
//		5. Extends the Collection interface.
//
//		### **Example**
//
//		```
//		Set<Integer> set = new HashSet<>();
//
//		set.add(10);
//		set.add(20);
//		set.add(10);
//		set.add(30);
//
//		System.out.println(set);
//		```
//
//		Output (order may vary):
//
//		```
//		[10, 20, 30]
//		```
//
//		Even though we added 10 twice, it is stored only once.
//
//		### **Types of Set**
//
//		1. HashSet
//		2. LinkedHashSet
//		3. TreeSet
//
//		## **14. HashSet**
//
//		**Definition:** HashSet is an implementation of the Set interface that stores unique elements using a hash table.
//
//		### **Characteristics**
//
//		1. Does not allow duplicates.
//		2. Does not guarantee insertion order.
//		3. Allows one null element.
//		4. Does not support index-based access.
//		5. Not synchronized.
//		6. Provides generally constant-time basic operations when hash distribution is good.
//
//		### **Internal working**
//
//		HashSet internally uses a HashMap to store elements.
//
//		For example:
//
//		```
//		HashSet<Integer> set = new HashSet<>();
//
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		```
//
//		Internally, the elements are used as keys in a HashMap.
//
//		### **Constructors**
//
//		```
//		HashSet<Integer> s1 = new HashSet<>();
//		```
//
//		```
//		HashSet<Integer> s2 = new HashSet<>(20);
//		```
//
//		```
//		HashSet<Integer> s3 = new HashSet<>(20, 0.75f);
//		```
//
//		Here, `0.75f` is the load factor.
//
//		### **What is Load Factor?**
//
//		Load factor determines when a hash table should resize.
//
//		For example, the default load factor is 0.75. When the table becomes sufficiently full, it grows to accommodate more entries.
//
//		### **Operations**
//
//		| Operation       | Explanation                               |
//		| --------------- | ----------------------------------------- |
//		| `add()`         | Adds an element                           |
//		| `addAll()`      | Adds all elements from another collection |
//		| `remove()`      | Removes an element                        |
//		| `removeAll()`   | Removes matching elements                 |
//		| `retainAll()`   | Retains common elements                   |
//		| `contains()`    | Checks whether element exists             |
//		| `containsAll()` | Checks whether all elements exist         |
//		| `size()`        | Returns number of elements                |
//		| `isEmpty()`     | Checks whether empty                      |
//		| `clear()`       | Removes all elements                      |
//		| `iterator()`    | Traverses the set                         |
//		| `toArray()`     | Converts into array                       |
//
//		### **Example**
//
//		```
//		import java.util.*;
//
//		public class HashSetDemo {
//		    public static void main(String[] args) {
//
//		        HashSet<Integer> set = new HashSet<>();
//
//		        set.add(10);
//		        set.add(20);
//		        set.add(30);
//		        set.add(10);
//
//		        System.out.println(set);
//
//		        set.remove(20);
//
//		        System.out.println(set.contains(10));
//
//		        System.out.println(set.size());
//
//		        for (int n : set) {
//		            System.out.println(n);
//		        }
//		    }
//		}
//		```
//
//		### **Advantages**
//
//		- Removes duplicate elements.
//		- Fast searching, insertion and deletion on average.
//		- Easy to use.
//
//		### **Disadvantages**
//
//		- Does not maintain insertion order.
//		- Does not provide index-based access.
//		- Not synchronized.
//
//		### **When do we use HashSet?**
//
//		When we need to store unique elements and do not care about their order.
//
//		## **15. LinkedHashSet**
//
//		**Definition:** LinkedHashSet is an implementation of Set that stores unique elements and maintains insertion order.
//
//		### **Characteristics**
//
//		1. Does not allow duplicates.
//		2. Maintains insertion order.
//		3. Allows one null element.
//		4. Uses a hash table and linked list internally.
//		5. Not synchronized.
//		6. Supports fast basic operations on average.
//
//		### **Example**
//
//		```
//		LinkedHashSet<Integer> set = new LinkedHashSet<>();
//
//		set.add(30);
//		set.add(10);
//		set.add(20);
//		set.add(10);
//
//		System.out.println(set);
//		```
//
//		Output:
//
//		```
//		[30, 10, 20]
//		```
//
//		Notice:
//
//		- Duplicate 10 is removed.
//		- Insertion order is maintained.
//
//		### **Operations**
//
//		- `add()` – Adds an element.
//		- `addAll()` – Adds another collection.
//		- `remove()` – Removes an element.
//		- `removeAll()` – Removes matching elements.
//		- `retainAll()` – Retains common elements.
//		- `contains()` – Checks element availability.
//		- `containsAll()` – Checks all specified elements.
//		- `size()` – Returns size.
//		- `isEmpty()` – Checks whether empty.
//		- `clear()` – Removes all elements.
//		- `iterator()` – Traverses elements.
//		- `toArray()` – Converts into array.
//
//		### **When do we use LinkedHashSet?**
//
//		When we want to remove duplicates but also maintain the original insertion order.
//
//		## **16. TreeSet**
//
//		Important for interviews
//
//		**Definition:** TreeSet is an implementation of the Set interface that stores unique elements in sorted order.
//
//		### **Characteristics**
//
//		1. Does not allow duplicates.
//		2. Stores elements in sorted order.
//		3. By default, sorts elements in ascending order.
//		4. Uses a Red-Black Tree internally.
//		5. Does not allow null with natural ordering.
//		6. Not synchronized.
//		7. Provides methods to retrieve higher, lower, first and last elements.
//
//		### **Example**
//
//		```
//		TreeSet<Integer> set = new TreeSet<>();
//
//		set.add(30);
//		set.add(10);
//		set.add(20);
//		set.add(10);
//
//		System.out.println(set);
//		```
//
//		Output:
//
//		```
//		[10, 20, 30]
//		```
//
//		### **Important TreeSet operations**
//
//		| Operation         | Explanation                                            |
//		| ----------------- | ------------------------------------------------------ |
//		| `add()`           | Adds an element                                        |
//		| `remove()`        | Removes an element                                     |
//		| `contains()`      | Checks element                                         |
//		| `first()`         | Returns smallest element                               |
//		| `last()`          | Returns largest element                                |
//		| `higher(e)`       | Returns smallest element strictly greater than e       |
//		| `lower(e)`        | Returns largest element strictly smaller than e        |
//		| `ceiling(e)`      | Returns smallest element greater than or equal to e    |
//		| `floor(e)`        | Returns largest element less than or equal to e        |
//		| `pollFirst()`     | Retrieves and removes first element                    |
//		| `pollLast()`      | Retrieves and removes last element                     |
//		| `headSet(e)`      | Returns elements less than e by default                |
//		| `tailSet(e)`      | Returns elements greater than or equal to e by default |
//		| `subSet(a,b)`     | Returns elements in the specified range                |
//		| `descendingSet()` | Returns a reverse-order view                           |
//		| `size()`          | Returns size                                           |
//		| `clear()`         | Removes all elements                                   |
//
//		### **Example**
//
//		```
//		import java.util.*;
//
//		public class TreeSetDemo {
//		    public static void main(String[] args) {
//
//		        TreeSet<Integer> set = new TreeSet<>();
//
//		        set.add(40);
//		        set.add(10);
//		        set.add(30);
//		        set.add(20);
//
//		        System.out.println(set);
//
//		        System.out.println(set.first());
//		        System.out.println(set.last());
//
//		        System.out.println(set.higher(20));
//		        System.out.println(set.lower(20));
//
//		        System.out.println(set.ceiling(25));
//		        System.out.println(set.floor(25));
//
//		        System.out.println(set.descendingSet());
//		    }
//		}
//		```
//
//		Output:
//
//		```
//		[10, 20, 30, 40]
//		10
//		40
//		30
//		10
//		30
//		20
//		[40, 30, 20, 10]
//		```
//
//		### **When do we use TreeSet?**
//
//		When we need unique elements in sorted order.
//
//		# **PART 4: QUEUE INTERFACE**
//
//		## **17. What is Queue?**
//
//		**Definition:** Queue is an interface used to store elements before processing them.
//
//		Generally, Queue follows FIFO.
//
//		FIFO means First In First Out.
//
//		The element inserted first will be removed first.
//
//		### **Real-time example**
//
//		Imagine people standing in a ticket booking queue.
//
//		- First person enters the queue.
//		- Second person enters.
//		- Third person enters.
//		- The first person gets the ticket first.
//
//		This is FIFO.
//
//		## **Queue – FIFO**
//
//		Front
//
//		10
//
//		20
//
//		30
//
//		Rear
//
//		10 is removed first. 30 is the last element inserted.
//
//		### **Characteristics**
//
//		1. Generally follows FIFO.
//		2. Allows duplicates.
//		3. Insertion and removal happen according to queue rules.
//		4. Does not provide index-based access.
//		5. Some implementations have special ordering rules, such as PriorityQueue.
//
//		### **Queue operations**
//
//		| Operation   | Explanation                                             |
//		| ----------- | ------------------------------------------------------- |
//		| `add()`     | Inserts an element; throws exception if insertion fails |
//		| `offer()`   | Inserts an element; returns false if insertion fails    |
//		| `remove()`  | Removes head; throws exception if empty                 |
//		| `poll()`    | Removes head; returns null if empty                     |
//		| `element()` | Retrieves head; throws exception if empty               |
//		| `peek()`    | Retrieves head; returns null if empty                   |
//
//		**Important interview difference:**
//
//		| Throws exception | Returns special value |
//		| ---------------- | --------------------- |
//		| add()            | offer()               |
//		| remove()         | poll()                |
//		| element()        | peek()                |
//
//		## **18. PriorityQueue**
//
//		**Definition:** PriorityQueue is an implementation of the Queue interface that processes elements based on priority instead of insertion order.
//
//		By default, the smallest element has the highest priority.
//
//		### **Characteristics**
//
//		1. Allows duplicate elements.
//		2. Does not allow null elements.
//		3. Does not guarantee insertion order.
//		4. Uses a heap internally.
//		5. By default, uses a min-heap.
//		6. Not synchronized.
//
//		### **Example**
//
//		```
//		import java.util.*;
//
//		public class PriorityQueueDemo {
//		    public static void main(String[] args) {
//
//		        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//		        pq.add(30);
//		        pq.add(10);
//		        pq.add(20);
//
//		        System.out.println(pq.peek());
//
//		        System.out.println(pq.poll());
//
//		        System.out.println(pq.poll());
//		    }
//		}
//		```
//
//		Output:
//
//		```
//		10
//		10
//		20
//		```
//
//		### **Operations**
//
//		- `add()` – Inserts an element.
//		- `offer()` – Inserts an element.
//		- `peek()` – Retrieves head without removing.
//		- `poll()` – Retrieves and removes head.
//		- `remove()` – Removes head.
//		- `element()` – Retrieves head.
//		- `contains()` – Checks element.
//		- `size()` – Returns size.
//		- `isEmpty()` – Checks whether empty.
//		- `clear()` – Removes all elements.
//		- `iterator()` – Traverses elements.
//
//		**Important:** Printing or iterating over a PriorityQueue does not necessarily display elements in sorted order. Repeatedly using `poll()` retrieves them in priority order.
//
//		### **When do we use PriorityQueue?**
//
//		- Task scheduling.
//		- Hospital emergency priority systems.
//		- Finding the smallest or largest elements.
//		- Dijkstra's shortest-path algorithm.
//
//		## **19. LinkedList as Queue**
//
//		LinkedList implements both List and Deque, so it can also be used as a Queue.
//
//		```
//		Queue<Integer> q = new LinkedList<>();
//
//		q.offer(10);
//		q.offer(20);
//		q.offer(30);
//
//		System.out.println(q);
//
//		System.out.println(q.peek());
//
//		System.out.println(q.poll());
//		```
//
//		Output:
//
//		```
//		[10, 20, 30]
//		10
//		10
//		```
//
//		Here, LinkedList follows FIFO when used through the Queue interface.
//
//		# **PART 5: DEQUE INTERFACE**
//
//		## **20. What is Deque?**
//
//		Deque stands for Double Ended Queue.
//
//		It allows insertion and deletion from both ends.
//
//		Unlike a normal FIFO queue, elements can be added and removed from either the front or the rear.
//
//		### **Example**
//
//		## **Double Ended Queue**
//
//		Front
//
//		10
//
//		20
//
//		30
//
//		Rear
//
//		Insert/remove hereInsert/remove here
//
//		### **Characteristics**
//
//		1. Allows insertion at both ends.
//		2. Allows deletion at both ends.
//		3. Allows duplicates.
//		4. Does not support null in ArrayDeque.
//		5. Can work as a Queue and Stack.
//
//		### **Deque operations**
//
//		| Operation       | Explanation                 |
//		| --------------- | --------------------------- |
//		| `addFirst()`    | Inserts at front            |
//		| `addLast()`     | Inserts at rear             |
//		| `offerFirst()`  | Offers at front             |
//		| `offerLast()`   | Offers at rear              |
//		| `removeFirst()` | Removes front               |
//		| `removeLast()`  | Removes rear                |
//		| `pollFirst()`   | Retrieves and removes front |
//		| `pollLast()`    | Retrieves and removes rear  |
//		| `getFirst()`    | Retrieves front             |
//		| `getLast()`     | Retrieves rear              |
//		| `peekFirst()`   | Views front                 |
//		| `peekLast()`    | Views rear                  |
//		| `push()`        | Pushes at front             |
//		| `pop()`         | Removes from front          |
//
//		## **21. ArrayDeque**
//
//		**Definition:** ArrayDeque is a resizable-array implementation of the Deque interface.
//
//		### **Characteristics**
//
//		1. Allows insertion and deletion from both ends.
//		2. Allows duplicate elements.
//		3. Does not allow null elements.
//		4. Not synchronized.
//		5. Can be used as a Stack or Queue.
//		6. Generally efficient for operations at both ends.
//
//		### **Example**
//
//		```
//		import java.util.*;
//
//		public class ArrayDequeDemo {
//		    public static void main(String[] args) {
//
//		        ArrayDeque<Integer> dq = new ArrayDeque<>();
//
//		        dq.addFirst(20);
//		        dq.addLast(30);
//		        dq.addFirst(10);
//
//		        System.out.println(dq);
//
//		        dq.removeFirst();
//		        dq.removeLast();
//
//		        System.out.println(dq);
//		    }
//		}
//		```
//
//		Output:
//
//		```
//		[10, 20, 30]
//		[20]
//		```
//
//		### **Operations**
//
//		add(), addFirst(), addLast(), offer(), offerFirst(), offerLast(), remove(), removeFirst(), removeLast(), poll(), pollFirst(), pollLast(), getFirst(), getLast(), peek(), peekFirst(), peekLast(), push(), pop(), contains(), size(), isEmpty(), clear().
//
//		### **When do we use ArrayDeque?**
//
//		When we need efficient insertion and deletion at both ends, or need Stack and Queue functionality.
//
//		# **PART 6: MAP INTERFACE**
//
//		## **22. What is Map?**
//
//		Very important for interviews
//
//		**Definition:** Map is an interface in Java that stores data in the form of key-value pairs.
//
//		Each key is unique, but values can be duplicated.
//
//		### **Real-time example**
//
//		Think about a student database.
//
//		| Roll number (Key) | Student name (Value) |
//		| ----------------- | -------------------- |
//		| 101               | Ravi                 |
//		| 102               | Ram                  |
//		| 103               | Ravi                 |
//		| 104               | John                 |
//
//		Here:
//
//		- Roll numbers are keys.
//		- Student names are values.
//		- Keys cannot be duplicated.
//		- Values can be duplicated.
//
//		### **Example**
//
//		```
//		Map<Integer, String> map = new HashMap<>();
//
//		map.put(101, "Ravi");
//		map.put(102, "Ram");
//		map.put(103, "John");
//
//		System.out.println(map);
//		```
//
//		### **Characteristics**
//
//		1. Stores data in key-value pairs.
//		2. Keys must be unique.
//		3. Values can be duplicated.
//		4. Each key maps to at most one value.
//		5. Does not extend the Collection interface.
//		6. Provides methods to insert, update, retrieve and delete key-value pairs.
//
//		### **Types of Map**
//
//		1. HashMap
//		2. LinkedHashMap
//		3. TreeMap
//		4. Hashtable
//
//		## **23. HashMap**
//
//		**Definition:** HashMap is an implementation of the Map interface that stores data in key-value pairs using hashing.
//
//		### **Characteristics**
//
//		1. Stores data in key-value pairs.
//		2. Does not maintain insertion order.
//		3. Allows one null key.
//		4. Allows multiple null values.
//		5. Does not allow duplicate keys.
//		6. Not synchronized.
//		7. Provides average constant-time performance for basic operations when hashing distributes keys properly.
//
//		### **Internal working of HashMap**
//
//		HashMap internally uses a hash table.
//
//		When we insert a key-value pair:
//
//		1. We provide a key and value.
//		2. HashMap calculates the hash code of the key.
//		3. It uses the hash to determine the bucket.
//		4. It stores the key-value entry in that bucket.
//		5. When retrieving, it uses the key's hash and equality comparison to find the corresponding value.
//
//		**Example:**
//
//		```
//		HashMap<Integer, String> map = new HashMap<>();
//
//		map.put(101, "Java");
//		map.put(102, "Python");
//		map.put(103, "SQL");
//		```
//
//		### **What happens if we insert a duplicate key?**
//
//		```
//		map.put(101, "Java");
//		map.put(101, "Spring");
//		```
//
//		The old value is replaced.
//
//		Output:
//
//		```
//		{101=Spring}
//		```
//
//		The key remains 101, but its value becomes Spring.
//
//		### **Constructors**
//
//		```
//		HashMap<Integer, String> map1 = new HashMap<>();
//		```
//
//		```
//		HashMap<Integer, String> map2 = new HashMap<>(20);
//		```
//
//		```
//		HashMap<Integer, String> map3 = new HashMap<>(20, 0.75f);
//		```
//
//		### **HashMap operations**
//
//		| Operation            | Explanation                                 |
//		| -------------------- | ------------------------------------------- |
//		| `put(k,v)`           | Adds a key-value pair                       |
//		| `putAll(m)`          | Copies another map                          |
//		| `get(k)`             | Retrieves value using key                   |
//		| `getOrDefault(k,v)`  | Returns value or default value              |
//		| `remove(k)`          | Removes an entry using key                  |
//		| `remove(k,v)`        | Removes only if key and value match         |
//		| `replace(k,v)`       | Replaces existing value                     |
//		| `replace(k,old,new)` | Replaces only if old value matches          |
//		| `replaceAll()`       | Replaces all values using a function        |
//		| `putIfAbsent()`      | Inserts only if key has no mapping          |
//		| `containsKey()`      | Checks whether key exists                   |
//		| `containsValue()`    | Checks whether value exists                 |
//		| `keySet()`           | Returns all keys                            |
//		| `values()`           | Returns all values                          |
//		| `entrySet()`         | Returns all key-value entries               |
//		| `compute()`          | Computes a new value for a key              |
//		| `computeIfAbsent()`  | Computes value if key is absent             |
//		| `computeIfPresent()` | Computes value if key is present            |
//		| `merge()`            | Combines a new value with an existing value |
//		| `size()`             | Returns number of entries                   |
//		| `isEmpty()`          | Checks whether map is empty                 |
//		| `clear()`            | Removes all entries                         |
//		| `forEach()`          | Performs an action for each entry           |
//
//		### **Example program**
//
//		```
//		import java.util.*;
//
//		public class HashMapDemo {
//		    public static void main(String[] args) {
//
//		        HashMap<Integer, String> map = new HashMap<>();
//
//		        // Adding
//		        map.put(101, "Java");
//		        map.put(102, "Python");
//		        map.put(103, "SQL");
//
//		        System.out.println(map);
//
//		        // Retrieving
//		        System.out.println(map.get(101));
//
//		        // Updating
//		        map.put(101, "Spring");
//
//		        // Checking
//		        System.out.println(map.containsKey(102));
//		        System.out.println(map.containsValue("SQL"));
//
//		        // Removing
//		        map.remove(103);
//
//		        // Getting keys
//		        System.out.println(map.keySet());
//
//		        // Getting values
//		        System.out.println(map.values());
//
//		        // Getting entries
//		        System.out.println(map.entrySet());
//
//		        // Size
//		        System.out.println(map.size());
//
//		        // Traversing
//		        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//		            System.out.println(
//		                entry.getKey() + " " + entry.getValue()
//		            );
//		        }
//		    }
//		}
//		```
//
//		### **Important: What is Map.Entry?**
//
//		Map.Entry represents one key-value pair inside a Map.
//
//		It provides:
//
//		- `getKey()` – Returns the key.
//		- `getValue()` – Returns the value.
//		- `setValue()` – Updates the value.
//
//		### **Advantages**
//
//		- Fast insertion and retrieval on average.
//		- Stores data using unique keys.
//		- Allows null keys and values.
//		- Useful for database-like lookups.
//
//		### **Disadvantages**
//
//		- Does not maintain insertion order.
//		- Not synchronized.
//		- Hash collisions can affect performance.
//
//		### **When do we use HashMap?**
//
//		When we want to retrieve values quickly using unique keys.
//
//		Examples:
//
//		- Employee ID and employee name.
//		- Product ID and product price.
//		- Username and user details.
//
//		## **24. LinkedHashMap**
//
//		**Definition:** LinkedHashMap is an implementation of Map that maintains insertion order by default.
//
//		It uses a combination of a hash table and a doubly linked list.
//
//		### **Characteristics**
//
//		1. Stores key-value pairs.
//		2. Does not allow duplicate keys.
//		3. Allows one null key.
//		4. Allows multiple null values.
//		5. Maintains insertion order by default.
//		6. Not synchronized.
//		7. Supports access-order mode through a special constructor.
//
//		### **Example**
//
//		```
//		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
//
//		map.put(103, "Java");
//		map.put(101, "Python");
//		map.put(102, "SQL");
//
//		System.out.println(map);
//		```
//
//		Output:
//
//		```
//		{103=Java, 101=Python, 102=SQL}
//		```
//
//		Notice that insertion order is maintained.
//
//		### **Operations**
//
//		- `put()` – Adds key-value pair.
//		- `putAll()` – Copies another map.
//		- `get()` – Retrieves value.
//		- `getOrDefault()` – Returns value or default.
//		- `remove()` – Removes entry.
//		- `replace()` – Updates value.
//		- `replaceAll()` – Updates all values.
//		- `putIfAbsent()` – Adds if key is absent.
//		- `containsKey()` – Checks key.
//		- `containsValue()` – Checks value.
//		- `keySet()` – Returns keys.
//		- `values()` – Returns values.
//		- `entrySet()` – Returns entries.
//		- `size()` – Returns size.
//		- `isEmpty()` – Checks empty.
//		- `clear()` – Removes all entries.
//
//		### **When do we use LinkedHashMap?**
//
//		When we need key-value storage and also want to maintain insertion order.
//
//		Examples:
//
//		- Maintaining user activity order.
//		- Maintaining configuration settings.
//		- Implementing insertion-ordered caches.
//
//		## **25. TreeMap**
//
//		**Definition:** TreeMap is an implementation of Map that stores key-value pairs in sorted order based on keys.
//
//		It uses a Red-Black Tree internally.
//
//		### **Characteristics**
//
//		1. Stores key-value pairs.
//		2. Does not allow duplicate keys.
//		3. Sorts keys in ascending order by default.
//		4. Does not allow null keys with natural ordering.
//		5. Allows null values.
//		6. Not synchronized.
//		7. Provides navigation methods for finding nearby keys.
//
//		### **Example**
//
//		```
//		TreeMap<Integer, String> map = new TreeMap<>();
//
//		map.put(103, "Java");
//		map.put(101, "Python");
//		map.put(102, "SQL");
//
//		System.out.println(map);
//		```
//
//		Output:
//
//		```
//		{101=Python, 102=SQL, 103=Java}
//		```
//
//		### **Important TreeMap operations**
//
//		| Operation          | Explanation                                     |
//		| ------------------ | ----------------------------------------------- |
//		| `put()`            | Adds key-value pair                             |
//		| `putAll()`         | Copies another map                              |
//		| `get()`            | Retrieves value                                 |
//		| `getOrDefault()`   | Returns value or default                        |
//		| `remove()`         | Removes entry                                   |
//		| `replace()`        | Replaces value                                  |
//		| `containsKey()`    | Checks key                                      |
//		| `containsValue()`  | Checks value                                    |
//		| `firstKey()`       | Returns smallest key                            |
//		| `lastKey()`        | Returns largest key                             |
//		| `higherKey(k)`     | Returns next greater key                        |
//		| `lowerKey(k)`      | Returns next smaller key                        |
//		| `ceilingKey(k)`    | Returns smallest key greater than or equal to k |
//		| `floorKey(k)`      | Returns largest key less than or equal to k     |
//		| `firstEntry()`     | Returns first key-value pair                    |
//		| `lastEntry()`      | Returns last key-value pair                     |
//		| `pollFirstEntry()` | Retrieves and removes first entry               |
//		| `pollLastEntry()`  | Retrieves and removes last entry                |
//		| `headMap()`        | Returns entries before a specified key          |
//		| `tailMap()`        | Returns entries from a specified key onward     |
//		| `subMap()`         | Returns entries within a key range              |
//		| `descendingMap()`  | Returns reverse-order view                      |
//		| `keySet()`         | Returns keys                                    |
//		| `values()`         | Returns values                                  |
//		| `entrySet()`       | Returns entries                                 |
//		| `size()`           | Returns number of entries                       |
//		| `clear()`          | Removes all entries                             |
//
//		### **Example**
//
//		```
//		import java.util.*;
//
//		public class TreeMapDemo {
//		    public static void main(String[] args) {
//
//		        TreeMap<Integer, String> map = new TreeMap<>();
//
//		        map.put(103, "Java");
//		        map.put(101, "Python");
//		        map.put(102, "SQL");
//
//		        System.out.println(map);
//
//		        System.out.println(map.firstKey());
//		        System.out.println(map.lastKey());
//
//		        System.out.println(map.higherKey(101));
//		        System.out.println(map.lowerKey(103));
//
//		        System.out.println(map.descendingMap());
//		    }
//		}
//		```
//
//		### **When do we use TreeMap?**
//
//		When we want to store key-value pairs in sorted key order.
//
//		## **26. Hashtable**
//
//		**Definition:** Hashtable is a legacy implementation of the Map interface that stores key-value pairs using hashing.
//
//		### **Characteristics**
//
//		1. Stores key-value pairs.
//		2. Does not allow duplicate keys.
//		3. Does not allow null keys.
//		4. Does not allow null values.
//		5. Does not maintain insertion order.
//		6. Synchronized.
//		7. Generally slower than HashMap in single-threaded situations because of synchronization.
//
//		### **Example**
//
//		```
//		import java.util.*;
//
//		public class HashtableDemo {
//		    public static void main(String[] args) {
//
//		        Hashtable<Integer, String> table = new Hashtable<>();
//
//		        table.put(101, "Java");
//		        table.put(102, "Python");
//		        table.put(103, "SQL");
//
//		        System.out.println(table);
//
//		        System.out.println(table.get(101));
//
//		        table.remove(102);
//
//		        System.out.println(table.containsKey(103));
//
//		        System.out.println(table.size());
//		    }
//		}
//		```
//
//		### **Operations**
//
//		- `put()` – Adds key-value pair.
//		- `putAll()` – Copies another map.
//		- `get()` – Retrieves value.
//		- `remove()` – Removes entry.
//		- `replace()` – Replaces value.
//		- `putIfAbsent()` – Adds if absent.
//		- `containsKey()` – Checks key.
//		- `containsValue()` – Checks value.
//		- `keys()` – Returns an Enumeration of keys.
//		- `elements()` – Returns an Enumeration of values.
//		- `keySet()` – Returns keys.
//		- `values()` – Returns values.
//		- `entrySet()` – Returns entries.
//		- `size()` – Returns number of entries.
//		- `isEmpty()` – Checks empty.
//		- `clear()` – Removes all entries.
//
//		### **When do we use Hashtable?**
//
//		Mostly in older Java applications. In modern applications, `ConcurrentHashMap` is generally preferred for concurrent access.
//
//		# **PART 7: COMMON COLLECTION OPERATIONS**
//
//		## **27. What is Iterator?**
//
//		Iterator is an interface used to traverse elements in a collection one by one.
//
//		It is useful when we want to read or remove elements while iterating.
//
//		### **Iterator operations**
//
//		| Operation   | Explanation                                 |
//		| ----------- | ------------------------------------------- |
//		| `hasNext()` | Checks whether another element exists       |
//		| `next()`    | Returns the next element                    |
//		| `remove()`  | Removes the last element returned by next() |
//
//		### **Example**
//
//		```
//		ArrayList<Integer> list = new ArrayList<>();
//
//		list.add(10);
//		list.add(20);
//		list.add(30);
//
//		Iterator<Integer> it = list.iterator();
//
//		while (it.hasNext()) {
//		    System.out.println(it.next());
//		}
//		```
//
//		Output:
//
//		```
//		10
//		20
//		30
//		```
//
//		## **28. What is ListIterator?**
//
//		ListIterator is used to traverse List elements in both forward and backward directions.
//
//		Unlike Iterator, it supports updating and inserting elements during traversal.
//
//		### **Operations**
//
//		- `hasNext()` – Checks next element.
//		- `next()` – Returns next element.
//		- `hasPrevious()` – Checks previous element.
//		- `previous()` – Returns previous element.
//		- `nextIndex()` – Returns next index.
//		- `previousIndex()` – Returns previous index.
//		- `remove()` – Removes current element.
//		- `set()` – Updates current element.
//		- `add()` – Inserts an element.
//
//		### **Example**
//
//		```
//		ArrayList<Integer> list = new ArrayList<>();
//
//		list.add(10);
//		list.add(20);
//		list.add(30);
//
//		ListIterator<Integer> it = list.listIterator();
//
//		while (it.hasNext()) {
//		    System.out.println(it.next());
//		}
//
//		while (it.hasPrevious()) {
//		    System.out.println(it.previous());
//		}
//		```
//
//		## **29. What is Collections Class?**
//
//		Do not confuse these two:
//
//		- `Collection` – An interface.
//		- `Collections` – A utility class.
//
//		Collections is a utility class that provides predefined static methods for manipulating collections.
//
//		### **Important Collections methods**
//
//		| Method                           | Purpose                                           |
//		| -------------------------------- | ------------------------------------------------- |
//		| `Collections.sort()`             | Sorts a list                                      |
//		| `Collections.reverse()`          | Reverses a list                                   |
//		| `Collections.shuffle()`          | Randomly rearranges elements                      |
//		| `Collections.max()`              | Returns maximum element                           |
//		| `Collections.min()`              | Returns minimum element                           |
//		| `Collections.frequency()`        | Counts occurrences                                |
//		| `Collections.swap()`             | Swaps two elements                                |
//		| `Collections.binarySearch()`     | Searches in a sorted list                         |
//		| `Collections.fill()`             | Replaces all list elements with a specified value |
//		| `Collections.copy()`             | Copies elements into a destination list           |
//		| `Collections.replaceAll()`       | Replaces all matching values                      |
//		| `Collections.rotate()`           | Rotates elements                                  |
//		| `Collections.unmodifiableList()` | Creates an unmodifiable list view                 |
//		| `Collections.synchronizedList()` | Creates a synchronized list wrapper               |
//
//		### **Example**
//
//		```
//		import java.util.*;
//
//		public class CollectionsDemo {
//		    public static void main(String[] args) {
//
//		        ArrayList<Integer> list = new ArrayList<>();
//
//		        list.add(30);
//		        list.add(10);
//		        list.add(20);
//		        list.add(10);
//
//		        Collections.sort(list);
//		        System.out.println(list);
//
//		        Collections.reverse(list);
//		        System.out.println(list);
//
//		        System.out.println(Collections.max(list));
//
//		        System.out.println(Collections.min(list));
//
//		        System.out.println(Collections.frequency(list, 10));
//		    }
//		}
//		```
//
//		# **PART 8: IMPORTANT DIFFERENCES**
//
//		These differences are frequently asked in Java interviews.
//
//		## **30. ArrayList vs LinkedList**
//
//		| ArrayList                                      | LinkedList                                                         |
//		| ---------------------------------------------- | ------------------------------------------------------------------ |
//		| Uses dynamic array                             | Uses doubly linked list                                            |
//		| Fast random access                             | Slower random access                                               |
//		| Insertion/deletion in middle requires shifting | Insertion/deletion after locating position involves changing links |
//		| Less memory overhead                           | More memory overhead                                               |
//		| Implements List                                | Implements List and Deque                                          |
//		| Best for frequent retrieval                    | Useful for frequent operations at ends                             |
//
//		## **31. ArrayList vs Vector**
//
//		| ArrayList                               | Vector                        |
//		| --------------------------------------- | ----------------------------- |
//		| Not synchronized                        | Synchronized                  |
//		| Faster generally in single-threaded use | Synchronization adds overhead |
//		| Grows automatically                     | Grows automatically           |
//		| Modern collection class                 | Legacy collection class       |
//		| Introduced in Java 1.2                  | Introduced in Java 1.0        |
//
//		## **32. HashSet vs LinkedHashSet vs TreeSet**
//
//		| HashSet                       | LinkedHashSet                 | TreeSet                                |
//		| ----------------------------- | ----------------------------- | -------------------------------------- |
//		| No guaranteed order           | Insertion order               | Sorted order                           |
//		| No duplicates                 | No duplicates                 | No duplicates                          |
//		| One null allowed              | One null allowed              | Null not allowed with natural ordering |
//		| Hash table                    | Hash table + linked list      | Red-Black Tree                         |
//		| Average O(1) basic operations | Average O(1) basic operations | O(log n) basic operations              |
//
//		## **33. HashMap vs LinkedHashMap vs TreeMap**
//
//		| HashMap                 | LinkedHashMap              | TreeMap                           |
//		| ----------------------- | -------------------------- | --------------------------------- |
//		| No guaranteed order     | Insertion order by default | Sorted key order                  |
//		| One null key            | One null key               | No null key with natural ordering |
//		| Multiple null values    | Multiple null values       | Multiple null values              |
//		| Hash table              | Hash table + linked list   | Red-Black Tree                    |
//		| Average O(1) operations | Average O(1) operations    | O(log n) operations               |
//
//		## **34. HashMap vs Hashtable**
//
//		| HashMap                                 | Hashtable                     |
//		| --------------------------------------- | ----------------------------- |
//		| Not synchronized                        | Synchronized                  |
//		| Allows one null key                     | Does not allow null key       |
//		| Allows null values                      | Does not allow null values    |
//		| Modern collection class                 | Legacy collection class       |
//		| Generally faster in single-threaded use | Synchronization adds overhead |
//
//		## **35. Queue vs Stack**
//
//		| Queue                          | Stack                    |
//		| ------------------------------ | ------------------------ |
//		| Generally follows FIFO         | Follows LIFO             |
//		| Insertion at rear              | Insertion at top         |
//		| Removal from front             | Removal from top         |
//		| add(), offer(), poll(), peek() | push(), pop(), peek()    |
//		| Example: Ticket booking        | Example: Stack of plates |
//
//		## **36. Collection vs Map**
//
//		| Collection                                    | Map                        |
//		| --------------------------------------------- | -------------------------- |
//		| Stores individual elements                    | Stores key-value pairs     |
//		| Allows duplicates depending on implementation | Keys must be unique        |
//		| List, Set, Queue                              | HashMap, TreeMap           |
//		| Extends Iterable                              | Does not extend Collection |
//		| Uses add()                                    | Uses put()                 |
//
//		# **PART 9: TIME COMPLEXITY**
//
//		Time complexity tells us how much time an operation takes as the number of elements increases.
//
//		| Collection    | Add                   | Search       | Remove            |
//		| ------------- | --------------------- | ------------ | ----------------- |
//		| ArrayList     | O(1) amortized at end | O(n)         | O(n)              |
//		| LinkedList    | O(1) at ends          | O(n)         | O(n) by value     |
//		| HashSet       | O(1) average          | O(1) average | O(1) average      |
//		| LinkedHashSet | O(1) average          | O(1) average | O(1) average      |
//		| TreeSet       | O(log n)              | O(log n)     | O(log n)          |
//		| PriorityQueue | O(log n)              | O(n)         | O(log n) for head |
//		| HashMap       | O(1) average          | O(1) average | O(1) average      |
//		| LinkedHashMap | O(1) average          | O(1) average | O(1) average      |
//		| TreeMap       | O(log n)              | O(log n)     | O(log n)          |
//
//		These are typical complexities, not guaranteed execution times. For example, HashMap performance depends on hash distribution.
//
//		# **PART 10: IMPORTANT INTERVIEW QUESTIONS**
//
//		Practise these questions after completing the concepts.
//
//		### **Basic questions**
//
//		1. What is Collection in Java?
//		2. What is the Collection Framework?
//		3. Why do we use Collections?
//		4. What is the difference between Collection and Collections?
//		5. What is the difference between an interface and a class?
//		6. Explain the Collection Framework hierarchy.
//		7. What is the difference between List, Set and Queue?
//		8. Why is Map not a child of Collection?
//		9. What is a generic in Java?
//		10. What is the difference between an Array and ArrayList?
//
//		### **List questions**
//
//		11. What is ArrayList?
//		12. How does ArrayList work internally?
//		13. What is the difference between ArrayList and LinkedList?
//		14. What is the difference between ArrayList and Vector?
//		15. Why is Vector synchronized?
//		16. What is Stack?
//		17. Explain LIFO with an example.
//		18. What is the difference between `add()` and `set()`?
//		19. What is the difference between `remove(1)` and `remove(Integer.valueOf(1))`?
//
//		### **Set questions**
//
//		20. What is Set?
//		21. Why does Set not allow duplicates?
//		22. What is HashSet?
//		23. How does HashSet work internally?
//		24. What is the difference between HashSet and LinkedHashSet?
//		25. What is the difference between LinkedHashSet and TreeSet?
//		26. What is hashing?
//		27. What is a hash collision?
//		28. What is the load factor?
//		29. What is the difference between Comparable and Comparator?
//
//		### **Queue questions**
//
//		30. What is Queue?
//		31. Explain FIFO.
//		32. What is PriorityQueue?
//		33. What is the difference between Queue and Deque?
//		34. What is the difference between `poll()` and `remove()`?
//		35. What is the difference between `peek()` and `element()`?
//		36. What is ArrayDeque?
//		37. Can we use ArrayDeque as a Stack?
//
//		### **Map questions**
//
//		38. What is Map?
//		39. How does HashMap work internally?
//		40. What happens if we insert duplicate keys?
//		41. What is the difference between HashMap and Hashtable?
//		42. What is the difference between HashMap and LinkedHashMap?
//		43. What is the difference between HashMap and TreeMap?
//		44. What is Map.Entry?
//		45. What is the difference between `keySet()`, `values()` and `entrySet()`?
//		46. Can HashMap store null keys?
//		47. What is ConcurrentHashMap?
//
//		### **Advanced questions**
//
//		48. What is Iterator?
//		49. What is ListIterator?
//		50. What is the difference between Iterator and ListIterator?
//		51. What is fail-fast behaviour?
//		52. What is ConcurrentModificationException?
//		53. What is synchronization?
//		54. What is Comparable?
//		55. What is Comparator?
//		56. What is the difference between Collection and Stream?
//		57. What are the Java 8 collection methods?
//		58. What is the difference between `forEach()` and `iterator()`?
//
//		# **PART 11: QUICK REVISION SHEET**
//
//		Keep this table for your daily revision.
//
//		| Interface | Implementation classes                     |
//		| --------- | ------------------------------------------ |
//		| List      | ArrayList, LinkedList, Vector, Stack       |
//		| Set       | HashSet, LinkedHashSet, TreeSet            |
//		| Queue     | PriorityQueue, LinkedList                  |
//		| Deque     | ArrayDeque, LinkedList                     |
//		| Map       | HashMap, LinkedHashMap, TreeMap, Hashtable |
//
//		## **Which collection should you use?**
//
//		## **Choose the right collection**
//
//		1. **Need duplicates and insertion order?**
//
//		   Use ArrayList.
//		2. **Need frequent operations at both ends?**
//
//		   Use LinkedList or ArrayDeque.
//		3. **Need unique elements without order?**
//
//		   Use HashSet.
//		4. **Need unique elements with insertion order?**
//
//		   Use LinkedHashSet.
//		5. **Need unique elements in sorted order?**
//
//		   Use TreeSet.
//		6. **Need key-value pairs with no ordering requirement?**
//
//		   Use HashMap.
//		7. **Need key-value pairs with insertion order?**
//
//		   Use LinkedHashMap.
//		8. **Need key-value pairs with sorted keys?**
//
//		   Use TreeMap.
//		9. **Need elements based on priority?**
//
//		   Use PriorityQueue.
//		10. **Need LIFO operations?**
//
//		    Use ArrayDeque as a stack.
//
//		## **Official Java references**
//
//		You can refer to these for method definitions and additional examples:
//
//		- [Oracle – Collections Framework Overview](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/doc-files/coll-overview.html?utm_source=chatgpt.com)
//		- [Oracle – Complete Collections Framework Hierarchy](https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/doc-files/coll-reference.html?utm_source=chatgpt.com)
//		- [Oracle – Collection Implementations](https://docs.oracle.com/javase/tutorial/collections/implementations/?utm_source=chatgpt.com)
//
//		## **My recommendation for your Java interview preparation**
//
//		Don't try to memorize all the methods in one day. Understand the purpose of each collection, why it is used, how it works internally and then practise the operations.
//
//		I recommend studying in this order:
//
//		1. Collection Framework and hierarchy.
//		2. List – ArrayList, LinkedList, Vector and Stack.
//		3. Set – HashSet, LinkedHashSet and TreeSet.
//		4. Queue and Deque.
//		5. Map – HashMap, LinkedHashMap, TreeMap and Hashtable.
//		6. Iterator, ListIterator and Collections utility class.
//		7. Internal working and time complexity.
//
//		**One important thing:** For every collection, practise at least three programs: adding and retrieving elements, updating and deleting elements, and traversing and sorting elements.
//
//		This will help you prepare for both theoretical and practical Java interviews.
//		
		
//		## **8. Important Differences for Interviews**
//
//		| Collection    | Duplicates  | Order                      |
//		| ------------- | ----------- | -------------------------- |
//		| ArrayList     | Allowed     | Insertion order            |
//		| LinkedList    | Allowed     | Insertion order            |
//		| Vector        | Allowed     | Insertion order            |
//		| Stack         | Allowed     | LIFO                       |
//		| HashSet       | Not allowed | No guaranteed order        |
//		| LinkedHashSet | Not allowed | Insertion order            |
//		| TreeSet       | Not allowed | Sorted order               |
//		| PriorityQueue | Allowed     | Priority order             |
//		| ArrayDeque    | Allowed     | Deque order                |
//		| HashMap       | Unique keys | No guaranteed order        |
//		| LinkedHashMap | Unique keys | Insertion order by default |
//		| TreeMap       | Unique keys | Sorted key order           |
//		| Hashtable     | Unique keys | No guaranteed order        |
//
//		## **9. Important Concepts to Remember**
//
//		| Concept         | Meaning                                             |
//		| --------------- | --------------------------------------------------- |
//		| Insertion Order | Elements are stored in the order they are inserted  |
//		| Duplicates      | Repeated elements                                   |
//		| FIFO            | First In First Out                                  |
//		| LIFO            | Last In First Out                                   |
//		| Dynamic Size    | Size can increase or decrease                       |
//		| Synchronized    | Supports thread-safe access through synchronization |
//		| Key-Value Pair  | Data stored using a key and its corresponding value |
//		| Sorting         | Arranging elements in ascending or descending order |

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
//
//### **2. LinkedList**
//
//- add()
//- addFirst()
//- addLast()
//- get()
//- getFirst()
//- getLast()
//- set()
//- remove()
//- removeFirst()
//- removeLast()
//- removeFirstOccurrence()
//- removeLastOccurrence()
//- contains()
//- size()
//- isEmpty()
//- clear()
//- peek()
//- poll()
//- offer()
//
//### **3. Vector**
//
//- add()
//- addElement()
//- addAll()
//- get()
//- elementAt()
//- firstElement()
//- lastElement()
//- set()
//- setElementAt()
//- remove()
//- removeElement()
//- removeElementAt()
//- removeAll()
//- contains()
//- size()
//- capacity()
//- isEmpty()
//- clear()
//- elements()
//
//### **4. Stack**
//
//- push()
//- pop()
//- peek()
//- empty()
//- search()
//
//### **5. HashSet**
//
//- add()
//- addAll()
//- remove()
//- removeAll()
//- retainAll()
//- contains()
//- containsAll()
//- size()
//- isEmpty()
//- clear()
//- iterator()
//- toArray()
//
//### **6. LinkedHashSet**
//
//- add()
//- addAll()
//- remove()
//- removeAll()
//- retainAll()
//- contains()
//- containsAll()
//- size()
//- isEmpty()
//- clear()
//- iterator()
//- toArray()
//
//### **7. TreeSet**
//
//- add()
//- addAll()
//- remove()
//- removeAll()
//- retainAll()
//- contains()
//- containsAll()
//- first()
//- last()
//- higher()
//- lower()
//- ceiling()
//- floor()
//- pollFirst()
//- pollLast()
//- headSet()
//- tailSet()
//- subSet()
//- descendingSet()
//- size()
//- isEmpty()
//- clear()
//
//### **8. PriorityQueue**
//
//- add()
//- offer()
//- peek()
//- element()
//- poll()
//- remove()
//- contains()
//- size()
//- isEmpty()
//- clear()
//- iterator()
//- toArray()
//
//### **9. ArrayDeque**
//
//- add()
//- addFirst()
//- addLast()
//- offer()
//- offerFirst()
//- offerLast()
//- remove()
//- removeFirst()
//- removeLast()
//- poll()
//- pollFirst()
//- pollLast()
//- getFirst()
//- getLast()
//- peek()
//- peekFirst()
//- peekLast()
//- push()
//- pop()
//- contains()
//- size()
//- isEmpty()
//- clear()
//
//### **10. HashMap**
//
//- put()
//- putAll()
//- get()
//- getOrDefault()
//- remove()
//- replace()
//- replaceAll()
//- putIfAbsent()
//- containsKey()
//- containsValue()
//- keySet()
//- values()
//- entrySet()
//- size()
//- isEmpty()
//- clear()
//- compute()
//- computeIfAbsent()
//- computeIfPresent()
//- merge()
//
//### **11. LinkedHashMap**
//
//- put()
//- putAll()
//- get()
//- getOrDefault()
//- remove()
//- replace()
//- replaceAll()
//- putIfAbsent()
//- containsKey()
//- containsValue()
//- keySet()
//- values()
//- entrySet()
//- size()
//- isEmpty()
//- clear()
//
//### **12. TreeMap**
//
//- put()
//- putAll()
//- get()
//- getOrDefault()
//- remove()
//- replace()
//- containsKey()
//- containsValue()
//- firstKey()
//- lastKey()
//- higherKey()
//- lowerKey()
//- ceilingKey()
//- floorKey()
//- pollFirstEntry()
//- pollLastEntry()
//- firstEntry()
//- lastEntry()
//- headMap()
//- tailMap()
//- subMap()
//- descendingMap()
//- keySet()
//- values()
//- entrySet()
//- size()
//- isEmpty()
//- clear()
//
//### **13. Hashtable**
//
//- put()
//- putAll()
//- get()
//- remove()
//- replace()
//- putIfAbsent()
//- containsKey()
//- containsValue()
//- keys()
//- elements()
//- keySet()
//- values()
//- entrySet()
//- size()
//- isEmpty()
//- clear()

		
		
		
	}

}
