//Question 2
package WeekendTest1;
//Inheritance ==>the child inherits from parent class
public class vehicle {
	
	String name = "Bhargavi";
	void sound() {
		System.out.println("Every vehicle have horn ");
	}
	
	public class Car extends vehicle{
		void sound() {
			System.out.println("Every vehicle have horn ");
		}
	}
	

	public static void main(String[] args) {
		vehicle V= new vehicle();
		System.out.println(V.name);
		V.sound();

	}

}
