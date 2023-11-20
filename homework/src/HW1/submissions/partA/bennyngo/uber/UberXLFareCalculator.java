package HW1.submissions.partA.bennyngo.uber;

public class UberXLFareCalculator implements RideFareCalculator {
    private final double BASE_FARE = 5.0; // Base fare in dollars
    private final double PER_MILE_RATE = 2.0; // Fare per mile in dollars
    private final double PER_MINUTE_RATE = 0.5; // Fare per minute in dollars

    private final double UBERXL_FARE_RATE_PERCENTAGE = 0.39; // 39% increase in fare

    @Override

    public double calculateRideFare(Ride ride) {
        double distanceInMiles = ride.getDistanceInMiles();
        int durationInMinutes = ride.getDurationInMinutes();

        // Calculate fare based on distance and time
        double distanceFare = distanceInMiles * PER_MILE_RATE;
        double timeFare = durationInMinutes * PER_MINUTE_RATE;
        double uberXLFare = distanceInMiles * UBERXL_FARE_RATE_PERCENTAGE;

        // Calculate total fare including base fare
        double totalFare = BASE_FARE + distanceFare + timeFare + uberXLFare;

        return totalFare;
    }
}
