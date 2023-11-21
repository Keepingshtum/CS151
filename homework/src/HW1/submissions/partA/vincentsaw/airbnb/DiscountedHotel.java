package HW1.submissions.partA.vincentsaw.airbnb;

public class DiscountedHotel extends Hotel {
    //Hotel stuff
    //Some more discount-specific stuff here

    //Additional implementations
    private String discountDate;

    public void setDiscountDate(String dd) {
        discountDate = dd;
    }

    @Override
    public String getDiscountDate() {
        return discountDate;
    }
}
