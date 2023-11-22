package HW1.submissions.partA.airbnb;

public class BookingServiceImpl implements BookingService{
    @Override
    public int calculateTotalPrice(HotelInterface hotel, int numberOfNights){
        int totalPrice = hotel.calculateTotalPrice(numberOfNights);
        return totalPrice;
    }
}
