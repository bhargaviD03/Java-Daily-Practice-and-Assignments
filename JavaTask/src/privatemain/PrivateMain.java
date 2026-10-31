// Question 9

package privatemain;
import WeekendTest1.Privatemethod;

public class PrivateMain {


	public class Main{

		public static void main(String[] args) {

			PrivateMain privateClass = new PrivateMain();
			privateClass.Methods();
			System.out.println(privateClass.value);
			
		}

	}
}


//Can a private method of a parent class be overridden by a child class  - it's a No