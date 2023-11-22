package alyssarichie.Airbnb;
public class DiscountedHotel implements BookingServiceDiscount {

    private double preTaxPrice;

    private double taxrate = 0.09;

    @Override
    public double calculateTotalPriceDis_Help(Hotel hotel, int numberOfNights) {
        return hotel.calculateTotalPrice(numberOfNights) - 50;
    }


    //Tax is 9% for simplicity
    @Override
    public double calculatePreTax(Hotel hotel, int number) {
        preTaxPrice = calculateTotalPriceDis_Help(hotel, number) - (((calculateTotalPriceDis_Help(hotel, number) / (1 + taxrate)) * taxrate));
        return preTaxPrice;
    }

}
