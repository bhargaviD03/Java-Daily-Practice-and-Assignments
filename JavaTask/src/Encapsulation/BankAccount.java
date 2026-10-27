package Encapsulation;

public class BankAccount {
	
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber,double balance) {
		this.accountNumber=accountNumber;
		
		if(balance >= 0) {
		this.balance=balance;
	}
}
	
	public long getaccountNumber() {
		return accountNumber;
	}
	
	public double getbalance() {
		return balance;
	}
	

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    
	public void Withdrawal(double amount) {
		if (amount <= 0 ) {
			System.out.println("Invalid withdrawal amount");
		}
		else if(amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
	}
	
	
	public static void main(String[] args) {
		 BankAccount account = new  BankAccount(785764536748L,50000d);
		 System.out.println("Account Number: "+ account.getaccountNumber());
		 System.out.println("Initial Balance: "+ account.getbalance());
			
			account.deposit(2000.0);
			account.Withdrawal(1500.0);
			
			System.out.println("Final Balance: " + account.getbalance());
		}
	}

