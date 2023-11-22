package HW1.submissions.partA.paypal;

import com.sun.source.tree.PatternCaseLabelTree;

public class PayEntity {
    private PaymentProcessorService paymentProcessorService;

    public void setPaymentProcessorService(PaymentProcessorService paymentProcessorService){
        this.paymentProcessorService = paymentProcessorService;
    }
    public void process(double amount){
        if(paymentProcessorService !=null){
            if(paymentProcessorService instanceof PaymentProcessor that){
                that.processPayment(amount);
            }
            else if(paymentProcessorService instanceof PayPalGateway that){
                that.processPayment(amount);
            }
            else System.out.println("Unknown payment processor service!");
        }
        else System.out.println("Please set payment processor service first!");
    }
}
