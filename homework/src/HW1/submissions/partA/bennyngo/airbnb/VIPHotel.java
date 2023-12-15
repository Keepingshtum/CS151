package HW1.submissions.partA.bennyngo.airbnb;

public class VIPHotel implements PriceHotel {
    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return numberOfNights * 150;
    }
}
