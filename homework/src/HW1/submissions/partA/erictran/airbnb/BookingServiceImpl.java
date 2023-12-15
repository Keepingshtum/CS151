package HW1.submissions.partA.erictran.airbnb;

public class BookingServiceImpl implements BookingService {
    @Override
    public int calculateTotalPrice(Hotel hotel, int numberOfNights) {
        int totalPrice = hotel.calculateTotalPrice(numberOfNights);
        if (hotel instanceof DiscountedHotel) {
            totalPrice -= 50;
        }
        return totalPrice;
    }
}