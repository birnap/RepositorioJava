package everis.com.clock.datatreatment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Format {

	public List<String> separateValues(String keyboard) {
		List<String> list = new ArrayList<String>(Arrays.asList(keyboard.split(":")));
		return list;
	}

	public String concatFormatRomanNumber(List<String> data) {
		String concatRomanFormat = toRomanNumber(data.get(0)) + ":" + toRomanNumber(data.get(1)) + ":"
				+ toRomanNumber(data.get(2)) + "\n";
		return concatRomanFormat;
	}

	public String toRomanNumber(String romanTime) {
		String[] time = romanTime.split("");
		romanTime = RomanNumber.TENS.newRomanTime(Integer.parseInt(time[0]));
		return romanTime += RomanNumber.UNITS.newRomanTime(Integer.parseInt(time[1]));
	}

	public String conversionDataZoneHoursToDate(List<String> data, int zoneHour) throws ParseException {
		int updateHour = Integer.parseInt(data.get(0)) + zoneHour;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
		Date dateConcat = simpleDateFormat.parse(updateHour + ":" + data.get(1) + ":" + data.get(2));
		return simpleDateFormat.format(dateConcat);
	}

}