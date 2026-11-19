package synchronization;

class Statement{
	 void statement() {
		try {
			System.out.println(Thread.currentThread().getName()+" "+"is executing Statement1");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" "+"is executing Statement2");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" "+"is executing Statement3");
			Thread.sleep(2000);
		
		synchronized(this){
			System.out.println(Thread.currentThread().getName()+" "+"is executing Statement4");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" "+"is executing Statement5");
			Thread.sleep(2000);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class boys extends Thread{
	Statement ba;
	boys(Statement ba){
		this.ba = ba;
	}
	@Override
	public void run() {
		ba.statement();
	}
}

class girls extends Thread{
	Statement ba;
	girls(Statement ba){
		this.ba = ba;
	}
	@Override
	public void run() {
		ba.statement();
	}
}

class other extends Thread{
	Statement ba;
	other(Statement ba){
		this.ba = ba;
	}
	@Override
	public void run() {
		ba.statement();
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		
		Statement b = new Statement();
	boys boy = new boys(b);
	girls girl = new girls(b);
	other others = new other(b);
	
	boy.setName("Boy");
	girl.setName("Girl");
	others.setName("Others");
	
	boy.start();
	girl.start();
	others.start();
	}

}

