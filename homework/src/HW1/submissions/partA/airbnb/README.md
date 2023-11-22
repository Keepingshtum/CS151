Q) which SOLID principle(s) is this company violating?  
A) this company violates Liskov Substitution Principle and Open Closed Principle.  

Q) Your approach to making changes to fix the violation  
A) LSP is satisfied by introducing an interface HotelInterface which is implemented by the class Hotel and the class DiscountedHotel.
Consequently, in the interface BookingService and the class BookingServiceImpl, the method calculateTotalPrice takes a parameter of type HotelInterface rather than type Hotel.
OCP is satisfied as further additions of hotels/ specific hotel features can now be done without modifying existing classes or class contents but rather just extending them.