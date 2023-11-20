## 1.  Which SOLID principle(s) is this company violating?

AirBNB violates the Liskov Substitution Principle, the Open-Closed Principle, and the Dependency Inversion Principle.

For LSP, the DiscountedHotel class extends Hotel, but changes the behavior of the calculateTotalPrice method by having a discount. This violates the LSP because objects of the DiscountedHotel subclass aren't substitutable for objects of the Hotel superclass without affecting the program.

For OCP, the BookingServiceImpl class uses the calculateTotalPrice method of the Hotel class. This means if I introduce a new type of hotel that uses a different pricing strategy, I would have to modify the Hotel class. This violates the OCP.

For DIP, the BookingServiceImpl class and the BookingService interface depends directly on the concrete Hotel class, this violates DIP as it depends on a low-level modules instead of abstractions.

## 2.  Your approach to making changes to fix the violation.

Introduced an interface PriceHotel to represent the base hotel

Modified the Hotel and DiscountedHotel classes to implement the PriceHotel interface

Updated the BookingService interface and BookingServiceImpl class to depend on PriceHotel interface instead of the concrete Hotel class

