package partA.jaydevpatel.airbnb;

public interface BookingService {
    int calculateTotalPrice(Hotel hotel, int numberOfNights);

    double calculateTotalPriceWithTax(TaxableHotel hotel, int numberOfNights);
}



