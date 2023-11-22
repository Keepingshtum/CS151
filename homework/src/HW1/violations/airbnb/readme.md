This class violates the liksov substitution principle
because the class Hotel and DiscountedHotel cannot be directly substituted in the discountedHotels method
if done so then Hotel will have a non discounted price even though it should have a discounted price
So I make a HotellInterface and the Hotel 
The interface defines a method calculateTotalPrice that should be implemented by any class that represents a hotel.
The Hotel class implements the HotellInterface and provides a basic implementation of the calculateTotalPrice method, 
calculating the total price based on the number of nights.
The DiscountedHotel class also implements the HotellInterface. It takes another HotellInterface instance in its constructor (composition), 
and it provides a discounted implementation of the calculateTotalPrice method.