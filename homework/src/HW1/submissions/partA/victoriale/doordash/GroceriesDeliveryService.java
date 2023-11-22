package HW1.submissions.partA.victoriale.doordash;

public class GroceriesDeliveryService implements GroceriesDelivery, Tracking {
    @Override
    public void deliverGroceriesPackage(Store store, Customer customer) {
        System.out.println("Groceries delivered from " + store.getName() + " to " + customer.getName());
    }

    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked.");
    }
}