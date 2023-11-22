package HW1.violations.airbnb;

public interface BookingService {
    int calculateTotalPrice(HotellInterface hotel, int numberOfNights);

    double caculateAmenitiesCost(HotellInterface hotel, int numberOfNights);
}
