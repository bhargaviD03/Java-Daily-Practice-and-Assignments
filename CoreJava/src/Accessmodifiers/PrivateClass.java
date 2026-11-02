package Accessmodifiers;

public class PrivateClass {
	
	private int value = 400;
	
	 private void Methods() {
		 String Value = "Homes";
		 System.out.println("Value:" + Value);
		 
	 }

	public static void main(String[] args) {
		
		PrivateClass privateClass = new PrivateClass();
		privateClass.Methods();
		System.out.println(privateClass.value);
		
	}
	}

