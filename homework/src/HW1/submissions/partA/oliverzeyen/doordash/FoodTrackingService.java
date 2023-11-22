package HW1.violations.doordash;

public class FoodTrackingService implements TrackingService {
    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }
}