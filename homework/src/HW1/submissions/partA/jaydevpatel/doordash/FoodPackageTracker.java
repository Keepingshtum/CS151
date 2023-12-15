package partA.jaydevpatel.doordash;

public class FoodPackageTracker implements PackageTracker {
    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }
}
