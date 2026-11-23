package javaAssignment;


class Bank{
	int balance=10000;
	
	synchronized void withdrawal(int amount) {
		if(balance>=amount) {
			System.out.println(Thread.currentThread().getName()+" is withdrawing amount ₹" + amount);
			balance = balance-amount;
			System.out.println("Remaining balance:"+ balance);
		}
		else {
			System.out.println(Thread.currentThread().getName()+" - Insuffiiciient balance ");
		}
	}
}
public class SynchronizationBankAccount {

	public static void main(String[] args) {
		Bank b = new Bank();
		Thread t1 = new Thread(()->b.withdrawal(4000),"Thread 1");
		Thread t2 = new Thread(()->b.withdrawal(4000),"Thread 2");
		
		t1.start();
		t2.start();
	}

}
