package everis.com.clock.main;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import everis.com.clock.service.impl.InPutDataServiceImpl;

public class ShowConsole {

	public static void main(String[] args) throws ParseException {
		InPutDataServiceImpl data = new InPutDataServiceImpl();
		List<String> newDataHours = new ArrayList<String>();
		newDataHours = data.readDataToKeyboard();
		data.printDataInRomanNumbers(newDataHours);
		data.printDataInDiffHoursInRomanNumbers(newDataHours);
	}
}