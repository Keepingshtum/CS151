I created two separate interfaces: DeliveryService and PackageTrackingService. Each interface has a single responsibility.
I created two classes, FoodDeliveryService and PackageTrackingService, to implement the respective interfaces. I added a dashboard interface, and a DashBoard
class to get sort of is a composition of fooddelivery and trackingService, since we dont know want to lose the functionality of the original class.
The client code (Client class) can now use these services independently, adhering to the Single Responsibility Principle.
This separation makes the code more modular and adheres better to SOLID principles, especially SRP and ISP.