package HW1.violations.paypal;

public class PayPalGateway implements PaymentGateway {
    public void processPayment(Account account, double amount) {
        System.out.println(
                "Processing payment of $" + amount + " for acocunt " + account.getAccountID() + " using PayPal.");
    }
}
