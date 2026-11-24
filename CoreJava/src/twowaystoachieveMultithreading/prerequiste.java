package twowaystoachieveMultithreading;

public class prerequiste {

	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		t.setName("add");
		t.join();
		t.isAlive();
		t.setPriority(6);
		t.getPriority();
		}

}
