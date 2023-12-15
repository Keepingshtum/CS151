package partA.jaydevpatel.paypal;

public class PaymentProcessor {
    private PaymentProcessorService paymentProcessorService;

    PaymentProcessor() {
        this.paymentProcessorService = new PaymentProcessorService();
    }

    void processPayment(Account account, double amount) {
        paymentProcessorService.processPayment(account, amount);
    }

    void addPaymentComment(Account account, String comment) {
        paymentProcessorService.addPaymentComment(account, comment);
    }
}
