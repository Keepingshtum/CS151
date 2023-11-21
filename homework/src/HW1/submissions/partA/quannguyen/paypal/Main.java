package paypal;

public class Main {
    public static void main(String[] args) {
    	PaymentGateway paymentGateway = new PayPalGateway();
        PaymentProcessor paymentProcessor = new PayPalProcessor(paymentGateway);

        Account account = new Account("1");
 
        paymentProcessor.processPayment(account, 100.0);
        paymentProcessor.processRefund(account, 20.0);
    }
}