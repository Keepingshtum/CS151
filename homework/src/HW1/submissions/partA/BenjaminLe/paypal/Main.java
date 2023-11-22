package paypal;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Account account = new Account("1");
        Account account2 = new Account("2");
        paymentProcessor.processPayment(account,100.0);
        paymentProcessor.requestRefund(account2,50.0);
    }
}
