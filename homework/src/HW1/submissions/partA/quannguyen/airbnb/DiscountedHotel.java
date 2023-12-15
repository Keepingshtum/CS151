package airbnb;

public class DiscountedHotel implements Hotel {
    private final Hotel baseHotel;

    public DiscountedHotel(Hotel baseHotel) {
        this.baseHotel = baseHotel;
    }

    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return baseHotel.calculateTotalPrice(numberOfNights) - 50;
    }
}