package HW1.violations.paypal;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Account account = new Account("1");
        paymentProcessor.processPayment(account,100.0);
        paymentProcessor.processRequest(account, 50.0);
    }
}
