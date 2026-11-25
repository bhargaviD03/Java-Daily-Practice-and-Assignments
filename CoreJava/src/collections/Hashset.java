package collections;
import java.util.HashSet;

public class Hashset {
	//HashSet do not allow duplicates,order
		// HashSet<> is a wrapper class
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
