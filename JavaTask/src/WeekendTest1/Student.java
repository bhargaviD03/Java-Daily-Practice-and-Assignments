// Question 1

package WeekendTest1;

public class Student{
	// we use encapsulation because every Object will have an important part so we will provide security using keyword private 
	//and accessed indirectly using setters and getters 
	
		private String name;
		private int age;
		private int marks;
		
	 public Student(String name,int age, int marks) {
		  this.name=name;
		  this.age = age;
		  this.marks= marks;
		  
	  }
	
	public static void main(String[] args) {
		Student S = new Student("Bhargavi",22,500);	
		
		System.out.println(S.name);
		System.out.println(S.age);
		System.out.println(S.marks);

	}

}
