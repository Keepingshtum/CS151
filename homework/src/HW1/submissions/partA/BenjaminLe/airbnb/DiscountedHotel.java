package airbnb;

public class DiscountedHotel extends Hotel {
	
	@Override
    public int calculateTotalPrice(int numberOfNights) {
    	
    	/*by turning the super method into numberOfNights * 100
    	 * we ensure that this method still functions by itself even
    	 * if the hotel class were to disappear since we've overriden 
    	 * its functionality
    	 */
        return numberOfNights * 100 - 50;
    }
}