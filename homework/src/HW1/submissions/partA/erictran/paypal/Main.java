package HW1.submissions.partA.erictran.paypal;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PayPalGateway();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        Account account = new Account("1");
        paymentProcessor.processPayment(account,100.0);
        paymentProcessor.processRefund(account, 100.0);
    }
}