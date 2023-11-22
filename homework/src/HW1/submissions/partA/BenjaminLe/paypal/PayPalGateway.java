package paypal;

public class PayPalGateway extends PayPalBarrier{
	
	
    public void processPayment(Account account, double amount) {
        System.out.println("Processing payment of $" + amount + " for account " + account.getAccountID() + " using PayPal.");
    }
    
    public void requestRefund(Account account, double amount) {
        System.out.println("Requesting refund of $" + amount + " from account " + account.getAccountID() + " using PayPal.");
    }
}
