package HW1.submissions.partA.mikechau.paypal;

public class PayPalGateway implements PaymentService{
    @Override
    public void processPayment(AccountImpl account, double amount) {
        System.out.println("Processing payment of $" + amount + " for acocunt " + account.getAccountID() + " using PayPal.");
    }

    @Override
    public void processRefund(AccountImpl account, double amount) {
        System.out.println("Processing refund of $" + amount + " for account " + account.getAccountID() + " using PayPal.");
    }
}
