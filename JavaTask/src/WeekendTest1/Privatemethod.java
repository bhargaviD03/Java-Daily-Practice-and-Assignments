// Question 9

package WeekendTest1;

public class Privatemethod {

		
		private int value = 400;
		
		 private void Methods() {
			 String Value = "Homes";
			 System.out.println("Value:" + Value);
			 
		 }

		public static void main(String[] args) {
			
			Privatemethod privateClass = new Privatemethod();
			privateClass.Methods();
			System.out.println(privateClass.value);
			
		}
		}


//Can a private method of a parent class be overridden by a child class  - it's a No it gives error

//Question 9

//package privatemain;
//import WeekendTest1.Privatemethod;
//
//public class PrivateMain {
//
//
//	public class Main{
//
//		public static void main(String[] args) {
//
//			PrivateMain privateClass = new PrivateMain();
//			privateClass.Methods();
//			System.out.println(privateClass.value);
//			
//		}
//
//	}
//}


//Can a private method of a parent class be overridden by a child class  - it's a No
