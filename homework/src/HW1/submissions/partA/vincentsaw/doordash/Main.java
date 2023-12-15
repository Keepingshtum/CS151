package HW1.submissions.partA.vincentsaw.doordash;

public class Main {
    public static void main(String[] args) {
        Customer cus = new Customer("Vincent");
        Restaurant res = new Restaurant("Spartan Tacos");
        DeliveryService ds = new DeliveryServiceImpl();
        TrackingService ts = new TrackingServiceImpl();

        ds.deliverFood(res, cus);
        ts.setPackageEta("3735928559", "11/21"); //Example addition of ETA based on tracking number (hidden)
        ts.trackPackage("3735928559"); //deadbeef

    }
}
