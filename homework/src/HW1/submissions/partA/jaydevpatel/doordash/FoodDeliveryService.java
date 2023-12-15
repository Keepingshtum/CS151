package partA.jaydevpatel.doordash;

public class FoodDeliveryService implements DeliveryService {
    @Override
    public void deliverFood(Restaurant restaurant, Customer customer) {
        System.out.println("Food delivered from " + restaurant.getName() + " to " + customer.getName());
    }

    @Override
    public void confirmDelivery(Customer customer) {
        System.out.println("Delivery to " + customer.getName() + " confirmed.");
    }
}
