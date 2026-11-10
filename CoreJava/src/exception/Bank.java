package exception;

public class Bank{
	
	public void amount(int balance) throws MaxBalance {
		if(balance <= 0) {
			throw new MinBalance("Minimum balance should be greater than zero ");
		}else if(balance>50000) {
			throw new MaxBalance("Maximum balance should be less than 50000");
		}
		else {
			System.out.println("Balance:"+balance);
		}
	}

	public static void main(String[] args) {
		Bank B = new Bank();
		
		try {
			B.amount(0);	
		}catch(MinBalance e) {
			System.out.println(e.getMessage());
		}
		catch(MaxBalance e) {
			System.out.println(e.getMessage());
		}
		System.out.println("After Run time.......");
		try {
			B.amount(60000);
		}catch(MaxBalance e){
			System.out.println(e.getMessage());
		}
		System.out.println("After Compile time.......");
	}

}
