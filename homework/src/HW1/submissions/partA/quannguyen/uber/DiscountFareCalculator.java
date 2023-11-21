package uber;

public class DiscountFareCalculator implements Calculator {
    private final double BASE_FARE = 5.0;
    private final double PER_MILE_RATE = 2.0;
    private final double PER_MINUTE_RATE = 0.5;
    private final double PROMOTIONAL_DISCOUNT_PERCENTAGE = 0.02; // 2% discount

    @Override
    public double calculate(Ride ride) {
        double distanceInMiles = ride.getDistanceInMiles();
        int durationInMinutes = ride.getDurationInMinutes();

        double distanceFare = distanceInMiles * PER_MILE_RATE;
        double timeFare = durationInMinutes * PER_MINUTE_RATE;
        double promotionalDiscount = (distanceFare + timeFare) * PROMOTIONAL_DISCOUNT_PERCENTAGE;

        return BASE_FARE + distanceFare + timeFare - promotionalDiscount;
    }
}
