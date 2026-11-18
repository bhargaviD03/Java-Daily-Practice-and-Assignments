package multiThreading;


public class Multithread extends Thread {
	
	public void loop () {
		for(int i =1;i<=10;i++) {
			
			try {
				System.out.println("loop:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
}
	//from return method we use only run method
	
	public void run () {
		for(int i =1;i<=50;i++) {
			try {
				if(i%5==0) {
				System.out.println("Mul of 5:"+i);
				Thread.sleep(1000);
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			}
		}
	

}
