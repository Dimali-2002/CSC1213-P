abstract class PaymentGateWay{
	public abstract void processPayment();
	public void authenticateUser(){
		System.out.println("User authenticated.");
	}
}
class PayPal extends PaymentGateWay{
	public void processPayment(){
		System.out.println("Processing payment via PayPal...");
	}
}
class CreditCard extends PaymentGateWay{
	public void processPayment(){
		System.out.println("Processing payment via Credit Card...");
	}
}

class MainClass2{
	public static void main(String[] args){
		PaymentGateWay myPayPal = new PayPal();
		PaymentGateWay myCreditCard = new CreditCard();
		
		myPayPal.authenticateUser();
		myPayPal.processPayment();
		myCreditCard.authenticateUser();
		myCreditCard.processPayment();
	}
}