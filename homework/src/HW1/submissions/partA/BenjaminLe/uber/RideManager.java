package uber;

class RideManager implements carRideCost {
    private final double BASE_FARE = 5.0; // Base fare in dollars
    private final double PER_MILE_RATE = 2.0; // Fare per mile in dollars
    private final double PER_MINUTE_RATE = 0.5; // Fare per minute in dollars

    public double calculateRideFare(Ride ride) {
        double distanceInMiles = ride.getDistanceInMiles();
        int durationInMinutes = ride.getDurationInMinutes();

        // Calculate fare based on distance and time
        double distanceFare = distanceInMiles * PER_MILE_RATE;
        double timeFare = durationInMinutes * PER_MINUTE_RATE;

        // Calculate total fare including base fare
        double totalFare = BASE_FARE + distanceFare + timeFare;

        return totalFare;
    }

    void sendNotification(User user, String message) {
        // Code for sending notifications to the user
        System.out.println("Notification sent to user: " + user.getUsername() + " - " + message);
    }
}


class deluxeRideManager implements carRideCost {
    private final double BASE_FARE = 10.0; // Base fare in dollars
    private final double PER_MILE_RATE = 4.0; // Fare per mile in dollars
    private final double PER_MINUTE_RATE = 1.0; // Fare per minute in dollars
    
    //deluxe just cost a bunch more money but since we're implementing from carRideCost
    // ->I'm still following the open-closed principle since I don't have ot modify the RideManager Class anymore

    public double calculateRideFare(Ride ride) {
        double distanceInMiles = ride.getDistanceInMiles();
        int durationInMinutes = ride.getDurationInMinutes();

        // Calculate fare based on distance and time
        double distanceFare = distanceInMiles * PER_MILE_RATE;
        double timeFare = durationInMinutes * PER_MINUTE_RATE;

        // Calculate total fare including base fare
        double totalFare = BASE_FARE + distanceFare + timeFare;

        return totalFare*2;
    }

    void sendNotification(User user, String message) {
        // Code for sending notifications to the user
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


