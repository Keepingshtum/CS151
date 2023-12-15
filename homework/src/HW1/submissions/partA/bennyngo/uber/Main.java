package HW1.submissions.partA.bennyngo.uber;

public class Main {
    public static void main(String[] args) {
        Ride ride = new RideImpl(1,1);
        UserImpl user = new UserImpl("john_doe");

        RideFareCalculator rideManager = new RideFare();
        double fare = rideManager.calculateRideFare(ride);

        RideFareCalculator rideMangerXL = new UberXLFareCalculator();
        double fareXL = rideMangerXL.calculateRideFare(ride);

        NotificationSender notificationSender = new NotiSend();

        notificationSender.sendNotification(user, "Your ride fare is: $" + fare);
        notificationSender.sendNotification(user, "Your ride fare with UberXL is: $" + fareXL);
    }
}