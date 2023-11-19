package jaydevpatel.airbnb;

public class BookingServiceImpl implements BookingService {
    @Override
    public int calculateTotalPrice(Hotel hotel, int numberOfNights) {
        return hotel.calculateTotalPrice(numberOfNights);
    }

    @Override
    public double calculateTotalPriceWithTax(TaxableHotel hotel, int numberOfNights) {
        return hotel.calculateTotalPrice(numberOfNights);
    }
}

