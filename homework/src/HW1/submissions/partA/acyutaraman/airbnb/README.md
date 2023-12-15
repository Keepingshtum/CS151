1) Airbnb violated the Open/Closed principle in SOLID. The DiscountedHotel class was a subclass of the Hotel class, and it overrides its calculateTotalPrice() method. Despite doing this,
the DiscountedHotel class can still access the calculateTotalPrice method of its superclass. Therefore, it violates the Open/Closed principle in SOLID.

2) I fixed this violation by removing the Hotel class and instead creating a Hotel interface. I, then, created a Regular Hotel class to replace the previous Hotel class. I then made
both DiscountedHotel and the new RegularHotel classes implement the new Hotel interface. The Hotel interface has the abstract method calculateTotalPrice, which is implemented differently
in both DiscountedHotel and RegularHotel. I also added a new FiveStarHotel class that implements Hotel and charges at a higher hourly rate than RegularHotel. Its higher rate is displayed in
its calculateTotalPrice() method. 
