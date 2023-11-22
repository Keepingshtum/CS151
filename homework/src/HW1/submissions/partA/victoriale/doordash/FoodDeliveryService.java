package HW1.submissions.partA.victoriale.doordash;

public class FoodDeliveryService implements FoodDelivery, Tracking {
    @Override
    public void deliverFoodPackage(Restaurant restaurant, Customer customer) {
        System.out.println("Food delivered from " + restaurant.getName() + " to " + customer.getName());
    }
    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }
}