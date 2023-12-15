package HW1.submissions.partA.mikechau.uber;

public class RideImpl implements Ride {
    private double distanceInMiles;
    private int durationInMinutes;
     
    public RideImpl(double distanceInMiles, int durationInMinutes) {
        this.distanceInMiles = distanceInMiles;
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public double getDistanceInMiles() {
        return distanceInMiles;
    }

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
