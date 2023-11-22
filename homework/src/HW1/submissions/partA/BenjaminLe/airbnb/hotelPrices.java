package airbnb;

public interface hotelPrices {
	/*this way we enforce the open/closed principle since 
	 * the initial calculateTotalPrice is closed from modification
	 * but open to modification if we want to find out the prices from
	 * different hotel types.
	 */
	int calculateTotalPrice(int numberOfNights);
	
}