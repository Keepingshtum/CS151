**SOLID Principles the company is violating**:

- **Open-Closed Principle** - In the original code, the DiscountedHotel class is able to access and
change the calculateTotalPrice method in the Hotel class, which violates this principle as it
states that classes should be closed to modifying an existing feature.

- **Liskov Substitution Principle** - DiscountedHotel is a type of Hotel, but it overrides the base
class by changing the method to calculate the total cost.

**Approaches to fix the violation and additional changes**:
- Following the area calculator example in Solid Principles Part 1, the Hotel class was changed to
RegularPriceHotel and a Hotel interface was created so the discounted and regular hotel classes
could implement it
- Updated the parameters of calculateTotalPrice in BookingService and BookingServiceImpl from Hotel
to HotelPrice



