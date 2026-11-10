package exception;
import java.util.Scanner;
public class Arithemetic extends Exception{
	public Arithemetic(String Message) {
		super(Message);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("run time exception");
		try {
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a/b);
		System.out.println("Error when any one value is zero");
		}
		catch(Arithemetic e){
			System.out.println(e.getMessage());	
		}

	}

}
