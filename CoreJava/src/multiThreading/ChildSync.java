package multiThreading;

public class ChildSync extends ParentSync{
	
	synchronized void loop() {
		for (int i=0;i<=5;i++) {
			
			try {
				System.out.println("Loop:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			wait();
			System.err.println("Thread Stopped loop");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	synchronized void loop1() {
		for (int i=6;i<=10;i++) {
			
			try {
				System.out.println("Loop1:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			wait();
			System.err.println("Thread completed loop1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void loop2() {
		for (int i=11;i<=15;i++) {
			
			try {
				System.out.println("Loop2:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			wait();
			System.err.println("Thread completed loop2");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	synchronized void Notify() {
		notify();
		System.out.println("----------------------");
	}
	
	synchronized void NotifyAll() {
		System.out.println("----------------------");
		notifyAll();
		
	}
	public static void main(String[] args) {
		ChildSync sync = new ChildSync();
		
		Thread m1=new Thread(()->{
			sync .loop();
		});
		Thread m2=new Thread(()->{
			sync .loop1();
		});
		Thread m3=new Thread(()->{
			sync .loop2();
		});
		
		Thread notify=new Thread(()->{
			sync .Notify();
		});
		
		
		Thread notifyall=new Thread(()->{
			sync .NotifyAll();
		});
		m1.start();
		m2.start();
		m3.start();
		notify.start();
		notifyall.start();
	}

}
