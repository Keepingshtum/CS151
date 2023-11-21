package partA.jaydevpatel.paypal;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Account account = new Account("1");
        paymentProcessor.processPayment(account, 100.0);

        // Adding a comment to the payment
        paymentProcessor.addPaymentComment(account, "Thank you for your purchase!");
    }
}