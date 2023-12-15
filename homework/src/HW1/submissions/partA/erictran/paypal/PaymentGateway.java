package HW1.submissions.partA.erictran.paypal;

public interface PaymentGateway {
    public void processPayment(Account account, double amount);

    public void processRefund(Account account, double amount);
}