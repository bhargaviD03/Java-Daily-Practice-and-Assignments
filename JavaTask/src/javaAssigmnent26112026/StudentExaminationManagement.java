package javaAssigmnent26112026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class StudentExaminationManagement {

	public static void main(String[] args) {
		ArrayList<String> student = new ArrayList<>();
		student.add("Bhargavi");
		student.add("Pranavi");
		student.add("Akash");
		student.add("Vamsi");
		student.add("Nani");
		for(int i=0;i<student.size();i++) {
			System.out.println(student.get(i));
		}
		
		HashMap<Integer,String> studentDetails = new  HashMap<>();
		studentDetails.put(101,"Bhargavi");
		studentDetails.put(102,"Pranavi");
		studentDetails.put(103,"Vamsi");
		studentDetails.put(104,"Akash");
		studentDetails.put(105,"Nani");
		System.out.println(studentDetails);
		for(int i=0;i<studentDetails.size();i++) {
			System.out.println(studentDetails.get(i));
		}
		
		BlockingDeque<Integer> data = new LinkedBlockingDeque<>(5);
		System.out.println(data);
		System.out.println(data.add(1));
		System.out.println(data.add(2));
		System.out.println(data.add(3));
		System.out.println(data.add(4));
		System.out.println(data.add(5));
		
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(4);
		queue.add(3);
		queue.add(5);
		queue.add(2);
		queue.add(1);
		System.out.println(queue);

		HashSet<String> Email = new  HashSet<>();
		Email.add("bhargavi03@gmail.com");
		Email.add("pranavi04@gmail.com");
		Email.add( "akash04@gmail.com");
		Email.add("vamsi07@gmail.com");
		Email.add( "bhargavi03@gmail.com");
		Email.add( "nani07@gmail.com");	
		System.out.println(Email);
		for (String i:Email) {
			System.out.println(i);
		}
		
		Stack<String> LIFO= new Stack<>();
		LIFO.add("Bhargavi");
		LIFO.add("Pranavi");
		LIFO.add("Akash");
		LIFO.add("Vamsi");
		LIFO.add("Nani");
		System.out.println(LIFO);
		System.out.println(LIFO.remove(3));
		System.out.println(LIFO);
		
		TreeSet<Integer> RollNo= new TreeSet<>();
		RollNo.add(5);
		RollNo.add(1);
		RollNo.add(4);
		RollNo.add(3);
		RollNo.add(2);
		System.out.println(RollNo);
		
		
		TreeMap<Integer,String> studentAsperRollNo = new TreeMap<>();
		studentAsperRollNo.put(1,"Bhargavi");
		studentAsperRollNo.put(2,"Pranavi");
		studentAsperRollNo.put(4,"Akash");
		studentAsperRollNo.put(3,"Vamsi");
		studentAsperRollNo.put(5,"Nani");
			System.out.println(studentAsperRollNo);

	
	}

}
