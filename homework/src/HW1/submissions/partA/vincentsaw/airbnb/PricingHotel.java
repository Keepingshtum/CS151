package HW1.submissions.partA.vincentsaw.airbnb;

public class PricingHotel implements PricingDetermination {
    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return numberOfNights * 100;
    }
}