package HW1.submissions.partA.vincentsaw.airbnb;

public class BookingServiceImpl implements BookingService {
    @Override
    public int calculateTotalPrice(Hotel hotel, int numberOfNights) {
        PricingDetermination pd;
        if (hotel instanceof DiscountedHotel) {
            pd = new PricingDiscountedHotel();
        }
        else {
            pd = new PricingHotel();
        }
        int totalPrice = pd.calculateTotalPrice(numberOfNights);
        System.out.println("Discounts on: " + hotel.getDiscountDate());
        return totalPrice;
    }
}
