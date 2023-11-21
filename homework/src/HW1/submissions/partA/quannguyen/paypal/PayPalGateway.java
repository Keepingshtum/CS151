package paypal;

class PayPalGateway implements PaymentGateway {
    @Override
    public void processPayment(Account account, double amount) {
        System.out.println("Processing payment of $" + amount + " for account " + account.getAccountID() + " using PayPal.");
    }

    @Override
    public void processRefund(Account account, double amount) {
        System.out.println("Processing refund of $" + amount + " for account " + account.getAccountID() + " using PayPal.");
    }
}