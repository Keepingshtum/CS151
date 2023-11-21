package HW1.submissions.partA.doordash;

public class TrackingService implements DeliveryServicable {
    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }
}
