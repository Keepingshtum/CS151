package HW1.submissions.partA.williamtran.airbnb;

public class BookingServiceImpl implements BookingService {
    @Override
    public int calculateTotalPrice(Hotel hotel, int numberOfNights) {
        int totalPrice = hotel.calculateTotalPrice(numberOfNights);
        return totalPrice;
    }
}
