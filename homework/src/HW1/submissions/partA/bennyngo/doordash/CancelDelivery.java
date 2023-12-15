package HW1.submissions.partA.bennyngo.doordash;

public class CancelDelivery implements CancelService {
    @Override
    public void cancelOrder(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " has been canceled.");
    }
}
