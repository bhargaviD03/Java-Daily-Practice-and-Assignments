package collections1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {
	public Arraylist(int initialCapacity) {
		
	}
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add(50);
		arr.add(null);
		arr.add("hello");
		
		ArrayList arr1 = new ArrayList();
		//properties
		arr1.add("hi guys");
		arr1.add(20);
		arr1.add(10);
		arr1.add(2,39);
		arr1.add(null);
		arr1.addAll(arr);
		arr.addAll(0, arr1);
		arr1.retainAll(arr);
		arr1.set(0,"hi guys");
		arr1.get(2);
		arr1.size();
		arr1.trimToSize();
		arr1.remove(0);
		arr1.removeAll(arr);
		System.out.println(arr);
		System.out.println(arr1);
		
		// four ways to access the elements
		for(int i=0;i<=arr.size();i++) {
			System.out.println(i);
		}
		for(int i:arr1) {
			System.out.println(i);
		}
		
		Iterator cursor = arr.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		
		ListIterator Cursor = arr1.listIterator(arr1.size());
		while(Cursor.hasPrevious()) {
			System.out.println(Cursor.previous());
		}
	}

}
