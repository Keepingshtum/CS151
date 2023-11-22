package HW1.submissions.partA.mikechau.uber;

public class UberBlackFareCalculator implements RideFareService {
    private final double BASE_FARE = 5.0; // Base fare in dollars
    private final double PER_MILE_RATE = 2.0; // Fare per mile in dollars
    private final double PER_MINUTE_RATE = 0.5; // Fare per minute in dollars
    private final double UBER_BLACK_RATE = 1.5; // Increase in price by %

    @Override
    public double calculateRideFare(RideImpl ride) {
        double distanceInMiles = ride.getDistanceInMiles();
        int durationInMinutes = ride.getDurationInMinutes();

        // Calculate fare based on distance and time
        double distanceFare = distanceInMiles * PER_MILE_RATE;
        double timeFare = durationInMinutes * PER_MINUTE_RATE;

        // Calculate total fare including base fare
        double totalFare = (BASE_FARE + distanceFare + timeFare) * UBER_BLACK_RATE;
        
        return totalFare;
    }
}
