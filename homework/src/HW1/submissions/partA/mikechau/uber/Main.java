package HW1.submissions.partA.mikechau.uber;

public class Main {
    public static void main(String[] args) {
        RideImpl ride = new RideImpl(5,20);
        UserImpl user = new UserImpl("john_doe");

        RideFareService rideManager = new RideFare();
        double fare = rideManager.calculateRideFare(ride);

        RideFareService rideMangerBlack = new UberBlackFareCalculator();
        double fareBlack = rideMangerBlack.calculateRideFare(ride);

        NotificationSenderService notificationSender = new NotificationSender();

        notificationSender.sendNotification(user, "Your ride fare is: $" + fare);
        notificationSender.sendNotification(user, "Your ride fare with Uber Black is: $" + fareBlack);
    }
}