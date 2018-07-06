package everis.com.clock.zone;

public enum ZoneHour {
	AUSTRALIA(8), JAPAN(7), UNITED_STATES(-6), CHINA(6), RUSIA(1);

	private int code;

	private ZoneHour(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

}
