package HW1.submissions.partA.vincentsaw.paypal;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    void processPayment(Account account, double amount) {
        paymentGateway.processPayment(account,amount);
    }
}