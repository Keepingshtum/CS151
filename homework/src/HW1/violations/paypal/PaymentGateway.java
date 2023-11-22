package HW1.violations.paypal;

public interface PaymentGateway {
    void processPayment(Account account, double amount);

}
