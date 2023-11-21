package doordash;

public class PackageTrackingServiceImpl implements PackageTrackingService {
    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }
}

