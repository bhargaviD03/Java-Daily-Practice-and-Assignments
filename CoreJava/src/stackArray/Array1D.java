package stackArray;
import java.util.Scanner;

public class Array1D {
	
	
	public void usingint() {
	int[] arr = {1,2,4,6,4,8};
	for(int term:arr) {
		System.out.println(term);
	}
	System.out.println(arr.length);
	}
	

		public void usingstring() {
		    Scanner sc = new Scanner(System.in);

		    System.out.println("Enter how many details you want:");
		    int n = sc.nextInt();
		    sc.nextLine();

		    String[] details = new String[n];

		    for (int i = 0; i < details.length; i++) {
		        System.out.println("Enter the details: " + (i+1));
		        details[i] = sc.nextLine();
		    }

		    for (String allData : details) {
		        System.out.println("Your details: " + allData);
		    }
	}	
		
		
		public void byint() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter how many subject mark you want:");
		    int n = sc.nextInt();
		    
		    int[] mark = new int [n];
		    for ( int i=0;i<mark.length;i++) {
		    	System.out.println("Enter the mark:" + (i+1));
		    	mark[i]=sc.nextInt();
		    }
		    for (int term:mark) {
		    	System.out.println(term);
		    }
			
		}
		
	public static void main(String[] args) {
		Array1D A = new Array1D();
		A.usingint();
		A.usingstring();
		A.byint();
		


	}

}
