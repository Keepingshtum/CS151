package HW1.submissions.partA.erictran.doordash;

public class PackageTrackingService implements TrackingService {
    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }

    @Override
    public void calculateEstimatedDeliveryTime(double distanceInMiles, double deliverySpeedMPH) {
        double estimatedDeliveryTime = distanceInMiles / deliverySpeedMPH;
        System.out.printf("Package will be delivered in approximately %.2f hours.\n", estimatedDeliveryTime);
    }
}