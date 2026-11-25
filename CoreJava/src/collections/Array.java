package collections;

import java.util.ArrayList;

public class Array {
	//ArrayList allow duplicates,insert,index,order
	// ArrayList<> is a wrapper class
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
//			arr.clear();
			System.out.println(arr);
			System.out.println(arr.clone());
			System.out.println(arr.indexOf("Loops"));
	}

}
