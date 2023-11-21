package HW1.submissions.partA.airbnb;

public class Hotel implements BookingService {
    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return numberOfNights * 100;
    }
}


