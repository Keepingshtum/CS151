package HW1.violations.airbnb;

public class DiscountedHotel extends Hotel {
	public int pricePerNight = super.pricePerNight/2;
	@Override public int getPricePerNight() {
		return this.pricePerNight;
	}
}