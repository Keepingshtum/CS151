package partA.jaydevpatel.doordash;

public interface DeliveryService {
    void deliverFood(Restaurant restaurant, Customer customer);
    void confirmDelivery(Customer customer);
}
