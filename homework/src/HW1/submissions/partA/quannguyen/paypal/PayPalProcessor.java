package paypal;

class PayPalProcessor implements PaymentProcessor {
    private PaymentGateway paymentGateway;

    PayPalProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void processPayment(Account account, double amount) {
        paymentGateway.processPayment(account, amount);
    }

    @Override
    public void processRefund(Account account, double amount) {
        paymentGateway.processRefund(account, amount);
    }
}