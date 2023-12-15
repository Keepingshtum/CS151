package HW1.submissions.partA.mikechau.doordash;

public class CancelDelivery implements CancelDeliveryService{
    @Override
    public void  cancelDelivery(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " has been canceled and will no longer be delivered.");
    }
}
