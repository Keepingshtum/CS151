package partA.jaydevpatel.paypal;

public class PaymentProcessorService {
    private PayPalGateway payPalGateway;

    PaymentProcessorService() {
        this.payPalGateway = new PayPalGateway();
    }

    void processPayment(Account account, double amount) {
        payPalGateway.processPayment(account, amount);
    }

    void addPaymentComment(Account account, String comment) {
        payPalGateway.addPaymentComment(account, comment);
    }
}
