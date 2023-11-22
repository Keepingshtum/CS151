package HW1.violations.airbnb;

public class BookingServiceImpl implements BookingService {
    @Override
    public int calculateTotalPrice(Hotel hotel, int numberOfNights) {
        int totalPrice = hotel.pricePerNight * numberOfNights;
        return totalPrice;
    }
}
