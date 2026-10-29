package Interface;
import java.util.Scanner;

public class ArithematicImplements implements Calculator,SubInterface {
		Scanner sc = new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		System.out.println("Add:" + (a+b));	
	}

	@Override
	public void sub() {
		System.out.println("Enter the value of a:");
		int c = sc.nextInt();
		System.out.println("Enter the value of b:");
		int d = sc.nextInt();
		System.out.println("sub:" + (c-d));	
	}

}
