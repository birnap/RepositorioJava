package everis.com.clock.test.datatreatment;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import everis.com.clock.datatreatment.Format;

import org.junit.Test;

public class FormatTest {
	Format format = new Format();

	@Test
	public void readSeparateValues() {
		List<String> expected = Arrays.asList("21", "30", "40");
		assertEquals(expected, format.separateValues("21:30:40"));

	}

	@Test
	public void readSeparateValues2() {
		List<String> expected = Arrays.asList("00", "31", "37");
		assertEquals(expected, format.separateValues("00:31:37"));

	}

	@Test
	public void readFormatDataZoneHours() throws ParseException {
		List<String> expected = Arrays.asList("05", "04", "28");
		assertEquals("10:04:28", format.conversionDataZoneHoursToDate(expected, 05));
	}

	@Test
	public void readFormatDataZoneHours2() throws ParseException {
		List<String> expected = Arrays.asList("19", "59", "03");
		assertEquals("14:59:03", format.conversionDataZoneHoursToDate(expected, 19));
	}

	@Test
	public void readToRomanNumber() {
		assertEquals("XX", format.toRomanNumber("20"));
	}

	@Test
	public void readToRomanNumber2() {
		assertEquals("XLVIII", format.toRomanNumber("48"));
	}

	@Test
	public void readFormatPrintRomanNumber() {
		List<String> expected = Arrays.asList("22", "30", "40");
		assertEquals("XXII:XXX:XL" + "\n", format.concatFormatRomanNumber(expected));
	}

	@Test
	public void readFormatPrintRomanNumber2() {
		List<String> expected = Arrays.asList("23", "05", "59");
		assertEquals("XXIII:V:LIX" + "\n", format.concatFormatRomanNumber(expected));
	}

	@Test
	public void readFormatPrintRomanNumber3() {
		List<String> expected = Arrays.asList("03", "21", "02");
		assertEquals("III:XXI:II" + "\n", format.concatFormatRomanNumber(expected));
	}
}
