package HW1.submissions.partA.simontruong.doordash;
public class FoodDelivery implements FoodDeliverable {
    @Override
    public void deliverFood(Restaurant restaurant, Customer customer) {
        System.out.println("Food delivered from " + restaurant.getName() + " to " + customer.getName());
    }

}