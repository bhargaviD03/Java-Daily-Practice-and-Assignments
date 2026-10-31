package SectionD;

// Question 12

public class Manager  extends Developer {

	  public Manager(int empId,String empName) {
	        super(empId,empName);
	    }

    @Override
    void display() {
        System.out.println("Employee Details from Manager");
        super.display();
    }

    public static void main(String[] args) {

    	Manager override = new Manager(1,"Bhargavi");

        override.display();
    }
}

