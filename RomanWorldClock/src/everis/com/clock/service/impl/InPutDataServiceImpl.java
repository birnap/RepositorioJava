package everis.com.clock.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import everis.com.clock.configuration.PropertiesManager;
import everis.com.clock.datatreatment.Format;
import everis.com.clock.main.ShowConsole;
import everis.com.clock.service.Service;
import everis.com.clock.zone.ClockZone;

public class InPutDataServiceImpl implements Service {
	static final Logger LOGGER = Logger.getLogger(ShowConsole.class.getName());
	private List<String> data = new ArrayList<String>();
	private Format format = new Format();
	private ClockZone zone = new ClockZone();

	public List<String> readDataToKeyboard() {
		PropertiesManager propertiesManager = new PropertiesManager();
		Scanner read = new Scanner(System.in);
		boolean exit = false;
		do {
			LOGGER.log(Level.INFO, "Introduce una hora con formato de tipo hh:mm:ss.");
			String keyboard = read.nextLine();
			if (propertiesManager.printFormat(keyboard)) {
				data = format.separateValues(keyboard);
				exit = true;
			} else {
				LOGGER.log(Level.SEVERE, "Formato erróneo.");
			}
		} while (!exit);
		read.close();
		return data;
	}

	public String printDataInRomanNumbers(List<String> dataHours) {
		return zone.printLocalRomanHours(dataHours);
	}

	public String printDataInDiffHoursInRomanNumbers(List<String> useDataKeyboard) throws ParseException {
		return zone.printCountryRomanHours(useDataKeyboard);
	}

}