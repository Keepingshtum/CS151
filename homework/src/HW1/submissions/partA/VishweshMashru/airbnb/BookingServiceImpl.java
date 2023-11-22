package HW1.violations.airbnb;

public class BookingServiceImpl implements BookingService {
    @Override
    public int calculateTotalPrice(HotellInterface hotel, int numberOfNights) {
        int totalPrice = hotel.calculateTotalPrice(numberOfNights);
        return totalPrice;
    }

    @Override
    public double caculateAmenitiesCost(HotellInterface hotel, int numberOfNights) {
        // TODO Auto-generated method stub
        return (calculateTotalPrice(hotel, numberOfNights) / 50);
    }
}
