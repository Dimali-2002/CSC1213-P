abstract class PaymentGateway
{
	public abstract void processpayment();
	public void authenticateUser()
	{
		System.out.println("User authenticated.");
	}
}