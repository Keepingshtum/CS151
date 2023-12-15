1. Which SOLID principle(s) is this company violating?
Open - Closed Principle, Dependency Inversion Principle, 

2. Your approach to making changes to fix the violation.
OCP - I added a interface (Price) that both Hotel and Discounted Hotel can use.
DIP - Changed BookingService and BookingServiceImpl to where the method arguments use the Price class instead of the Hotel class

