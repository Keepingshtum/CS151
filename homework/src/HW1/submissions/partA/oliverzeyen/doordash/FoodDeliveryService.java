package HW1.violations.doordash;

public class FoodDeliveryService implements DeliveryService {
    @Override
    public void deliverFood(Restaurant restaurant, Customer customer) {
        System.out.println("Food delivered from " + restaurant.getName() + " to " + customer.getName());
    }  
}