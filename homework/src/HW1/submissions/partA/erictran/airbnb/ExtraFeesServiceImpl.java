package HW1.submissions.partA.erictran.airbnb;

public class ExtraFeesServiceImpl implements ExtraFeesService{
    @Override
    public int calculateExtraGuestsFees(Hotel hotel, int numberOfGuests) {
        return hotel.calculateExtraGuestsFees(numberOfGuests);
    }
}