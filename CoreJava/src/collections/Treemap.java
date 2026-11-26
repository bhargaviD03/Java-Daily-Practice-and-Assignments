package collections;

import java.util.TreeMap;

public class Treemap {
//	### **TreeMap**
//
//	- Stores data in key-value pairs.
//	- Sorts keys in ascending order by default.
//	- Does not allow null keys.
//	- Allows null values.
//	- Uses a Red-Black Tree internally.
//
//	**Operations:**

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
	public static void main(String[] args) {
		TreeMap<Integer,String> appointment = new TreeMap<>();
		appointment.put(1, "Bhargavi");
		appointment.put(4, "PranaviSai");
		appointment.put(3, "Chintu");
		appointment.put(2, "Vamsi");
		appointment.replace(2, "Vamsi","Sai vamsi");
			System.out.println(appointment);

	}

}
