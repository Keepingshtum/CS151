package partA.jaydevpatel.paypal;

public interface PaymentGateway {
    void processPayment(Account account, double amount);
    void addPaymentComment(Account account, String comment);
}
