package HW1.submissions.partA.airbnb;

public class DiscountedHotel extends Hotel {
    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return (numberOfNights * 100) - 50;
    }
}
