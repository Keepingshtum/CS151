package HW1.violations.doordash;

public class DashBoard implements DashBoardInterface {
    @Override
    public void display(Restaurant restaurant, Customer customer, String trackingNumber) {
        // TODO Auto-generated method stub
        FoodDelivery food = new FoodDelivery();
        food.deliverFood(restaurant, customer);

        TrackingService track = new TrackingService();
        track.trackPackage(trackingNumber);
    }

}
