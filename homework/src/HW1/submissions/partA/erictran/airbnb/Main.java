package HW1.submissions.partA.erictran.airbnb;

public class Main {
    public static void main(String[] args) {
        Hotel regularHotel = new Hotel();
        DiscountedHotel discountedHotel = new DiscountedHotel();

        BookingService bookingService = new BookingServiceImpl();
        ExtraFeesService extraFeesService = new ExtraFeesServiceImpl();
        int regularHotelTotalPrice = bookingService.calculateTotalPrice(regularHotel, 3);
        int discountedHotelTotalPrice = bookingService.calculateTotalPrice(discountedHotel, 3);
        int regularHotelExtraGuestsFees = extraFeesService.calculateExtraGuestsFees(regularHotel, 7);
        int discountedHotelExtraGuestsFees = extraFeesService.calculateExtraGuestsFees(discountedHotel, 8);

        System.out.println("Regular Hotel Total Price: $" + regularHotelTotalPrice);
        System.out.println("Discounted Hotel Total Price: $" + discountedHotelTotalPrice);
        System.out.println("Regular Hotel Extra Guests Fees: $" + regularHotelExtraGuestsFees);
        System.out.println("Discounted Hotel Extra Guests Fees: $" + discountedHotelExtraGuestsFees);
    }
}