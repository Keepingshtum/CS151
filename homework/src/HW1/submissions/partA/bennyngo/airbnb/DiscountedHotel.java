package HW1.submissions.partA.bennyngo.airbnb;

public class DiscountedHotel implements PriceHotel {
    private final PriceHotel priceHotel;

    public DiscountedHotel(PriceHotel priceHotel) {
        this.priceHotel = priceHotel;
    }

    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return priceHotel.calculateTotalPrice(numberOfNights) - 50;
    }
}
