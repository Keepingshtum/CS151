package HW1.submissions.partA.erictran.uber;

public class Main {
    public static void main(String[] args) {
        Ride ride = new Ride(1,1);
        User user = new User();
        user.setUsername("john_doe");

        RideCalculator rideCalculator = new RideCalculator();
        NotificationManager notificationManager = new NotificationManager();
        PaymentManager paymentManager = new PaymentManager();

        double fare = rideCalculator.calculateRideFare(ride);
        notificationManager.sendNotification(user, "Your ride fare is: $" + fare);
        paymentManager.processPayment(user, fare);
    }
}