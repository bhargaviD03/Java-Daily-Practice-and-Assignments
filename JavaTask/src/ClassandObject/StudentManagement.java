package ClassandObject;

public class StudentManagement {
	
		String name;
		int rollNo;
		float marks;
		
		StudentManagement(String name, int rollNo, float marks) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.marks = marks;
	    }
		
		void StudentDetails() {
			System.out.println("Name:"+ name);
			System.out.println("RollNo:"+  rollNo);
			System.out.println("Marks:"+ marks);
			System.out.println();
		}
		

	
	public static void main(String[] args) {
		StudentManagement S1 = new StudentManagement("Bhargavi", 3 , 500.0f);
		StudentManagement S2 = new StudentManagement("Pranavi", 5 , 550.0f);
		
		S1.StudentDetails();
		S2.StudentDetails();

	}

}
