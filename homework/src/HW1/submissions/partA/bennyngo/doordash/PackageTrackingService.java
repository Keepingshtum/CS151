package HW1.submissions.partA.bennyngo.doordash;

public class PackageTrackingService implements PackageTrackerService {
    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }
}
