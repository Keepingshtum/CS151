FareCalculator is responsible for calculating ride fares based on distance and time, and additional method to generate a summary.
NotificationManager is responsible for sending notifications to users.
RideManager now delegates the specific responsibilities to FareCalculator and NotificationManager. 
This separation adheres more closely to the Single Responsibility Principle.