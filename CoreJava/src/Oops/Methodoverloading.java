package Oops;

public class Methodoverloading {
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(float a, int b) {
		System.out.println(a+b);
	}
	void add(int a, double b) {
		System.out.println(a+b);
	}
	void add(char a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Methodoverloading method = new Methodoverloading();
		 method.add(45.09f , 45 );

	}

}
 //super.methodname(); ==> give previous value which is before overloading 