
1) Doordash violates the Interface Segregation Principle of SOLID because it keeps both the deliverFood() and trackPackage() methods
in the DeliveryService interface instead of separating the methods across two different interfaces(a deliveryService and a trackingService interface).

2) To solve this, I created a new TrackingService interface and moved the trackPackage() method from the original DeliveryService interface to it.
I then made the FoodDeliveryAndTrackingService class implement both the TrackingService and the DeliveryService interfaces, and had it implement
both the deliverFood() and trackPackage() methods. I even added a cancelDelivery() method to DeliveryService and concretely implemented it in
FoodDeliveryAndTrackingService.  
