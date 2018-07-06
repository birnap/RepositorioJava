package everis.com.clock.zone;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import everis.com.clock.datatreatment.Format;
import everis.com.clock.main.ShowConsole;

public class ClockZone {

	private Format format = new Format();
	static final Logger LOGGER = Logger.getLogger(ShowConsole.class.getName());

	public String printCountryRomanHours(List<String> data) throws ParseException {
		String concatRomanFormat = "";
		for (ZoneHour zone : ZoneHour.values()) {
			concatRomanFormat = takeAndPrintHoursInRomanAccordingToTimeZone(data, zone);
		}
		return concatRomanFormat;
	}

	public String takeAndPrintHoursInRomanAccordingToTimeZone(List<String> data, ZoneHour zone) throws ParseException {
		String dateWithTimezone = format.conversionDataZoneHoursToDate(data, zone.getCode());
		List<String> dateToConvertToRoman = new ArrayList<String>(Arrays.asList(dateWithTimezone.split(":")));
		String concatRomanFormat = format.concatFormatRomanNumber(dateToConvertToRoman);
		LOGGER.log(Level.INFO, "Hora " + zone.name() + ": " + dateWithTimezone);
		LOGGER.log(Level.INFO, "Hora Romana - " + zone.name() + ": " + concatRomanFormat);
		return concatRomanFormat;
	}

	public String printLocalRomanHours(List<String> hours) {
		String printRomanLocalHours = format.concatFormatRomanNumber(hours);
		LOGGER.log(Level.INFO, "Hora Romana: " + printRomanLocalHours);
		return printRomanLocalHours;
	}

}