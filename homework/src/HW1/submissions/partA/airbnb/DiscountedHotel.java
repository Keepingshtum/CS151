package HW1.submissions.partA.airbnb;

public class DiscountedHotel implements HotelInterface{
    @Override
    public int calculateTotalPrice(int numberOfNights){
        return numberOfNights*50;
    }
}
