package HW1.submissions.partA.mikechau.airbnb;

public class DiscountedHotel implements Price {
    private Hotel basePriceHotel;

    public DiscountedHotel(Hotel hotel) {
        this.basePriceHotel = hotel;
    }

    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return basePriceHotel.calculateTotalPrice(numberOfNights) - 50;
    }
}