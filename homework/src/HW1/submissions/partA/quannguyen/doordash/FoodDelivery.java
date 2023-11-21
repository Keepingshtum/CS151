package doordash;

public class FoodDelivery implements DeliveryService {
    private NotificationService notificationService;

    public FoodDelivery(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void deliverFood(Restaurant restaurant, Customer customer) {
        System.out.println("Food delivered from " + restaurant.getName() + " to " + customer.getName());

        notificationService.notifyCustomer(restaurant, customer);
    }
}
