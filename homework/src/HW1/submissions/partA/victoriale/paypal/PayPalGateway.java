package HW1.submissions.partA.victoriale.paypal;

public class PayPalGateway implements PaymentGateway {

    @Override
    public void processPayment(Account account, double amount) {
        System.out.println("Processing payment of $" + amount + " for account " + account.getAccountID() + " using PayPal.");
    }
}
