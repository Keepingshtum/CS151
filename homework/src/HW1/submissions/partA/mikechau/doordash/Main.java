package HW1.submissions.partA.mikechau.doordash;

public class Main {
    public static void main(String[] args) {
        // Test Cases for CancelDelivery
        CancelDelivery cancelDelivery = new CancelDelivery();
        System.out.println("Testing CancelDelivery:");
        cancelDelivery.cancelDelivery("12345ABC");
        cancelDelivery.cancelDelivery("98765ZYX");

        // Test Cases for FoodDeliveryService
        FoodDeliveryService foodDeliveryService = new FoodDeliveryService();
        Restaurant restaurant1 = new Restaurant("Pizza Palace");
        Customer customer1 = new Customer("John Doe");
        Restaurant restaurant2 = new Restaurant("Burger Town");
        Customer customer2 = new Customer("Jane Smith");
        
        System.out.println("\nTesting FoodDeliveryService:");
        foodDeliveryService.deliverFood(restaurant1, customer1);
        foodDeliveryService.deliverFood(restaurant2, customer2);

        // Test Cases for TrackingService
        TrackingService trackingService = new TrackingService();
        System.out.println("\nTesting TrackingService:");
        trackingService.trackPackage("ABC123");
        trackingService.trackPackage("XYZ789");
    }
}
