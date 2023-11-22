package HW1.submissions.partA.paypal;

public class Main {
    public static void main(String[] args){
        PayEntity payEntity = new PayEntity();

        payEntity.setPaymentProcessorService(new PaymentProcessor(new Account("123456789")));
        payEntity.process(150);

        payEntity.setPaymentProcessorService(new PayPalGateway(new Account("987654321")));
        payEntity.process(300);

        payEntity.setPaymentProcessorService(null);
        payEntity.process(500);
    }
}
