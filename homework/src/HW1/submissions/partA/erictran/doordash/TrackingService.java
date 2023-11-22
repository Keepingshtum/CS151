package HW1.submissions.partA.erictran.doordash;

public interface TrackingService {
    void trackPackage(String trackingNumber);

    void calculateEstimatedDeliveryTime(double distanceInMiles, double deliverySpeedMPH);
}