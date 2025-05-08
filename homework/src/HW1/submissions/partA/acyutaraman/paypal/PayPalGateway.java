package paypal;

public interface PayPalGateway {
    void processPayment(Account account, double amount);
    void processPayment(Account account, double amount, double balance);
}