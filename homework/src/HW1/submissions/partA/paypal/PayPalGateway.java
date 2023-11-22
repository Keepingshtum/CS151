package HW1.submissions.partA.paypal;

public class PayPalGateway implements PaymentProcessorService{
    private Account account;

    public PayPalGateway(Account account){
        this.account = account;
    }
    @Override
    public void processPayment(double amount){
        System.out.println("Processing payment of $" + amount + " for account " + account.getAccountID() + " using PayPalGateway.");
    }
}
