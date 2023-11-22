package HW1.submissions.partA.williamtran.uber;

public class Main {
    public static void main(String[] args) {
        Ride ride = new Ride(1,1);
        User user = new User();
        Notification n = new Notification();
        user.setUsername("john_doe");

        RideManager rideManager = new RideManager();

        double fare = rideManager.calculateRideFare(ride);

        n.sendNotification(user, "Your ride fare is: $" + fare);
    }
}