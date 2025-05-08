package doordash;

public interface DeliveryService {

	void deliverFood(Restaurant restaurant, Customer customer);
	
	void cancelDelivery(Restaurant restaurant, Customer customer);
}
