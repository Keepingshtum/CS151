package airbnb;

public class RegularHotel implements Hotel {
    @Override
    public int calculateTotalPrice(int numberOfNights) {
        return numberOfNights * 100;
    }
}