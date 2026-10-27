package Inheritance;

public class Parent {
	String name;
	int id;
	double salary;
	String programmingLanguage;
	
	public Parent(String name,int id,double salary,String programmingLanguage) {
	this.name=name;
	this.id=id;
	this.salary=salary;
	this.programmingLanguage=programmingLanguage;
	}
	
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println("Salary:"+salary);
		System.out.println("Programming Language: "
                + programmingLanguage);
	}

}
