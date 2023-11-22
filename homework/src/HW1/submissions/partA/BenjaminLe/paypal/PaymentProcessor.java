package paypal;

public class PaymentProcessor extends PayPalBarrier{
    private PayPalGateway payPalGateway;

    PaymentProcessor() {
        this.payPalGateway = new PayPalGateway();
    }

    public void processPayment(Account account, double amount) {
        payPalGateway.processPayment(account,amount);
    }
    
    public void requestRefund(Account account, double amount) {
    	 payPalGateway.requestRefund(account,amount);
    }

}