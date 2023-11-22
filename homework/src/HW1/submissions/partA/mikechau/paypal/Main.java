package HW1.submissions.partA.mikechau.paypal;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentGateway = new PayPalGateway();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        AccountImpl account = new AccountImpl("1");
        paymentProcessor.processPayment(account,100.0);
        paymentProcessor.processRefund(account, 50.0);
    }
}
