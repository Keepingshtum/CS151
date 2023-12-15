package partA.jaydevpatel.doordash;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Awesome Restaurant");
        Customer customer = new Customer("John Doe");

        DeliveryService deliveryService = new FoodDeliveryService();
        PackageTracker packageTracker = new FoodPackageTracker();

        // Original delivery and tracking
        deliveryService.deliverFood(restaurant, customer);
        packageTracker.trackPackage("123456");

        // Additional confirmation of delivery
        ((FoodDeliveryService) deliveryService).confirmDelivery(customer);
    }
}