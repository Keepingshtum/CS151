package HW1.violations.uber;

public class Main {
    public static void main(String[] args) {
        RideInformation ride = new RideInformation(1,1);
        UserAccount user = new UserAccount();
        user.setUsername("john_doe");

        RideFareCalculator rideManager = new RideFareCalculator();
        UberHelicopterRideFareCalculator UHRFC = new UberHelicopterRideFareCalculator();
        NotificationManager notificationManager = new NotificationManager();
        double fare = rideManager.calculateRideFare(ride);

        double hFare = UHRFC.calculateRideFare(ride);
        notificationManager.sendNotification(user, "Your ride fare is: $" + fare);
        
        notificationManager.sendNotification(user, "Your ride fare for the Uber Helicopter is: $" + hFare);
    }
}