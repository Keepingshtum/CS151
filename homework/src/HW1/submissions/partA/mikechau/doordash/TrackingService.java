package HW1.submissions.partA.mikechau.doordash;

public class TrackingService implements TrackingPackageService {
    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }
}
