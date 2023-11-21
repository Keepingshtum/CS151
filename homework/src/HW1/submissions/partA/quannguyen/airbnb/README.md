Airbnb
1. Which SOLID principle(s) is this company violating?
- In the Airbnb company, two SOLID principles this company violates are Liskov Substitution Principle and Open-Closed Principle. 
- Because ‘DiscountedHotel’ is a subclass of the ‘Hotel’ class, ‘Hotel’ class is calculated the total price based on the number of nights but the subclass of it calculated the total price after discount based on the number of nights. So, it changes the behavior of calculateTotalPrice by having a discount. It violates LSP. 
- If I want to add a new type of hotel in this code, for example I add ‘LuxuryHotel’ in this code, I will need to add a new method to this class and if I have more new type of hotel, I will need to add more method to this class so the code is not reusable. It violates OCP. 
2. Your approach to making changes to fix the violation. 
- First, in the ‘Hotel’ that already exist, it will be interface to define the calculateTotalPrice method
- Then, I made 2 new classes named ‘RegularHotel’ and ‘LuxuryHotel’. Two new classes ‘DiscountedHote’ implement the ‘Hotel’ interface.  
- Change some code for ‘BookingServiceImpl’ that implements ‘BookingService’ so that it can work with the ‘Hotel’ interface.
- Allowing the ‘DiscountedHotel’ class to be used for any implementation of the ‘Hotel’ interface resulted in flexibility. 
