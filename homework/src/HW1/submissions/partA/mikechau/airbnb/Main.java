package HW1.submissions.partA.mikechau.airbnb;

public class Main {
    public static void main(String[] args) {
        Hotel regularHotel = new Hotel();
        DiscountedHotel discountedHotel = new DiscountedHotel(new Hotel());
        LuxuryHotel luxuryHotel = new LuxuryHotel();

        BookingService bookingService = new BookingServiceImpl();
        int regularHotelTotalPrice = bookingService.calculateTotalPrice(regularHotel, 3);
        int discountedHotelTotalPrice = bookingService.calculateTotalPrice(discountedHotel, 3);
        int luxuryHotelTotalPrice = bookingService.calculateTotalPrice(luxuryHotel, 3);

        System.out.println("Regular Hotel Total Price: $" + regularHotelTotalPrice);
        System.out.println("Discounted Hotel Total Price: $" + discountedHotelTotalPrice);
        System.out.println("Luxury Hotel Total Price: $" + luxuryHotelTotalPrice);
    }
}