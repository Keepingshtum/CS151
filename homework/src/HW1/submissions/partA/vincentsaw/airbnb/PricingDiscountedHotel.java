package HW1.submissions.partA.vincentsaw.airbnb;

public class PricingDiscountedHotel implements PricingDetermination {
    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return numberOfNights * 100 - 50;
    }
}
