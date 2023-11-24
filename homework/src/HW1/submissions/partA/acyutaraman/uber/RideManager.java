package uber;

import java.util.Stack;

class RideManager {
    private final double BASE_FARE = 5.0; // Base fare in dollars
    private final double PER_MILE_RATE = 2.0; // Fare per mile in dollars
    private final double PER_MINUTE_RATE = 0.5; // Fare per minute in dollars

    RideCalculator rd = new RideCalculator(BASE_FARE, PER_MILE_RATE, PER_MINUTE_RATE);
    NotificationSender nf = new NotificationSender();
    double calculateRideFare(Ride ride) {
        return rd.calculateRideFare(ride);
    }

    void sendNotification(User user, String message) {
        // Code for sending notifications to the user
    	
    	nf.sendNotification(user, message);
    }
    
    
   
}

class NotificationSender {
	
	void sendNotification(User user, String message)
	{
		user.addMessage(message);
        System.out.println("Notification sent to user: " + user.getUsername() + " - " + message);
	}		
}

class RideCalculator {
	
	double base;
	double milerate;
	double minuterate;
	
	public RideCalculator(double base, double milerate, double minuterate)
	{
		this.base = base;
		this.milerate = milerate;
		this.minuterate = minuterate;
	}
	
	public double calculateRideFare(Ride ride)
	{
		
		
		return base + milerate * ride.getDistanceInMiles() + minuterate*ride.getDurationInMinutes();
	}
	
	
	
	
	
}
class Ride {
    private double distanceInMiles;
    private int durationInMinutes;

    public Ride(double distanceInMiles, int durationInMinutes) {
        this.distanceInMiles = distanceInMiles;
        this.durationInMinutes = durationInMinutes;
    }

    	
    public double getDistanceInMiles() {
        return distanceInMiles;
    }

    public void setDistanceInMiles(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
    
   

}

class User {
    // User details
	
	private Stack<String> messages;
    private String username;

    public User(String username)
    {
    	this.username = username;
    	this.messages = new Stack<String>();
    }
    public String getUsername() {
        return username;
    }
    
    public String getLastMessage()
    {
    	if(!messages.isEmpty())
    	{
    		return messages.peek();
    	}
    	return "No messages left";
    }

    public void addMessage(String message)
    {
    	messages.push(message);
    }
    public void setInbox()
    {
    	this.messages = new Stack<String>();
    }
    public void setUsername(String username) {
        this.username = username;
    }


}