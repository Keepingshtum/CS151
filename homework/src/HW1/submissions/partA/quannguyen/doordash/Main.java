package doordash;

public class Main {
    public static void main(String[] args) {     
        Restaurant restaurant = new Restaurant("Delicious Bites");
        Customer customer = new Customer("Quan Nguen");
        NotificationService notificationService = new CustomerNotificationService();
        
        PackageTrackingServiceImpl packageTrackingService = new PackageTrackingServiceImpl();
        FoodDelivery foodDeliveryService = new FoodDelivery(notificationService);

        foodDeliveryService.deliverFood(restaurant, customer);
        packageTrackingService.trackPackage("123456789");
    }
}