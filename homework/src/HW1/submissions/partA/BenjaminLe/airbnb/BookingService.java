package airbnb;

public interface BookingService {
    int calculateTotalPrice(Hotel hotel, int numberOfNights);
    
    double totalBill(int tip);
}

