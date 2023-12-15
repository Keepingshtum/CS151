package HW1.submissions.partA.vincentsaw.doordash;

public interface TrackingService {
    void trackPackage(String trackingNumber);
    void setPackageEta(String tn, String pe);
    String getPackageEta(String tn);
}
