package HW1.submissions.partA.williamtran.airbnb;

public class NormalHotel implements Hotel{
    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return numberOfNights * 100;
    }
}


