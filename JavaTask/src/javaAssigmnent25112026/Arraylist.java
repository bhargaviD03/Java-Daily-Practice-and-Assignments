package javaAssigmnent25112026;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> studentName = new ArrayList<>();
		studentName.add("Bhargavi");
		studentName.add("Pranavi");
		studentName.add("Radha");
		studentName.add("Chintu");
		studentName.add("DR");
		for(int i=0;i<studentName.size();i++) {
			System.out.println(studentName.get(i));
		}
	}

}
