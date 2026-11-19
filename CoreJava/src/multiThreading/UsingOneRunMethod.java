package multiThreading;
import java.util.Scanner;

class Singlerun extends Thread{
	
	@Override
	public void run() {
		String name = getName();
		
		if(name.equalsIgnoreCase("Add")) {
			Adding();
		}else if(name.equalsIgnoreCase("Char")) {
			Char();
		}else {
			Num();
		}
	}
	 void Adding() {
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


	 void Char() {
		for(int i=65;i<69;i++) {	
			try {
				System.out.println("Print the characters:"+(char)i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	 void Num() {
		for(int i=1;i<=10;i++) {
			System.out.println("Print the numbers:"+i);
		}
	}
	
}
public class UsingOneRunMethod{
	public static void main(String[] args) throws Exception {
		Singlerun s = new Singlerun();
			s.setName("Add");
		Singlerun s1 = new Singlerun();
			s1.setName("Char");
		Singlerun s2 = new Singlerun();
			s2.setName("Num");
			
			s.start();
			s.join();
			s1.start();
			s2.start();
	}

}
