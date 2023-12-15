package airbnb;

public class Main {
    public static void main(String[] args) {
        Hotel regularHotel = new RegularHotel();
        Hotel discountedHotel = new DiscountedHotel();
        Hotel fiveStarHotel = new FiveStarHotel();
        
        BookingService bookingService = new BookingServiceImpl();
        int regularHotelTotalPrice = bookingService.calculateTotalPrice(regularHotel, 3);
        int discountedHotelTotalPrice = bookingService.calculateTotalPrice(discountedHotel, 3);
        int fiveStarHotelTotalPrice = bookingService.calculateTotalPrice(fiveStarHotel, 3);

        System.out.println("Regular Hotel Total Price: $" + regularHotelTotalPrice);
        System.out.println("Discounted Hotel Total Price: $" + discountedHotelTotalPrice);
        System.out.println("Five Star Hotel Total Price: $" + fiveStarHotelTotalPrice);
        
        
        
    }
}