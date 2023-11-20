package HW1.submissions.partA.bennyngo.paypal;

public class PayPalGateway implements PaymentForPayPal {

    @Override
    public void processPayment(AccountImpl account, double amount) {
        System.out.println("Processing payment of $" + amount + " for account " + account.getAccountID() + " using PayPal.");
    }

    @Override
    public void processRequest(AccountImpl account, double amount) {
        System.out.println("Processing request of $" + amount + " for account " + account.getAccountID() + " using PayPal.");
    }


}
