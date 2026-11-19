package twowaystoachieveMultithreading;
import java.util.Scanner;

class demo extends Thread{
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
class demo1 extends Thread{
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
class demo2 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Print the numbers:"+i);
		}
	}
}
public class ExtendsThread {
	public static void main(String[] args) {
		demo d = new demo();
		Thread t = Thread.currentThread();
		System.out.println(t);
		demo1 d1 = new demo1();
		Thread t1 = Thread.currentThread();
		System.out.println(t1);
		demo2 d2 = new demo2();
		Thread t2= Thread.currentThread();
		System.out.println(t2);
		
		d.start();
		d1.start();
		d2.start();
		
	}

}
