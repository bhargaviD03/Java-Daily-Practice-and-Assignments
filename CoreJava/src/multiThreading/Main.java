package multiThreading;

public class Main {

	public static void main(String[] args) {
		Multithread m =new Multithread();
		m.start();
		m.loop();
		System.out.println("This is the end");
		System.out.println("--------------------------------------------");
		Anotherclass another = new Anotherclass();
		Thread thread = new Thread(another);
		thread.start();
		another.loop3();
		another.loop2();
		
	}

}
