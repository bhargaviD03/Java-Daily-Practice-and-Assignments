//Question 3
package WeekendTest1;

public class Calculator {
//	Method Overloading ==> Having same method name inside same class 
//			and naming confusion can be identified using number of and type of parameters
	void add(int a, int b) {
		System.out.println("add:"+(a+b));
	}
	 void add(int a, int b,int c) {
		 System.out.println("add:"+(a+b+c));
	 }
	
	 void add(double a, double b) {
		 System.out.println("add:"+(a+b));
		 
	 }
	public static void main(String[] args) {
		 Calculator C = new  Calculator();
		 	C.add(4, 5);
		 	C.add(4, 5, 6);
		 	C.add(4.50d, 6.06d);

	}

}


//Question 4

//A parent class has a display() method, and a child class provides its own implementation of display()
//this is  called Overriding



//Question 5
// A program must hide implementation details and expose only essential operations. Which OOP concept
//supports this ==> Abstract 
//Name one Java feature used to achieve it---by using inheritance,construtor 