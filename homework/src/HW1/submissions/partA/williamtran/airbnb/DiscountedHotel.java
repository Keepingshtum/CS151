package HW1.submissions.partA.williamtran.airbnb;

public class DiscountedHotel implements Hotel {

    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return numberOfNights * 50;
    }
}
