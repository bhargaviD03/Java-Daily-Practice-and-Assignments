package javaAssignment;


class order extends Thread{
	
	public void run() {
	System.out.println("order processing is started");
	try {
	System.out.println("Order is processing....");
	Thread.sleep(2000);
	System.out.println("order processing is resume");
	}catch(InterruptedException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("Order is completed");
	
}

}
public class ThreadLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		order o = new order();
		System.out.println("Thread State:"+o.getState());
		o.start();
		System.out.println("Thread State:"+o.getState());
		o.join();
		System.out.println("Thread State:"+o.getState());
		
	}

}
