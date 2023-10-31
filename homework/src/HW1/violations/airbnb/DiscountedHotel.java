package HW1.violations.airbnb;

public class DiscountedHotel extends Hotel {
    int calculateTotalPrice(int numberOfNights) {
        return super.calculateTotalPrice(numberOfNights) - 50;
    }
}
