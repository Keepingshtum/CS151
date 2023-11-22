package HW1.submissions.partA.uber;

public class Ride {
    private double distanceInMiles;
    private int durationInMinutes;

    public Ride(double distanceInMiles, int durationInMinutes){
        this.distanceInMiles = distanceInMiles;
        this.durationInMinutes = durationInMinutes;
    }

    public void setDistanceInMiles(double distanceInMiles){this.distanceInMiles = distanceInMiles;}
    public void setDurationInMinutes(int durationInMinutes){this.durationInMinutes = durationInMinutes;}
    public double getDistanceInMiles(){return distanceInMiles;}
    public int getDurationInMinutes(){return durationInMinutes;}
}
