package multiThreading;

public class Parent {
	public void loop2() {
		for(int i =1;i<=15;i++) {
			
			try {
				System.out.println("loop:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
}
}
