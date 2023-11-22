# 'Uber' Violation of Solid

This code violates the "S" in SOLID, which stands for Single Responsibility Principle.
<br />
<br />
It officially states that "A module should be responsible to one, and only one, actor."
In this case, the 'RideManager' class has two responsibilities:
1. To calculate the fare for a ride
2. To send notifications to users

These two responsibilities are completely unrelated.
<br />
<br />
A better design approach for this is to split the 'RideManager' class into two separate classes.
<br />
<br />
Lets start off by renaming the 'RideManager' class to 'RideCalculator' that will handle calculating the ride's cost ONLY, removing the 'sendNotification' logic:
```
class RideCalculator {
    private final double BASE_FARE = 5.0; // Base fare in dollars
    private final double PER_MILE_RATE = 2.0; // Fare per mile in dollars
    private final double PER_MINUTE_RATE = 0.5; // Fare per minute in dollars

    double calculateRideFare(Ride ride) {
        double distanceInMiles = ride.getDistanceInMiles();
        int durationInMinutes = ride.getDurationInMinutes();

        // Calculate fare based on distance and time
        double distanceFare = distanceInMiles * PER_MILE_RATE;
        double timeFare = durationInMinutes * PER_MINUTE_RATE;

        // Calculate total fare including base fare
        double totalFare = BASE_FARE + distanceFare + timeFare;

        return totalFare;
    }
}
```
Now, lets make a new class called 'NotificationManager' that will handle sending out notifications to the user ONLY, putting the 'sendNotification' logic here:
```
class NotificationManager {
    void sendNotification(User user, String message) {
        // Code for sending notifications to the user
        System.out.println("Notification sent to user: " + user.getUsername() + " - " + message);
    }
}
```
After making the following changes, the code now adheres to the Single Responsibility Principle of SOLID.
<br />
<br />
We have a Main class to test the new code. It should produce the following output:
```
Notification sent to user: john_doe - Your ride fare is: $7.5
```