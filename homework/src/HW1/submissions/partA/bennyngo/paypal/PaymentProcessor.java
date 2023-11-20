package HW1.submissions.partA.bennyngo.paypal;

public class PaymentProcessor implements PaymentForPayPal {
    private PaymentForPayPal payPalGateway;

    PaymentProcessor(PaymentForPayPal payPalGateway) {
        this.payPalGateway = payPalGateway;
    }


    @Override
    public void processPayment(AccountImpl account, double amount) {
        payPalGateway.processPayment(account,amount);
    }

    @Override
    public void processRequest(AccountImpl account, double amount) {
        payPalGateway.processRequest(account,amount);
    }
}