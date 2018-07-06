package everis.com.clock.datatreatment;

public enum RomanNumber {
	UNITS, TENS;

	public String newRomanTime(int time) {
		String units[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		String tens[] = { "", "X", "XX", "XXX", "XL", "L" };
		switch (this) {
		case UNITS:
			return units[time];
		case TENS:
			return tens[time];
		default:
			throw new AssertionError("Unknown operations " + this);
		}

	}
}