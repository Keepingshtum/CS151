package HW1.submissions.partA.mikechau.airbnb;

public class Hotel implements Price{
    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return numberOfNights * 100;
    }
}


