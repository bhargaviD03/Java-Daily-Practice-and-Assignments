package javaAssigmnent25112026;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet<>();
		hash.add(10);
		hash.add(20);
		hash.add(30);
		hash.add(40);
		hash.add(40);
		hash.add(50);
		hash.add(60);
		hash.add(70);
		hash.add(80);
		hash.add(90);
		hash.add(10);
		hash.add(100);
		for(int i:hash) {
			System.out.println(i);
		}
	}

}
