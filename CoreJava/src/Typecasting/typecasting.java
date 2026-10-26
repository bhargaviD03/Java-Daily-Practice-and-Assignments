package Typecasting;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 400;
		int num1=500;
		String number = String.valueOf(value);
		System.out.println(number+num1);
		
		String  value1 = "400";
		String num2="500";
		int number1 = Integer.valueOf(value1);
		int number2 = Integer.valueOf(num2);
		System.out.println(number1+number2);
		
		float items = 95.5f;
		int Float = (int) items;
		System.out.println(Float);
		
		double dbitems = 98.7834567890;
		int Floats = (int) dbitems;
		System.out.println(Floats);
		
		int items1 = 95;
		float Float1 = (float) items1;
		System.out.println(Float1);
		
		int dbitems1 = 98;
		double Floats1 = (double) dbitems1;
		System.out.println(Floats1);

	}

}
