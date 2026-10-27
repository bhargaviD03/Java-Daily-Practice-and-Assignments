package Inheritance;

public class Class extends Parent  {
	
	public Class(String name,int id,double salary,String programmingLanguage) {
		super(name,id,salary,programmingLanguage);
		}

	public static void main(String[] args) {
	
		Class C1 = new Class("Bhargavi",3,45000.0d,"Java");
		C1.display();
	}

}
