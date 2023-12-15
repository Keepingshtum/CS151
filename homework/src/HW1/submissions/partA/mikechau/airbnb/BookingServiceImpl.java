package HW1.submissions.partA.mikechau.airbnb;

public class BookingServiceImpl implements BookingService {
    @Override
    public int calculateTotalPrice(Price hotel, int numberOfNights) {
        int totalPrice = hotel.calculateTotalPrice(numberOfNights);
        return totalPrice;
    }
}
