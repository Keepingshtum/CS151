package HW1.violations.doordash;

public class TrackingService implements TrackPackage {
    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }
}
