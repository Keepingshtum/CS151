package uber;

public class Main {
    public static void main(String[] args) {
        Ride ride = new Ride(1, 1);
        User user = new User();
        user.setUsername("john_doe");

        Calculator defaultFareCalculator = new FareCalculator();
        double fare = defaultFareCalculator.calculate(ride);

        Calculator promotionalFareCalculator = new DiscountFareCalculator();
        double discountFare = promotionalFareCalculator.calculate(ride);

        Notifier notificationManager = new NotificationService();

        notificationManager.sendNotification(user, "Your ride fare is: $" + fare);
        notificationManager.sendNotification(user, "Your ride fare after 2% discount is: $" + discountFare);
    }
}
