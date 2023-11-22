package HW1.submissions.partA.doordash;

public class FoodTrackingService implements Trackable{
    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + "is being tracked.");
    }
}
