package Abstractandinterface;

public class Secondimplement extends Firstimplement {
	private String Feedback;
	private String Name;
	
	@Override
	public void Empdetails(String Feedback,String Name) {
		this.Feedback=Feedback+"this is the end";
		this.Name=Name + "welcome";
	}
	
	@Override
	public void display() {
		System.out.println("Name:"+Name+"Feedback:"+Feedback);
	}

}

