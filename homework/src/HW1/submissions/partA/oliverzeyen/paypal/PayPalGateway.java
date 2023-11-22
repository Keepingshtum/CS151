package HW1.violations.paypal;

public class PayPalGateway implements PayPal {
    @Override
	public void processPayment(Account account, double amount) {
        System.out.println("Processing payment of $" + amount + " for acocunt " + account.getAccountID() + " using PayPal.");
    }
    
    @Override
    public void processRequest(Account account, double amount) {
    	System.out.println("Processing request of $" + amount + " for account " + account.getAccountID() + " using PayPal.");
    }
}