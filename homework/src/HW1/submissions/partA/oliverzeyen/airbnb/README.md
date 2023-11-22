airbnb

violates SRP (S)
How? To me, it seems like Hotels and DiscountedHotels should not be able to calculate the price depending on their stay. I think having a total amount is fine per night, but the actual calculation should be left to the BookingSerivce, as BookingService serves as a useless middleman in this case. Assuming that this is a specific cut out of a much larger, fully fleshed out class, it can be very apparent why this could be a bad thing. Essentially, a Hotel's job would/should be more on the lines of the information about the Hotel, rather than calculating your exact stay. While a price per night is useful and important to a hotel, we can use bookingservice to calculate the number of days we would spend in combination with the price point grabbed from each hotel.

violates OCP (O)
How? Any changes
 made to hotel's pricing, directly changes the pricing of other hotels. So, if you made the hotel $50 for the stay, and you tried to use the discountedhotel, you could potentially get a free stay. Assuming that these are two completely different hotels, unless they are somehow connected, it makes much less sense for a discountedhotel to be directly connected with a hotel.

 approach:

first, separate their responsibilities.
    1. Make hotel not have the specific ability to calculate your exact stay. Instead, it has the responsibility of imagining one night at the hotel.
    2. BookingService now has the sole responsibility of calculating your entire stay.
second, ensure cohesion in the event of price changes
    1. While this still seems a bit weird to have hotel prices deeply connected, their prices can be connected in a less hard-wired way.
        1a. Make a sort of formula for accounting for discounts or pricey hotels
        1b. Give each hotel a version of the original hotel's price that will maintain consistency

Added a new hotel, FancyHotel, to represent a more pricey point. In this case, I doubled the price of a normal hotel, while the discountedhotel received a price change of half the price of a normal hotel.