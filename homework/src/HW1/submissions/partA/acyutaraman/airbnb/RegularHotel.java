package airbnb;

public class RegularHotel implements Hotel{

	@Override
	public int calculateTotalPrice(int numberOfNights) {

		return 100*numberOfNights;
	}

}
