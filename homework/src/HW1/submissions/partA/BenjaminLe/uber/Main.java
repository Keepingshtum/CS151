package uber;

public class Main {
    public static void main(String[] args) {
        Ride ride = new Ride(1,1);
        User user = new User();
        user.setUsername("john_doe");

        RideManager rideManager = new RideManager();
        
        deluxeRideManager delRideManager = new deluxeRideManager();

        double fare = rideManager.calculateRideFare(ride);
        double deluxeFare =  delRideManager.calculateRideFare(ride);

        rideManager.sendNotification(user, "Your ride fare is: $" + fare);
        delRideManager.sendNotification(user, "Your deluxe ride fare is: $" + deluxeFare);
    }
}