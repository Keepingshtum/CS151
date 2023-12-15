package HW1.submissions.partA.victoriale.paypal;

public interface PaymentGateway {
    void processPayment(Account account, double amount);
}
