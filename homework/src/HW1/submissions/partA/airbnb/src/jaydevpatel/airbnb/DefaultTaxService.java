package jaydevpatel.airbnb;

public class DefaultTaxService implements TaxService {
    @Override
    public double calculateTax(double amount) {
        // Default tax implementation, can be replaced with a more sophisticated one.
        return amount * 0.1; // 10% tax rate
    }
}


