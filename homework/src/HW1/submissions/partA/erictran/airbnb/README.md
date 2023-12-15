# 'Airbnb' Violation of SOLID

This code violates the "L" in SOLID, which stands for Liskov Substitution Principle
<br />
<br />
It officially states that "Objects of a superclass shall be replaceable with objects of its subclasses without breaking the application."
In other words, if you have a reference to a base type object, you should be able to use it to refer to a subtype object without any issues.
In this case, the 'DiscountedHotel' class changes the behavior of the 'calculateTotalPrice()' method.
Consider how the 'calculateTotalPrice' method in the 'Hotel' class returns the number of nights multiplied by the nightly rate while in the 'DiscountedHotel' class
it returns the total price minus a discount.
<br />
<br />
Hence, we cannot substitute a 'DiscountedHotel' object for a 'Hotel' object without breaking the code.
For example, if we passed a 'DiscountedHotel' object to the bookService.calculateTotalPrice() method, the total price may be calculated incorrectly.
<br />
<br />
A better design approach for this is to move the discount logic to the 'BookingServiceImpl' class.
<br />
<br />
Lets start off by removing the 'calculateTotalPrice' method from the 'DiscountedHotel' class:
```
public class DiscountedHotel extends Hotel {

}
```
Now, lets refactor the 'calculateTotalPrice' in the 'BookingServiceImpl' class so that it checks if the current instance is a 'DiscountedHotel' object before applying the discount.
```
public class BookingServiceImpl implements BookingService {
    @Override
    public int calculateTotalPrice(Hotel hotel, int numberOfNights) {
        int totalPrice = hotel.calculateTotalPrice(numberOfNights);
        if (hotel instanceof DiscountedHotel) {
            totalPrice -= 50;
        }
        return totalPrice;
    }
}
```
After making the following changes, the code now adheres to the Liskov Substitution Principle of SOLID.
<br />
<br />
We have a Main class to test the new code. It should produce the following output:
```
Regular Hotel Total Price: $300
Discounted Hotel Total Price: $250
```