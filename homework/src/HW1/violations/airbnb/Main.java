package HW1.violations.airbnb;

public class Main {

    // this class violates the liksov substitution principle
    // because the class Hotel and DiscountedHotel cannot be directly substituted in
    // the discountedHotels method
    // if done so then Hotel will have a non discounted price even though it should
    // have a discounted price
    public static void main(String[] args) {
        Hotel regularHotel = new Hotel();
        DiscountedHotel discountedHotel = new DiscountedHotel(regularHotel);

        BookingService bookingService = new BookingServiceImpl();
        int regularHotelTotalPrice = bookingService.calculateTotalPrice(regularHotel, 3);
        int discountedHotelTotalPrice = bookingService.calculateTotalPrice(discountedHotel, 3);

        // added
        int HotelTotalPrice = bookingService.calculateTotalPrice(regularHotel, 3);
        int amenities = bookingService.caculateAmenitiesCost(discountedHotel, 3);

        System.out.println(amenities);

        System.out.println("Regular Hotel Total Price: $" + regularHotelTotalPrice);
        System.out.println("Discounted Hotel Total Price: $" + discountedHotelTotalPrice);

        // added
        System.out.println("Discounted Hotel Total Price: $" + HotelTotalPrice);
    }
}