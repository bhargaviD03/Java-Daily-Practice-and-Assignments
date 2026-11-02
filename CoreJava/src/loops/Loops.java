package loops;
import java.util.Scanner;

public class Loops {

	public void Loop(){
		Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Mark:");
	
	int Marks =sc.nextInt();
	
	if ( Marks>=91 && Marks<=100) {
		System.out.println("Grade O");
	}else if(Marks>=80 && Marks<=92) {
		System.out.println("Grade A+");
	}else if(Marks>=70 && Marks<=81) {
		System.out.println("Grade A");
	}else if(Marks>=60 && Marks<=71) {
		System.out.println("Grade B");
	}else if(Marks>=50 && Marks<=61) {
		System.out.println("Grade B+");
	}else if(Marks>=0 && Marks<=49) {
		System.out.println("Fail");
	}else {
			System.out.println("Invalid Number");
	}
	}
	

	public void Switch() {
		Scanner sc =new Scanner(System.in);
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("Choose the option:");
		int choose=sc.nextInt();
		int Value1 =0,Value2=0;
		switch(choose){
			case 1:
				System.out.println("Enter the Value1:");
				Value1=sc.nextInt();
				System.out.println("Enter the Value2:");
				Value2=sc.nextInt();
				System.out.println("Add:"+(Value1+Value2));
				break;
			case 2:
				System.out.println("Enter the Value1:");
				Value1=sc.nextInt();
				System.out.println("Enter the Value2:");
				Value2=sc.nextInt();
				System.out.println("Sub:"+(Value1-Value2));
				break;
			case 3:
				System.out.println("Enter the Value1:");
				Value1=sc.nextInt();
				System.out.println("Enter the Value2:");
				Value2=sc.nextInt();
				System.out.println("Mul:"+(Value1*Value2));
				break;
			case 4:
				System.out.println("Enter the Value1:");
				Value1=sc.nextInt();
				System.out.println("Enter the Value2:");
				Value2=sc.nextInt();
				System.out.println("Div:"+(Value1/Value2));
				break;
				default: 
					
					
					System.out.println("Invalid choice ");		
		}
			}
//	
//	public void While() {
//		int i = 0;
//		while(i<=50) {
//			
//			if(i%6==0) {
//				
//				System.out.println(i);
//				
//			}
//			i++;
//			
//		}
//	}

	
	public static void main(String[] args) {
		Loops L = new Loops();
		L.Loop();
		L.Switch();
//		L.While();
		}

}
