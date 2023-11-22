package HW1.submissions.partA.simontruong.paypal;

public class PaymentProcessor {
    private Processable process;

    

    void processPayment(Account account, double amount) {
        process.processPayment(account,amount);
    }
}