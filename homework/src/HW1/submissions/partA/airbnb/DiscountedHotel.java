package HW1.submissions.partA.airbnb;

public class DiscountedHotel implements BookingService {
    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return (numberOfNights * 100) - 50;
    }
}
