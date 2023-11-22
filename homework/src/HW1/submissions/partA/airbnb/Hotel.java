package HW1.submissions.partA.airbnb;

public class Hotel implements HotelInterface{
    @Override
    public int calculateTotalPrice(int numberOfNights){
        return numberOfNights*100;
    }
}
