package doordash;

public class CustomerNotificationService implements NotificationService {
    @Override
    public void notifyCustomer(Restaurant restaurant, Customer customer) {
        System.out.println("Dear " + customer.getName() + ", your food from " + restaurant.getName() + " has been delivered. Enjoy your meal!");
    }
}
