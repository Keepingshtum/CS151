package airbnb;


public class Main {
    public static void main(String[] args) {
        Hotel regularHotel = new Hotel();
        DiscountedHotel discountedHotel = new DiscountedHotel();

        BookingService bookingService = new BookingServiceImpl();
        int regularHotelTotalPrice = bookingService.calculateTotalPrice(regularHotel, 3);
        double regAndTip = bookingService.totalBill(20);
        System.out.println("Regular Hotel Total Price: $" + regularHotelTotalPrice);
        System.out.println("Regular Hotel Price WITH TAX & TIP: $" + regAndTip);

        int discountedHotelTotalPrice = bookingService.calculateTotalPrice(discountedHotel, 3);
        
        double disAndTip = bookingService.totalBill(30);
        
        System.out.println("Discounted Hotel Total Price: $" + discountedHotelTotalPrice);
        System.out.println("Discounted Hotel Price WITH TAX & TIP: $" + disAndTip);
      
    }
}
