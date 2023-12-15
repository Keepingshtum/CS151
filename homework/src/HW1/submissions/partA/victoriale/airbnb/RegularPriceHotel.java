package HW1.submissions.partA.victoriale.airbnb;

public class RegularPriceHotel implements Hotel{
    public int calculateTotalPrice(int numberOfNights) {
        return  numberOfNights * 100;
    }
}
