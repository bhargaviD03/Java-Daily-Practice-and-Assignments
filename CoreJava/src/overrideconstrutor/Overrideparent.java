package overrideconstrutor;

public class Overrideparent {
	String employeeName,employeeShiftTime;
	float employeeSalary;
	
void display() {
		System.out.println( "EmployeeName:"+employeeName);
		System.out.println("EmployeeShiftTime:"+employeeShiftTime);
		System.out.println("EmployeeSalary:"+employeeSalary);
	}
	public Overrideparent(String employeeName, String employeeShiftTime,float employeeSalary) {
		this.employeeName = employeeName;
		this.employeeShiftTime =employeeShiftTime;	
		this.employeeSalary = employeeSalary;
	}

}
