package HW1.submissions.partA.doordash;

public class FoodDeliveryService implements Deliverable{
    @Override
    public void deliverPackage(Seller seller, Customer customer) {
        if(seller instanceof Restaurant that) {
            System.out.println("Food delivered from " + that.getName() + " to " + customer.getName());
        }
        else{
            System.out.println("We support only restaurant orders for now!");
        }
    }
}
