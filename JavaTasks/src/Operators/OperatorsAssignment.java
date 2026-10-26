package Operators;

public class OperatorsAssignment {
	void Arithmetic() {
		int a=50;
		int b=30;
		System.out.println("add:" + (a+b));
		System.out.println("sub:" + (a-b));
		System.out.println("mul:" + a*b);
		System.out.println("div:" + a/b);
	}
	
	void Relational() {
		int a=30;
		int b=30;
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
	}

	void Assignment() {
		int a=30;
		int b=30;
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
	}
	
	void StudentMarks() {
		int MarksScored = 85;
		int Totalmarks =100;
		double Percentage = ((double)MarksScored/Totalmarks) * 100;
		System.out.println("MarksScored:"+ MarksScored);
		System.out.println("Percentage:"+ Percentage + "%");
	}
	
	void Pricecalculation() {
		float price = 999.50f;
		int Totalitems =3;
		float discount = 10/100.0f;
		
		double Totalprice = Totalitems * price;
		double Finalprice =  Totalprice  - (Totalprice*discount);
		
		System.out.println("Totalprice:"+ Totalprice);
		System.out.println("Finalprice:"+ Finalprice);
		
	}
	
	public static void main(String[] args) {
		OperatorsAssignment Operator = new OperatorsAssignment();
			Operator.Arithmetic();
			Operator.Relational();
			Operator.Assignment();
			Operator.StudentMarks();
			Operator.Pricecalculation();
	}

}
