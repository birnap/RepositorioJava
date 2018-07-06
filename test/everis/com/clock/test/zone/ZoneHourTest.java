package everis.com.clock.test.zone;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import everis.com.clock.zone.ZoneHour;

public class ZoneHourTest {
	@Before
	@Test
	public void readDataEnumZoneAustralia() throws ParseException {
		assertEquals(8, ZoneHour.AUSTRALIA.getCode());
		assertEquals("AUSTRALIA", ZoneHour.AUSTRALIA.name());
	}

	@Test
	public void readDataEnumZoneJAPAN() throws ParseException {
		assertEquals(7, ZoneHour.JAPAN.getCode());
		assertEquals("JAPAN", ZoneHour.JAPAN.name());
	}

	@Test
	public void readDataEnumZoneUnitedStates() throws ParseException {
		assertEquals(-6, ZoneHour.UNITED_STATES.getCode());
		assertEquals("UNITED_STATES", ZoneHour.UNITED_STATES.name());
	}

	@Test
	public void readDataEnumZoneChina() throws ParseException {
		assertEquals(6, ZoneHour.CHINA.getCode());
		assertEquals("CHINA", ZoneHour.CHINA.name());
	}

	@Test
	public void readDataEnumZoneRusia() throws ParseException {
		assertEquals(1, ZoneHour.RUSIA.getCode());
		assertEquals("RUSIA", ZoneHour.RUSIA.name());
	}
}
