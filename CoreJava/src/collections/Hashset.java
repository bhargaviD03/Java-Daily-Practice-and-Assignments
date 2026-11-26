package collections;
import java.util.HashSet;

public class Hashset {
	//HashSet do not allow duplicates,order
		// HashSet<> is a wrapper class
	
//	### **HashSet**
//
//	- Does not allow duplicates.
//	- Does not maintain insertion order.
//	- Allows one null value.
//	- Uses hashing internally.
//
//	**Operations:**
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
	public static void main(String[] args) {
	HashSet<String> hashset = new  HashSet<>();
	hashset.add("Bhargavi");
	hashset.add("Pranavi");
	hashset.add("Chintu");
	hashset.add("Pranavi");
	System.out.println(hashset);
	for (String i:hashset) {
		System.out.println(i);
	}
	}

}
