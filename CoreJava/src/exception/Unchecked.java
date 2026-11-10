package exception;

public class Unchecked {

	public static void main(String[] args) {
//		public void getMessage() {
//			
//		}
		//run time exception
		System.out.println("run time exception");
		try {
		int a=10 ,b=0;
		System.out.println(a/b);
		}
		catch(Exception e){
			System.out.println(e.getMessage());	
		}
		System.out.println("This is the end.....");

	try {
		String name="Maxi";
		System.out.println(name.charAt(8));
	}catch(StringIndexOutOfBoundsException e){
		System.out.println(e.getMessage());
	}
	

	try {
		int[] arr= {10,20,30};
		System.out.println(arr[5]);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e.getMessage());
	}finally {
		System.out.println("Array execution is completed");
		
	}
	
	
	try {
		String num="123";
		int value = Integer.valueOf(num);
		System.out.println(value);
	}catch(NumberFormatException e){
		System.out.println(e.getMessage());
	}
	
	//compile time exception
		try {
			Thread.sleep(2000);
			System.out.println("Start");
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
	}
}
