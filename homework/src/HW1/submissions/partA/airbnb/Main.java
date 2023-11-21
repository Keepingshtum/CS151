package HW1.submissions.partA.airbnb;

public class Main {
    private BookingService hotel;

    void setHotel(BookingService hotel) {
        this.hotel = hotel;
    }

    int calculateCost(int numberOfNights) {
        int value = hotel.calculateTotalPrice(numberOfNights);
        return value;
    }
    public static void main(String[] args) {

        Main main = new Main();
        Hotel regularHotel = new Hotel();
        DiscountedHotel discountedHotel = new DiscountedHotel();

        main.setHotel(regularHotel);
        int regularHotelTotalPrice = main.calculateCost(3);
        main.setHotel(discountedHotel);
        int discountedHotelTotalPrice = main.calculateCost(3);

        System.out.println("Regular Hotel Total Price: $" + regularHotelTotalPrice);
        System.out.println("Discounted Hotel Total Price: $" + discountedHotelTotalPrice);
    }
}