package HW1.violations.airbnb;

public class Hotel implements HotellInterface {

    public int calculateTotalPrice(int numberOfNights) {
        return numberOfNights * 100;
    }

}
