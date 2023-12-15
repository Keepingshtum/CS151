package HW1.submissions.partA.mikechau.paypal;

public class PaymentProcessor implements PaymentService {
    private PaymentService payPalGateway;

    PaymentProcessor(PaymentService paymentProcessor) {
        this.payPalGateway = paymentProcessor;
    }

    @Override
    public void processRefund(AccountImpl account, double amount) {
        payPalGateway.processRefund(account, amount);
    }

    @Override
    public void processPayment(AccountImpl acc, double amount) {
        payPalGateway.processPayment(acc ,amount);
    }
}