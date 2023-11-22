package HW1.violations.uber;

public class UberHelicopterRideFareCalculator implements RideFare {
    private final double BASE_FARE = 50.0; // Base fare in dollars
    private final double PER_MILE_RATE = 100.0; // Fare per mile in dollars
    private final double PER_MINUTE_RATE = 5.0; // Fare per minute in dollars

    @Override
    public double calculateRideFare(RideInformation ride) {
        double distanceInMiles = ride.getDistanceInMiles();
        int durationInMinutes = ride.getDurationInMinutes();

        // Calculate fare based on distance and time
        double distanceFare = distanceInMiles * PER_MILE_RATE;
        double timeFare = durationInMinutes * PER_MINUTE_RATE;

        // Calculate total fare including base fare
        double totalFare = BASE_FARE + distanceFare + timeFare;

        return totalFare;
    }
}