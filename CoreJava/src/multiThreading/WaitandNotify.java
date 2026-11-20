package multiThreading;

public class WaitandNotify extends Syn_thread1{

synchronized void  food() {
	for(int i=0;i<10;i++) {
		
	try {
		
		System.err.println("food"+i);
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	
}
	try {
		wait();
		System.err.println("thread completed1");
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
}

synchronized void location() {
	for(int i=0;i<5;i++) {
		
		try {
			System.out.println("location:"+"chennai"+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	try {
		wait();
		System.out.println("thread 2 completed");
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}


synchronized void delivered() {
	for(int i=0; i<12;i++) {
		
		try {
			System.out.println("food delived"+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	try {
		wait();
		System.out.println("thread 3 completed");
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
}

public void  booking() {
	for(int i=0;i<20; i++) {	
		try {
			System.out.println("booking:"+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
}


synchronized void realize1() {
//	notify();// it will release first thread only
	notifyAll();// it will release all thread
	System.out.println("------------");
}


public static void main(String[] args) {
	WaitandNotify syn_Thread= new WaitandNotify();
//	Syn_thread1 syn_thread1=new Syn_thread1();
	
	Thread t1= new Thread(()->{
		syn_Thread.food();
	});
	
	Thread t2= new Thread(()->{
		syn_Thread.location();
	});
	
	Thread t3= new Thread(()->{
		syn_Thread.delivered();
	});
	Thread t4= new Thread(()->{
		syn_Thread.parentthread();
	});
	Thread unlockfirst= new Thread(()->{
		syn_Thread.realize1();
	});
	t1.start();
	t2.start();
	t3.start();
	
	t4.start();
	unlockfirst.start();
	syn_Thread.booking();
	
}
}	
		


