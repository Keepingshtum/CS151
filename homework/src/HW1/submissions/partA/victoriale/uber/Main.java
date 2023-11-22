package HW1.submissions.partA.victoriale.uber;

public class Main {
    public static void main(String[] args) {
        Ride ride = new Ride(1,1);
        User user = new User();
        user.setUsername("john_doe");

        RideManager rideManager = new RideManager();
        NotificationManager notificationManager = new NotificationManager();

        double fare = rideManager.calculateRideFare(ride);

        notificationManager.sendNotification(user, "Your ride fare is: $" + fare);
    }
}