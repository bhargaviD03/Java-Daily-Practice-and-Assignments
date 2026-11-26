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

public class onlineShoppingOrderManagement {

		public static void main(String[] args) {
			ArrayList<String> customer = new ArrayList<>();
			 customer .add("Bhargavi");
			 customer .add("Pranavi");
			 customer .add("Akash");
			 customer .add("Vamsi");
			 customer .add("Nani");
			for(int i=0;i< customer .size();i++) {
				System.out.println( customer .get(i));
			}
			
			HashMap<Integer,String>  customerDetails = new  HashMap<>();
			customerDetails.put(1010,"Bhargavi");
			customerDetails.put(1020,"Pranavi");
			customerDetails.put(1030,"Vamsi");
			customerDetails.put(1040,"Akash");
			customerDetails.put(1050,"Nani");
			System.out.println(customerDetails);
			for(int i=0;i<customerDetails.size();i++) {
				System.out.println(customerDetails.get(i));
			}
			
			BlockingDeque<Integer> data = new LinkedBlockingDeque<>(3);
			System.out.println(data);
			System.out.println(data.add(1));
			System.out.println(data.add(2));
			System.out.println(data.offer(3));
			System.out.println(data.offer(4));
			System.out.println(data.offer(5));
			
			
			PriorityQueue<Integer> queue = new PriorityQueue<>();
			queue.add(2);
			queue.add(5);
			queue.add(1);
			queue.add(4);
			queue.add(3);
			System.out.println(queue);

			HashSet<String> customerId = new  HashSet<>();
			customerId.add("AJIO7211");
			customerId.add("AJIO7212");
			customerId.add("AJIO7213" );
			customerId.add("AJIO7214");
			customerId.add("AJIO7215");
			customerId.add("AJIO7216");	
			System.out.println(customerId);
			for (String i:customerId) {
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
			System.out.println(LIFO.remove(2));
			System.out.println(LIFO);
			
			TreeSet<Integer> productID= new TreeSet<>();
			productID.add(5);
			productID.add(1);
			productID.add(4);
			productID.add(3);
			productID.add(2);
			System.out.println(productID);
			
			
			TreeMap<Integer,String> asPerOrderId = new TreeMap<>();
			asPerOrderId.put(1,"Bhargavi");
			asPerOrderId.put(2,"Pranavi");
			asPerOrderId.put(4,"Akash");
			asPerOrderId.put(3,"Vamsi");
			asPerOrderId.put(5,"Nani");
				System.out.println(asPerOrderId);


		}

}
