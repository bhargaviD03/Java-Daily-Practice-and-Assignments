package javaAssigmnent25112026;

public class Car {
	class Engine{
		private String name;
		private String type;
		public Engine(String name,String type) {
			this.name = name;
			this.type = type;
		}
		void display() {
			System.out.printf("name:"+name+" "+"Type:"+type);
		}
	}
	public static void main(String[] args) {
		Car outerclass= new Car();
		Car.Engine inner=outerclass.new Engine("Ferrari","296 GTB");
		inner.display();

	}

}
