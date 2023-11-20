package HW1.submissions.partA.vincentsaw.airbnb;

public class DiscountedHotel extends Hotel {
    int calculateTotalPrice(int numberOfNights) {
        return super.calculateTotalPrice(numberOfNights) - 50;
    }
}
