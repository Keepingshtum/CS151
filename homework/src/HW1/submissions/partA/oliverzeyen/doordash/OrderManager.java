package HW1.violations.doordash;

public class OrderManager {
    private FoodDeliveryService FDS;
    private FoodTrackingService FTS;
    
    public OrderManager() {
    	FDS = new FoodDeliveryService();
    	FTS = new FoodTrackingService();
    }
    
    public void processOrder(Restaurant r, Customer c) {
    	FoodDeliveryService.deliverFood(Restaurant r, Customer c);
    }
    
    public void trackOrder(String trackingNumber) {
    	FTS.trackPackage(String trackingNumber);
    }
}

