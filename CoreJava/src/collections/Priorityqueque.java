package collections;

import java.util.PriorityQueue;

public class Priorityqueque {
	// follows min heap method
//	  	 -3                   	-5				    -7
//  -5  	  -7  ==>      -3      -7   ==>    -3       -5
//0    5				0     5              0     5
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
			queue.add(-3);
			queue.add(-5);
			queue.add(-7);
			queue.add(0);
			queue.add(5);
			System.out.println(queue);
	}

}
