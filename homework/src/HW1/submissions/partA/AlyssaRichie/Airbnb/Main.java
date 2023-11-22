package alyssarichie.Airbnb;

public class Main {
    public static void main(String[] args) {
        Hotel regularHotel = new Hotel();
        Hotel discountHotel = new Hotel();
        BookingServiceDiscount discountedHotelService = new DiscountedHotel();
        BookingService bookingService = new BookingServiceImpl();

        int regularHotelTotalPrice = bookingService.calculateTotalPrice(regularHotel, 3);
        int discountedHotelTotalPrice = (int) discountedHotelService.calculateTotalPriceDis_Help(discountHotel, 3);

        System.out.println("Regular Hotel Total Price: $" + regularHotelTotalPrice);
        System.out.println("Discounted Hotel Total Price: $" + discountedHotelTotalPrice);
        System.out.println("Before tax on the discounted Hotel: $" + discountedHotelService.calculatePreTax(discountHotel, 3));
    }
}