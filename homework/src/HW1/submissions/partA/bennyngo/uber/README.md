## 1.  Which SOLID principle(s) is this company violating?

Uber is violating the Single Responsibility Principle, the Open-Closed Principle, and the Dependency Inversion Principle.

The RideManager class is responsible for calculating ride fares and sending notifications. A class should only have one responsibility and this class has 2 responsibilies, so it violates SRP.

It violates OCP because the RideManager class is not open to extending, so if I want to add a new method to the class, I would have to modify the RideManager class.

The RideManager class depends on the concrete User and Ride class. This violates DIP.


## 2.  Your approach to making changes to fix the violation.

RideManager class is replaced with RideImpl and UserImpl which depends on interfaces Ride and User.

Made two separate classes NotiSend and RideFare to adhere to SRP. They also implement the NotificationSender and RideFareCalculator interface to adhere to OCP.

