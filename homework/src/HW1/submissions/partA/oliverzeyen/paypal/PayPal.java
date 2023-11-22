package HW1.violations.paypal;

public interface PayPal {
    void processPayment(Account account, double amount);
    void processRequest(Account account, double amount);
}
