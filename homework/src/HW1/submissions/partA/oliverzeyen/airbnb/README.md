airbnb

violates SRP (S)
How? To me, it seems like Hotels and DiscountedHotels should not be able to calculate the price depending on their stay. I think having a total amount is fine per night, but the actual calculation should be left to the BookingSerivce, as BookingService serves as a useless middleman in this case.
