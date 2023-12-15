package HW1.submissions.partA.vincentsaw.airbnb;

public class Main {
    public static void main(String[] args) {
        Hotel regularHotel = new Hotel();
        DiscountedHotel discountedHotel = new DiscountedHotel();

        discountedHotel.setDiscountDate("11/21");

        BookingService bookingService = new BookingServiceImpl();

        System.out.println("Regular Hotel Total Price: $" + bookingService.calculateTotalPrice(regularHotel, 3));
        System.out.println("Discounted Hotel Total Price: $" + bookingService.calculateTotalPrice(discountedHotel, 3));
    }
}