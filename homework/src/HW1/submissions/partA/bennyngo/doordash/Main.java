package HW1.submissions.partA.bennyngo.doordash;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John");
        Restaurant restaurant = new Restaurant("McDonalds");

        DeliveryService deliveryService = new FoodDeliveryService();
        PackageTrackerService trackingService = new PackageTrackingService();
        CancelService cancelService = new CancelDelivery();

        deliveryService.deliverFood(restaurant, customer);
        trackingService.trackPackage("123456789");
        cancelService.cancelOrder("123456789");
    }
}
