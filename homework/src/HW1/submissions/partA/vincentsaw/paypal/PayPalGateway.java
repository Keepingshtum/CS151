package HW1.submissions.partA.vincentsaw.paypal;

public class PayPalGateway implements PaymentGateway {
    @Override
    public void processPayment(Account account, double amount) {
        System.out.println("Processing payment of $" + amount + " for acocunt " + account.getAccountID() + " using PayPal.");
    }
}
