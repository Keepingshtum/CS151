package HW1.submissions.partA.vincentsaw.uber;

public class RideManager {
    NotificationManager nm;
    RideCalculator rc;

    RideManager() {
        nm = new NotificationManager();
        rc = new RideCalculator();
    }

    //Additional function
    void notifyUserRideFare(User u, Ride r) {
        double fare;
        fare = rc.calculateRideFare(r);
        nm.sendNotification(u, "Your ride fare is: $" + fare);
    }
}


