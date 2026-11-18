package multiThreading;

public class Anotherclass extends Parent implements Runnable {
	@Override
	public void run () {
		for(int i =1;i<=50;i++) {
			
			try {
				if(i%10==0) {
				System.out.println("Runnable:"+i);
				Thread.sleep(1000);
			}
			} 
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
}
	

	public void loop3() {
		for(int i =1;i<=15;i++) {
				System.out.println("loop:"+i);
		}
}
}
