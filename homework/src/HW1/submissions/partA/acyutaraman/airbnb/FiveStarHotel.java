package airbnb;

public class FiveStarHotel implements Hotel {

	@Override
	public int calculateTotalPrice(int numberOfNights) {
		return 200*numberOfNights;
	}

}
