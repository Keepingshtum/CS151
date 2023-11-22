package HW1.submissions.partA.paypal;

public class PaymentProcessor implements PaymentProcessorService{
    private Account account;

    public PaymentProcessor(Account account){
        this.account = account;
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Processing payment of $" + amount + " for account " + account.getAccountID() + " using PaymentProcessor");
    }
}
