package AccessModifiersSub;

import Accessmodifiers.PublicClass;
//import Accessmodifiers.PrivateClass;


public class Main{

	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		publicClass.Method();
		publicClass.salary= 35000;
		System.out.println(publicClass.salary);
//		PrivateClass privateClass = new PrivateClass();
//		privateClass.Methods();
//		System.out.println(privateClass.value);
		
	}

}
  