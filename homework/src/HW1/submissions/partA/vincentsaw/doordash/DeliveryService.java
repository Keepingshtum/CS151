package HW1.submissions.partA.vincentsaw.doordash;

public interface DeliveryService {
    void deliverFood(Restaurant restaurant, Customer customer);
    void trackPackage(String trackingNumber);
}
