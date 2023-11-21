package partA.jaydevpatel.uber;


public class Main {
    public static void main(String[] args) {
        Ride ride = RideFactory.createRide(1, 1);
        User user = UserManager.createUser("john_doe");

        RideManager rideManager = new RideManager();
        double fare = rideManager.calculateRideFare(ride);
        NotificationManager.sendNotification(user, "Your ride fare is: $" + fare);
    }
}
