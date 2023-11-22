package doordash;

public class FoodDelivery implements DeliveryService {
    @Override
    public void deliverFood(Restaurant restaurant, Customer customer) {
        System.out.println("Food delivered from " + restaurant.getName() + " to " + customer.getName());
    }
    public void uberEats(Restaurant restaurant, Customer customer){
        System.out.println("" + customer.getName() + "food order needs to be delivered from " + restaurant.getName() + " to " + customer.getAddress());
    }


}