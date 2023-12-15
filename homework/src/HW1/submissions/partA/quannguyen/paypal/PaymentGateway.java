package paypal;

public interface PaymentGateway {
    void processPayment(Account account, double amount);
    void processRefund(Account account, double amount);
}
