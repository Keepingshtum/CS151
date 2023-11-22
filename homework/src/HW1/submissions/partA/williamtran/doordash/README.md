# What SOLID principle is being violated?
Single Responsibility is being violated because 
FoodDeliveryAndTrackingService is in charge of both
delivering food and tracking packages

Interface Segregation is being violated because
we don't need to have one class be in charge of both
delivery and tracking
# What is your solution?
Split the class into FoodDelivery class and
TrackingService class