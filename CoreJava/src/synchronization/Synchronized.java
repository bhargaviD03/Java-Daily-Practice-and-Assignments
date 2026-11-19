package synchronization;

class Bathroom{
	synchronized void bathroom() {
		try {
			System.out.println(Thread.currentThread().getName()+" "+"entered washroom");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" "+"using washroom");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" "+"came out of washroom");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Boy extends Thread{
	Bathroom ba;
	Boy(Bathroom ba){
		this.ba = ba;
	}
	@Override
	public void run() {
		ba.bathroom();
	}
}

class Girl extends Thread{
	Bathroom ba;
	Girl(Bathroom ba){
		this.ba = ba;
	}
	@Override
	public void run() {
		ba.bathroom();
	}
}

class Others extends Thread{
	Bathroom ba;
	Others(Bathroom ba){
		this.ba = ba;
	}
	@Override
	public void run() {
		ba.bathroom();
	}
}
public class Synchronized {
	public static void main(String[] args) {
		
	Bathroom b = new Bathroom();
	Boy boy = new Boy(b);
	Girl girl = new Girl(b);
	Others others = new Others(b);
	
	boy.setName("Boy");
	girl.setName("Girl");
	others.setName("Others");
	
	boy.start();
	girl.start();
	others.start();
	}

}
