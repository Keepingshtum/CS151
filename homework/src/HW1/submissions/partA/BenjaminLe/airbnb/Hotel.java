package airbnb;

public class Hotel implements hotelPrices{
	
	
	
	@Override
    public int calculateTotalPrice(int numberOfNights) {
		
        return numberOfNights * 100;
    }
	

}