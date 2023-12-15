package HW1.violations.uber;

interface FareCalculator {
    double calculateRideFare(Ride ride);
}

class StandardFareCalculator implements FareCalculator {
    private final double BASE_FARE = 5.0;
    private final double PER_MILE_RATE = 2.0;
    private final double PER_MINUTE_RATE = 0.5;

    @Override
    public double calculateRideFare(Ride ride) {
        double distanceInMiles = ride.getDistanceInMiles();
        int durationInMinutes = ride.getDurationInMinutes();

        double distanceFare = distanceInMiles * PER_MILE_RATE;
        double timeFare = durationInMinutes * PER_MINUTE_RATE;

        return BASE_FARE + distanceFare + timeFare;
    }

    // Generate a ride summary
    String generateRideSummary(Ride ride) {
        double totalFare = calculateRideFare(ride);

        // Build the ride summary
        StringBuilder summary = new StringBuilder();
        summary.append("Ride Summary\n");
        summary.append("Distance: ").append(ride.getDistanceInMiles()).append(" miles\n");
        summary.append("Duration: ").append(ride.getDurationInMinutes()).append(" minutes\n");
        summary.append("Total Fare: $").append(totalFare);

        return summary.toString();
    }
}

class RideManager {
    private FareCalculator fareCalculator;

    RideManager(FareCalculator fareCalculator) {
        this.fareCalculator = fareCalculator;
    }

    double calculateRideFare(Ride ride) {
        return fareCalculator.calculateRideFare(ride);
    }

}

// Rest of the existing classes remain unchanged
class NotificationManager {
    void sendNotification(User user, String message) {
        System.out.println("Notification sent to user: " + user.getUsername() + " - " + message);
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
