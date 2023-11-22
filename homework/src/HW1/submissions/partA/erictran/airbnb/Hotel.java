package HW1.submissions.partA.erictran.airbnb;

public class Hotel {
    int calculateTotalPrice(int numberOfNights) {
        return numberOfNights * 100;
    }

    int calculateExtraGuestsFees(int numberOfGuests) {
        if (numberOfGuests > 6) {
            return (numberOfGuests - 6) * 30;
        }
        return 0;
    }
}