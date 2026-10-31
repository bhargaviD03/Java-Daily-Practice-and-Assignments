package shapeAbstraction;

public class Rectangle extends Shape {

	@Override
	void CalulateArea(int a) {
		
		System.out.println("Square Area:" + a*a);
	}

	@Override
	void CalulateArea(double l, double b) {
		System.out.println("Rectangle Area:" + l*b);
		
	}
	

}
