package collections;
import java.util.TreeSet;
public class Treeset {
	//TreeSet print in ascending order and won't print duplicates
	// add,remove,clear,first,size,isEmpty,contains
//	### **TreeSet**
//
//	- Does not allow duplicates.
//	- Stores elements in sorted order.
//	- Does not allow null elements.
//	- Uses a Red-Black Tree internally.
//
//	**Operations:**

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
	public static void main(String[] args) {
		TreeSet<Integer> data= new TreeSet<>();
		data.add(9);
		data.add(7);
		data.add(10);
		data.add(1);
		System.out.println(data);
		
		TreeSet<String> datas= new TreeSet<>();
		datas.add("Bhargavi");
		datas.add("Pranavi Sai");
		datas.add("Vamsi");
		datas.add("Bhargavi");
		for(String i:datas) {
		System.out.println(i);
		}
	}

}
