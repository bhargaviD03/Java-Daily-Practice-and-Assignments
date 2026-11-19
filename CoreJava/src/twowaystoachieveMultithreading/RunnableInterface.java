package twowaystoachieveMultithreading;
import java.util.Scanner;

public interface RunnableInterface{

class demo4 implements Runnable{
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the number:");
		int num2 = sc.nextInt();
		
		try {
			System.out.println("Adding two numbers:"+(num1+num2));
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
class demo1 implements Runnable{
	@Override
	public void run() {
		for(int i=65;i<69;i++) {	
			try {
				System.out.println("Print the characters:"+(char)i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class demo2 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Print the numbers:"+i);
		}
	}
}
	public static void main(String[] args) throws Exception {
		
		demo d = new demo();
		Thread t = new Thread(d);
		System.out.println(Thread.currentThread());
		t.start();
		t.join();
		System.out.println(t.isAlive());
		demo1 d1 = new demo1();
		Thread t1 = new Thread(d1);
		System.out.println(Thread.currentThread());
		t1.start();
		t1.join();
		System.out.println(t1.isAlive());
		demo2 d2 = new demo2();
		Thread t2 = new Thread(d2);
		System.out.println(Thread.currentThread());
		t2.start();
		
	}
}
