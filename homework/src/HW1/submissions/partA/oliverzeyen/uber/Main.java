package HW1.violations.uber;

public class Main {
    public static void main(String[] args) {
        RideInformation ride = new RideInformation(1,1);
        UserAccount user = new UserAccount();
        user.setUsername("john_doe");

        RideFareCalculator rideManager = new RideFareCalculator();
        NotificationManager notificationManager = new NotificationManager();
        double fare = rideManager.calculateRideFare(ride);

        notificationManager.sendNotification(user, "Your ride fare is: $" + fare);
    }
}