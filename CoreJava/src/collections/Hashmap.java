package collections;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new  HashMap<>();
		hashMap.put(1,"Bhargavi");
		hashMap.put(2,"Pranavi");
		hashMap.put(3,"Chintu");
		hashMap.put(2,"Pranavi Sai");
		System.out.println(hashMap);
		System.out.println(hashMap.remove(2,"Pranavi"));
		System.out.println(hashMap.replace(3,"Vamsi"));
		System.out.println(hashMap.containsKey(2));
		System.out.println(hashMap.containsValue("Pranavi Sai"));
		System.out.println(hashMap);

	}

}
