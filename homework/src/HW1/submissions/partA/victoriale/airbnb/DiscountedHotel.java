package HW1.submissions.partA.victoriale.airbnb;

public class DiscountedHotel implements Hotel {
    public int calculateTotalPrice(int numberOfNights) {
        return  (numberOfNights * 100) - 50;
    }
}
