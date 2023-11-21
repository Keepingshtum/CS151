package paypal;

public interface PaymentProcessor {
    void processPayment(Account account, double amount);
    void processRefund(Account account, double amount);
}