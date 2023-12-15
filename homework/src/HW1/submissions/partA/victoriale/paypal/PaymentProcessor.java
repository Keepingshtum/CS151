package HW1.submissions.partA.victoriale.paypal;

public class PaymentProcessor {
    private PaymentGateway gateway;

    PaymentProcessor() {
        this.gateway = new PayPalGateway();
    }

    void processPayment(Account account, double amount) {
        gateway.processPayment(account,amount);
    }
}