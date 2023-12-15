package HW1.submissions.partA.williamtran.paypal;

public class PaymentProcessor {
    private Gateway Gateway;

    PaymentProcessor() {
        this.Gateway = new PayPalGateway();
    }

    void processPayment(Account account, double amount) {
        Gateway.processPayment(account,amount);
    }
}