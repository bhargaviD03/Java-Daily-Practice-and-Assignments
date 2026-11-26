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

public class HospitalPatientManagement {

	public static void main(String[] args) {
		ArrayList<String> patient = new ArrayList<>();
		patient.add("Bhargavi");
		patient.add("Pranavi");
		patient.add("Radha");
		patient.add("Chintu");
		patient.add("DR");
		for(int i=0;i<patient.size();i++) {
			System.out.println(patient.get(i));
		}
		
		HashMap<Integer,String> PatientDetails = new  HashMap<>();
		PatientDetails.put(1,"Bhargavi");
		PatientDetails.put(2,"Pranavi");
		PatientDetails.put(4,"Chintu");
		PatientDetails.put(3,"Radha");
		PatientDetails.put(5,"DR");
		System.out.println(PatientDetails);
		for(int i=0;i<PatientDetails.size();i++) {
			System.out.println(PatientDetails.get(i));
		}
		
		BlockingDeque<Integer> data = new LinkedBlockingDeque<>(5);
		System.out.println(data);
		System.out.println(data.add(1));
		System.out.println(data.add(2));
		System.out.println(data.add(3));
		System.out.println(data.add(4));
		System.out.println(data.add(5));
		
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(5);
		queue.add(3);
		queue.add(1);
		queue.add(4);
		queue.add(2);
		System.out.println(queue);

		HashSet<Long> Contact = new  HashSet<>();
		Contact .add(9675864758L);
		Contact .add(9675894758L);
		Contact .add( 9675854758L);
		Contact .add(9675874758L);
		Contact .add( 9675824758L);
		Contact .add( 9675864758L);	
		System.out.println(Contact);
		for (Long i:Contact) {
			System.out.println(i);
		}
		
		Stack<String> LIFO= new Stack<>();
		LIFO.add("Bhargavi");
		LIFO.add("Pranavi");
		LIFO.add("Radha");
		LIFO.add("Chintu");
		LIFO.add("DR");
		System.out.println(LIFO);
		System.out.println(LIFO.remove(4));
		System.out.println(LIFO);
		
		TreeSet<Integer> order= new TreeSet<>();
		order.add(5);
		order.add(3);
		order.add(1);
		order.add(4);
		order.add(2);
		System.out.println(order);
		
		
		TreeMap<Integer,String> orderAsperId = new TreeMap<>();
		orderAsperId.put(1,"Bhargavi");
		orderAsperId.put(2,"Pranavi");
		orderAsperId.put(4,"Chintu");
		orderAsperId.put(3,"Radha");
		orderAsperId.put(5,"DR");
			System.out.println(orderAsperId);

	

	}

}
