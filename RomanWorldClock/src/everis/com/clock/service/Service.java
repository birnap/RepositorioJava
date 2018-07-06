package everis.com.clock.service;

import java.text.ParseException;
import java.util.List;

public interface Service {
	List<String> readDataToKeyboard();
	String printDataInRomanNumbers(List<String> newDataHours);
	String printDataInDiffHoursInRomanNumbers(List<String> newDataHours) throws ParseException;
}