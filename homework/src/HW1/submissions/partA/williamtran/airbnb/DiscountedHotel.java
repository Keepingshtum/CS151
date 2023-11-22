package HW1.submissions.partA.williamtran.airbnb;

public class DiscountedHotel extends Hotel {
    int calculateTotalPrice(int numberOfNights) {
        return super.calculateTotalPrice(numberOfNights) - 50;
    }
}
