package HW1.submissions.partA.bennyngo.airbnb;

public class BookingServiceImpl implements BookingService {
    @Override
    public int calculateTotalPrice(PriceHotel hotel, int numberOfNights) {
        int totalPrice = hotel.calculateTotalPrice(numberOfNights);
        return totalPrice;
    }
}
