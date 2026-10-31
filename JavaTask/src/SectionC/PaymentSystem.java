//	Question 11

package SectionC;

import SectionC.CardPayment;
import SectionC.CashPayment;
import SectionC.Payment;
import SectionC.UPIPayment;


class Payment {
	    void pay(double amount) {
	        System.out.println("Processing payment");
	    }
	}

	class UPIPayment extends Payment {
	    @Override
	    void pay(double amount) {
	        System.out.println("Payment through UPI");
	    }
	}

	class CardPayment extends Payment {
	    @Override
	    void pay(double amount) {
	        System.out.println("Payment through Card");
	    }
	}

	class CashPayment extends Payment {
	    @Override
	    void pay(double amount) {
	        System.out.println("Payment through Cash");
	    }
	}


	public class PaymentSystem {


	    public static void main(String[] args) {
	        Payment p;

	        p = new UPIPayment();
	        p.pay(1000.0d);

	        p = new CardPayment();
	        p.pay(2000.0d);

	        p = new CashPayment();
	        p.pay(3000.0d);
	    }
	}



