package Oops;

public class Inheritance {
	
		float height = 5.8f;
		String color = "Brown";
		String noseStructure = "Normal";
		
		void readBooks(){
			System.out.println("I love to read books ");
		}

	
	class Child extends Inheritance{
		
	}
	public static void main(String[] args) {
		Inheritance  c = new Inheritance ();
		System.out.println(c.height);
		c.readBooks();
		}
}
