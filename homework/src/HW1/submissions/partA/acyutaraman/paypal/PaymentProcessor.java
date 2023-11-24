package paypal;

public class PaymentProcessor implements PayPalGateway{

    

	@Override
    public void processPayment(Account account, double amount) {
		System.out.println("Processing payment of $" + amount + " for acocunt " + account.getAccountID() + " using PayPal.");
    }

	@Override
	public void processPayment(Account account, double amount, double balance) {
		
		if(balance >= amount)
			System.out.println("Processing payment of $" + amount + " for acocunt " + account.getAccountID() + " using PayPal.");
		else
			System.out.println("For account " + account + ": the amount you are attempting to pay is more than that which is present in your balance." );
	}
	
	
    
}