package HW1.submissions.partA.doordash;

public class Main {
    public static void main(String[] args){
        FoodDeliveryService foodDeliveryService = new FoodDeliveryService();
        FoodTrackingService foodTrackingService = new FoodTrackingService();

        foodDeliveryService.deliverPackage(new Restaurant("McDonalds"), new Customer("Anant"));
        foodDeliveryService.deliverPackage(new GroceryStore("Safeway"), new Customer("Edward"));
        foodTrackingService.trackPackage("5E96MQ3XPL");
    }
}
