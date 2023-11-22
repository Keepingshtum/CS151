package HW1.violations.airbnb;

public class FancyHotel extends Hotel {
	public int pricePerNight = super.pricePerNight*2;
	@Override public int getPricePerNight() {
		return this.pricePerNight;
	}
}


