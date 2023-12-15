package HW1.submissions.partA.williamtran.paypal;

public interface Gateway {
    void processPayment(Account account, double amount);
}
