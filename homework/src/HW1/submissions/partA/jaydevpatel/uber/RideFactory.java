package partA.jaydevpatel.uber;

public class RideFactory {
    public static Ride createRide(double startLatitude, double startLongitude) {
        return new Ride(startLatitude, startLongitude);
    }
}
