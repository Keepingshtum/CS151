package HW1.submissions.partA.victoriale.doordash;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Victoria");
        Restaurant restaurant = new Restaurant("Olive Garden");
        Store store = new Store("Safeway");

        GroceriesDeliveryService gds = new GroceriesDeliveryService();
        FoodDeliveryService fds = new FoodDeliveryService();

        fds.deliverFoodPackage(restaurant, customer);
        fds.trackPackage("28374692");
        System.out.println("");
        gds.deliverGroceriesPackage(store, customer);
        gds.trackPackage("29837469");

    }
}
