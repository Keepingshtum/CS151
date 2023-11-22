package HW1.submissions.partA.airbnb;

public class Main {
    public static void main(String[] args){
        HotelInterface regularHotel = new Hotel();
        HotelInterface discountedHotel = new DiscountedHotel();

        BookingService bookingService = new BookingServiceImpl();
        int regularHotelTotalPrice = bookingService.calculateTotalPrice(regularHotel, 3);
        int discountedHotelTotalPrice = bookingService.calculateTotalPrice(discountedHotel, 3);

        System.out.println("Regular Hotel Total Price: $"+regularHotelTotalPrice);
        System.out.println("Discounted Hotel Total Price: $"+discountedHotelTotalPrice);
    }
}
