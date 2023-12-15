package partA.jaydevpatel.paypal;

public class PayPalGateway implements PaymentGateway {
    @Override
    public void processPayment(Account account, double amount) {
        System.out.println("Processing payment of $" + amount + " for account " + account.getAccountID() + " using PayPal.");
    }

    @Override
    public void addPaymentComment(Account account, String comment) {
        System.out.println("Added comment for account " + account.getAccountID() + ": " + comment);
    }
}