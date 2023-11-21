Violations:
Open-Closed Principle - DiscountedHotel modifies the price calculation from Hotel
Liskov Substitution Principle - Somewhat connected with OCP for DiscountedHotel, we want to remove reliance on Hotel, and the two classes could conflict in conditions
Dependency Inversion Principle - BookingService and BookingServiceImpl both rely on a concrete version of Hotel, causing compile problems
when we segregate DiscountedHotel from Hotel

Fixes:
-DiscountedHotel originally called on Hotel's method to calculate the cost, replaced to use its own variables
-DiscountedHotel now implements BookingService instead of extending from Hotel, seperating the two classes
-Removed reliance (and usage of BookingServiceImpl) by relying on the abstraction instead of the concrete class Hotel to calculate
the cost of the stay, solving a problem of BookingService not accepting DiscountedHotel when we remove its extension of Hotel
