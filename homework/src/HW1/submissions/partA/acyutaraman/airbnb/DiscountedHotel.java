package airbnb;

public class DiscountedHotel implements Hotel {
	
	@Override
    public int calculateTotalPrice(int numberOfNights) {
        return 100*numberOfNights - 50;
    }
}