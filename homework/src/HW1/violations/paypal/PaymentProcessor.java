package HW1.violations.paypal;

public class PaymentProcessor {
    private PaymentGateway payPalGateway;

    PaymentProcessor() {
        this.payPalGateway = new PayPalGateway();
    }
    
    void processPayment(Account account, double amount) {
        payPalGateway.processPayment(account,amount);
    }
     
}