package jaydevpatel.airbnb;

public class Main {
    public static void main(String[] args) {
        Hotel regularHotel = new Hotel();
        DiscountedHotel discountedHotel = new DiscountedHotel();
        TaxableHotel taxableHotel = new TaxableHotel(regularHotel);
        taxableHotel.setTaxService(new DefaultTaxService());

        BookingService bookingService = new BookingServiceImpl();
        int regularHotelTotalPrice = bookingService.calculateTotalPrice(regularHotel, 3);
        int discountedHotelTotalPrice = bookingService.calculateTotalPrice(discountedHotel, 3);
        double taxableHotelTotalPriceWithTax = bookingService.calculateTotalPriceWithTax(taxableHotel, 3);

        System.out.println("Regular Hotel Total Price: $" + regularHotelTotalPrice);
        System.out.println("Discounted Hotel Total Price: $" + discountedHotelTotalPrice);
        System.out.println("Taxable Hotel Total Price with Tax: $" + taxableHotelTotalPriceWithTax);
    }
}