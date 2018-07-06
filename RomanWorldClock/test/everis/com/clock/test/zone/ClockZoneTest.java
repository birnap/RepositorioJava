package everis.com.clock.test.zone;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import everis.com.clock.zone.ClockZone;
import everis.com.clock.zone.ZoneHour;

public class ClockZoneTest {

	@Test
	public void readPrintCountryHours() throws ParseException {
		ClockZone clock = new ClockZone();
		List<String> expected = Arrays.asList("10", "42", "23");
		assertEquals("XI:XLII:XXIII" + "\n", clock.printCountryRomanHours(expected));
	}

	@Test
	public void verifiedToTimeZoneAustralia() throws ParseException {
		ClockZone clock = new ClockZone();
		List<String> expected = Arrays.asList("18", "21", "02");
		assertEquals("II:XXI:II" + "\n", clock.takeAndPrintHoursInRomanAccordingToTimeZone(expected, ZoneHour.AUSTRALIA));

	}

	@Test
	public void verifiedToTimeZoneJapan() throws ParseException {
		ClockZone clock = new ClockZone();
		List<String> expected = Arrays.asList("03", "21", "02");
		assertEquals("X:XXI:II" + "\n", clock.takeAndPrintHoursInRomanAccordingToTimeZone(expected, ZoneHour.JAPAN));

	}
	
	@Test
	public void verifiedToTimeZoneUnitedStates() throws ParseException {
		ClockZone clock = new ClockZone();
		List<String> expected = Arrays.asList("18", "59", "30");
		assertEquals("XII:LIX:XXX" + "\n", clock.takeAndPrintHoursInRomanAccordingToTimeZone(expected, ZoneHour.UNITED_STATES));

	}
	
	@Test
	public void verifiedToTimeZoneChina() throws ParseException {
		ClockZone clock = new ClockZone();
		List<String> expected = Arrays.asList("22", "54", "32");
		assertEquals("IV:LIV:XXXII" + "\n", clock.takeAndPrintHoursInRomanAccordingToTimeZone(expected, ZoneHour.CHINA));

	}
	
	@Test
	public void verifiedToTimeZoneRusia() throws ParseException {
		ClockZone clock = new ClockZone();
		List<String> expected = Arrays.asList("09", "19", "00");
		assertEquals("X:XIX:" + "\n", clock.takeAndPrintHoursInRomanAccordingToTimeZone(expected, ZoneHour.RUSIA));

	}

}
