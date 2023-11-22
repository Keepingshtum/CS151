package HW1.submissions.partA.paypal;

public interface PaymentProcessorService {
    default void processPayment(double amount){
        System.out.println("Processing payment of $" + amount + " for generic account using generic entity.");
    }
}
