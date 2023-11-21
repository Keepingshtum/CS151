package uber;

public class RideManager {
    private final Calculator fareCalculator;
    private final Notifier notificationService;

    public RideManager(Calculator fareCalculator, Notifier notificationService) {
        this.fareCalculator = fareCalculator;
        this.notificationService = notificationService;
    }

    double calculateRideFare(Ride ride) {
        return fareCalculator.calculate(ride);
    }

    void sendNotification(User user, String message) {
        notificationService.sendNotification(user, message);
    }
}

class Ride {
    private double distanceInMiles;
    private int durationInMinutes;

    public Ride(double distanceInMiles, int durationInMinutes) {
        this.distanceInMiles = distanceInMiles;
        this.durationInMinutes = durationInMinutes;
    }

    public double getDistanceInMiles() {
        return distanceInMiles;
    }

    public void setDistanceInMiles(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

}

class User {
    // User details
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
