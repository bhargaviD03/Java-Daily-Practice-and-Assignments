package datatypes;
import java.util.Scanner;

public class Employeedetails {
	Scanner sc = new Scanner (System.in);
	void employee() {
		System.out.println("--Employee Details--");
		System.out.println("Enter your EmpId:");
		int empId = sc.nextInt();
		System.out.println("EmpId:"+empId);
		sc.nextLine();
		System.out.println("Enter your EmpName:");
		String empName =  sc.nextLine();
		System.out.println("EmpName:"+empName);
		System.out.println("Enter your shiftTime:");
		int shiftTime =  sc.nextInt();
		System.out.println("shiftTime:"+shiftTime);
		System.out.println("Enter your salary:");
		double salary =  sc.nextDouble();
		System.out.println("salary:"+salary);
		sc.nextLine();
		System.out.println("Enter your Date of joining:");
		String doj =  sc.next();
		System.out.println("Date of joining:"+doj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeedetails Employee = new Employeedetails();
				Employee.employee();
//		Datatypes dataType = new Datatypes();
//			dataType.primitive();
//			dataType.primitive();
	}

}
