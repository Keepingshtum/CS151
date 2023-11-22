package HW1.submissions.partA.simontruong.airbnb;

public class Hotel implements BookingService {
    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return numberOfNights * 100;
    }
}


