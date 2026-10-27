
package overrideconstrutor;

public class Overridechild2 extends Overridechild1 {

	  public Overridechild2(String employeeName, String employeeShiftTime,float employeeSalary) {
	        super(employeeName,employeeShiftTime, employeeSalary);
	    }

    @Override
    void display() {
        System.out.println("Employee Details from Child 2");
        super.display();
    }

    public static void main(String[] args) {

        Overridechild2 override = new Overridechild2("Bhargavi", "9AM to 6PM" ,45000.0f);

        override.display();
    }
}