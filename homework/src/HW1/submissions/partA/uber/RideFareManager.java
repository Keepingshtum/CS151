package HW1.submissions.partA.uber;

public class RideFareManager{
    private final double BASE_FARE = 5.0;
    private final double PER_MILE_FARE = 2.0;
    private final double PER_MINUTE_FARE = 0.5;

    public double calculateFare(Ride ride){
        double distanceInMiles = ride.getDistanceInMiles();
        int durationInMinutes = ride.getDurationInMinutes();

        double distanceFare = distanceInMiles * PER_MILE_FARE;
        double durationFare = durationInMinutes * PER_MINUTE_FARE;

        double totalFare = BASE_FARE + distanceFare + durationFare;

        return totalFare;
    }
}
