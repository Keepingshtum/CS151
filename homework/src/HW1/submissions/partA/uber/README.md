1) which SOLID principle(s) is this company violating?
This company violates Single Responsibility Principle because RideManager class has two methods that can logically be separated - calculateFare(...)
and sendNotification(...). By extension, it also violates Open-Closed Principle because, as configured now, any changes made to RideManager class impacts on both fare calculation and notification sending methods, potentially introducing more bugs along the way.

2) Your approach to making changes to fix the violation
RideManager is separated into RideFareManager class and RideNotificationManager class. The former class takes care of calculateFare(...) and allows room for 
further specifications of fare calculation. The latter class takes care of sendNotification(...).