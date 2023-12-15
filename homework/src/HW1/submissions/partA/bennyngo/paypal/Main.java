package HW1.submissions.partA.bennyngo.paypal;

public class Main {
    public static void main(String[] args) {
        PaymentForPayPal paymentGateway = new PayPalGateway();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        AccountImpl account = new AccountImpl("1");
        paymentProcessor.processPayment(account,100.0);
        paymentProcessor.processRequest(account,50.0);
    }
}
