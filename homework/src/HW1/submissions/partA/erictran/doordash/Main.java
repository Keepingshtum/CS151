package HW1.submissions.partA.erictran.doordash;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Chick-fil-a");
        Customer customer = new Customer("Bobby");

        DeliveryService deliveryService = new FoodDeliveryService();
        PackageTrackingService trackingService = new PackageTrackingService();

        deliveryService.deliverFood(restaurant, customer);

        trackingService.trackPackage("123456789");

        trackingService.calculateEstimatedDeliveryTime(100, 55);
    }
}