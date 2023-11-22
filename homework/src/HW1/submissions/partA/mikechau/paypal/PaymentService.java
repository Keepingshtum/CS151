package HW1.submissions.partA.mikechau.paypal;

public interface PaymentService {
    void processPayment(AccountImpl account, double amount);
    void processRefund(AccountImpl account, double amount);
}
