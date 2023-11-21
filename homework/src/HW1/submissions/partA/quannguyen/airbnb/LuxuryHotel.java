package airbnb;

public class LuxuryHotel implements Hotel {
	@Override
    public int calculateTotalPrice(int numberOfNights) {
        return numberOfNights * 300;
	}
}
