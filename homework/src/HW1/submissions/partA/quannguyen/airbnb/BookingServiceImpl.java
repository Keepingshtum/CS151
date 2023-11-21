package airbnb;

public class BookingServiceImpl implements BookingService {
    @Override
    public int calculateTotalPrice(Hotel hotel, int numberOfNights) {
    	 return hotel.calculateTotalPrice(numberOfNights);
    }
}