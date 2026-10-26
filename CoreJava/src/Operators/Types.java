package Operators;

public class Types {
//	void Monthlysalary() {
//		 int salary = 25000;
//		 salary += 30000;
//		 System.out.println(salary);
//		 salary *= 12;
//		 System.out.println(salary); 
//	}
	
	void Lastsalary() {
		 int salary = 25000;
		 System.out.println("Last Salary: " + salary);
	}
	
	void Currentsalary() {
		 int salary = 25000;
		 salary += 20000;
		 System.out.println("Current Salary: " + salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Types Salaryofemp = new Types();
		Salaryofemp.Lastsalary();
		Salaryofemp.Currentsalary();
}
}