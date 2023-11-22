package airbnb;

public class BookingServiceImpl implements BookingService {
    int totalCost = 0;
    
    @Override
    public int calculateTotalPrice(Hotel hotel, int numberOfNights) {
        totalCost = 0;
        int totalPrice = hotel.calculateTotalPrice(numberOfNights);
        totalCost += totalPrice;
        return totalPrice;
    }
    
    @Override
	public double totalBill(int tip) { 
    	//total cost + tax (because 7.25% is california's hotel tax) + tip amount you want to put)
		return totalCost + (totalCost*0.0725) + tip;
	}
    
}