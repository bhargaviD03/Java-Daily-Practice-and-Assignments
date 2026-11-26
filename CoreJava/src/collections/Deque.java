package collections;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Deque {

	public static void main(String[] args) {
		BlockingDeque<Integer> data = new LinkedBlockingDeque<>(2);
		System.out.println(data);
		System.out.println(data.add(1));
		System.out.println(data.add(2));
		System.out.println(data.offer(3));
		System.out.println(data.offer(4));
		System.out.println(data.offer(5));
		

	}

}
