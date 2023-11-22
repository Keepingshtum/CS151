package HW1.violations.airbnb;

public class DiscountedHotel implements HotellInterface {
    private Hotel hotel;

    public DiscountedHotel(Hotel h) {
        this.hotel = h;
    }

    @Override
    public int calculateTotalPrice(int numberOfNights) {
        int price = hotel.calculateTotalPrice(numberOfNights) - 50;
        return price;
    }

}
