package HW1.submissions.partA.vincentsaw.paypal;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paypalGateway = new PayPalGateway();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paypalGateway);
        Account account = new Account("1");
        paymentProcessor.processPayment(account,100.0);
    }
}
