package HW1.submissions.partA.williamtran.doordash;

public class PackageTracking implements TrackingService{
    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }
}
