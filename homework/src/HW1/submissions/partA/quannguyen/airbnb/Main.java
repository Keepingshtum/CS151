package airbnb;

public class Main {
    public static void main(String[] args) {
    	Hotel regularHotel = new RegularHotel();
        Hotel luxuryHotel = new LuxuryHotel();
        
        Hotel discountedRegularHotel = new DiscountedHotel(new RegularHotel());
        Hotel discountedLuxuryHotel = new DiscountedHotel(new LuxuryHotel());

        BookingService regularBookingService = new BookingServiceImpl();
        BookingService luxuryBookingService = new BookingServiceImpl();
        
        int regularHotelTotalPrice = regularBookingService.calculateTotalPrice(regularHotel, 3);
        int luxuryHotelTotalPrice = luxuryBookingService.calculateTotalPrice(luxuryHotel, 3);
        int discountedRegularHotelTotalPrice = regularBookingService.calculateTotalPrice(discountedRegularHotel, 3);
        int discountedLuxuryHotelTotalPrice = luxuryBookingService.calculateTotalPrice(discountedLuxuryHotel, 3);
        
        System.out.println("Regular Hotel Total Price: $" + regularHotelTotalPrice);
        System.out.println("Luxury Hotel Total Price: $" + luxuryHotelTotalPrice);
        System.out.println("Discounted Regular Hotel Total Price: $" + discountedRegularHotelTotalPrice);
        System.out.println("Discounted Luxury Hotel Total Price: $" + discountedLuxuryHotelTotalPrice);
    }
}
