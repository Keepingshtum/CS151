package HW1.submissions.partA.vincentsaw.paypal;

public interface PaymentGateway {
    public void processPayment(Account account, double amount);
}
