Violations:
Interface Segregation Principle - What if we ever want to expand and do non-food deliveries? We would need need to create a method for food tracking again, which is why
the ISP is violated.

Single Responsibility Principle - The FoodDeliveryAndTracking.java does not need two different functions to be implemented, could be seperated into two classes. 

Fixes:
-Created new interface FoodDeliverable to handle the food management and changed DeliveryServiceable to handle packages
-Created new TrackingService.java to demonstrate the prevention of ISP
-Changed FoodDeliveryAndTracking.java to FoodDelivery.java to only handle the food transaction, TrackingService.java would handle the tracking of the 
food unless we wanted a unique output that indicates that it is food to the user. In that case, we also implement DeliveryServiceable, override, and 
add a unique message for this method. 

