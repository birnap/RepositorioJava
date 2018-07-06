package everis.com.clock.configuration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class PropertiesManager {
	private static final Logger LOGGER = Logger.getLogger(PropertiesManager.class.getName());
	private Properties prop;

	public PropertiesManager() {
		prop = new Properties();
	}

	public Properties loadProperties(String filename) throws FileNotFoundException, IOException {
		InputStream input = PropertiesManager.class.getClassLoader().getResourceAsStream(filename);
		try {
			prop.load(input);
		} catch (NullPointerException e) {
			throw new Error("File '" + filename + "' not found", e);
		}
		return prop;
	}

	public Properties getProperties() {
		return prop;
	}

	public boolean printFormat(String value) {
		PropertiesManager manager = new PropertiesManager();
		boolean controller = false;
		try {
			String format = manager.loadProperties("config.properties").getProperty("hourFormat");
			if (Pattern.matches(format, value) == true) {
				LOGGER.log(Level.INFO, "Formato de hora introducido correctamente.\n");
				controller = Pattern.matches(format, value);
			}
		} catch (Exception e) {
			PropertiesManager.LOGGER.log(Level.SEVERE, e.getMessage());
		}
		return controller;
	}
}
