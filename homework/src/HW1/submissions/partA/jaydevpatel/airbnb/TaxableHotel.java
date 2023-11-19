package jaydevpatel.airbnb;
public class TaxableHotel {
    private Hotel baseHotel;
    private TaxService taxService;

    public TaxableHotel(Hotel baseHotel) {
        this.baseHotel = baseHotel;
    }

    public int calculateTotalPrice(int numberOfNights) {

        double totalPrice = baseHotel.calculateTotalPrice(numberOfNights);
        return (int) (totalPrice + taxService.calculateTax(totalPrice));
    }

    // Setter for taxService for dependency injection
    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }
}


