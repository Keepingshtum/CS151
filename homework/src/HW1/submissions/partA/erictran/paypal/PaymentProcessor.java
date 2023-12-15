package HW1.submissions.partA.erictran.paypal;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(Account account, double amount) {
        paymentGateway.processPayment(account,amount);
    }

    public void processRefund(Account account, double amount) {
        paymentGateway.processRefund(account, amount);
    }
}