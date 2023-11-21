package HW1.submissions.partA.uber;

public class Main {
    public static void main(String[] args) {
        Ride ride = new Ride(1,1);
        User user = new User();
        user.setUsername("john_doe");

        RideManager rideManager = new RideManager();

        double fare = rideManager.calculateRideFare(ride);

        rideManager.sendNotification(user, "Your ride fare is: $" + fare);
    }
}