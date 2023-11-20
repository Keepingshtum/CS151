package HW1.submissions.partA.bennyngo.airbnb;

public class Main {
    public static void main(String[] args) {
        Hotel regularHotel = new Hotel();
        DiscountedHotel discountedHotel = new DiscountedHotel(new Hotel());
        VIPHotel vipHotel = new VIPHotel();
        DiscountedHotel discountedVipHotel = new DiscountedHotel(new VIPHotel());

        BookingService bookingService = new BookingServiceImpl();

        int regularHotelTotalPrice = bookingService.calculateTotalPrice(regularHotel, 3);
        int discountedHotelTotalPrice = bookingService.calculateTotalPrice(discountedHotel, 3);
        int vipHotelTotalPrice = bookingService.calculateTotalPrice(vipHotel, 3);
        int discountedVipHotelTotalPrice = bookingService.calculateTotalPrice(discountedVipHotel, 3);

        System.out.println("Regular Hotel Total Price: $" + regularHotelTotalPrice);
        System.out.println("Discounted Hotel Total Price: $" + discountedHotelTotalPrice);
        System.out.println("VIP Hotel Total Price: $" + vipHotelTotalPrice);
        System.out.println("Discounted VIP Hotel Total Price: $" + discountedVipHotelTotalPrice);
    }
}