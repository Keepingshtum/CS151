package HW1.submissions.partA.mikechau.airbnb;

public class LuxuryHotel implements Price{
    @Override
    public int calculateTotalPrice(int numberOfNights){
        return numberOfNights * 200;
    }
}
