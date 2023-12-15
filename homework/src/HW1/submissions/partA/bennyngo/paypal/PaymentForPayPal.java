package HW1.submissions.partA.bennyngo.paypal;

public interface PaymentForPayPal {
    void processPayment(AccountImpl account, double amount);
    void processRequest(AccountImpl account, double amount);
}
