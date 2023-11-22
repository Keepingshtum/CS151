package HW1.submissions.partA.uber;

public class Main {
    public static void main(String[] args){
        Ride ride = new Ride(10, 20);
        User user = new User();
        user.setUsername("John Doe");

        RideNotificationManager rideNotificationManager = new RideNotificationManager();
        RideFareManager rideFareManager = new RideFareManager();

        double fare = rideFareManager.calculateFare(ride);
        rideNotificationManager.sendNotification(user, "Your ride fare is: "+fare);
    }
}
