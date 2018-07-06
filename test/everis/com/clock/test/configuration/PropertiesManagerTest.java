package everis.com.clock.test.configuration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import everis.com.clock.configuration.PropertiesManager;

public class PropertiesManagerTest {

	PropertiesManager propertiesManager = new PropertiesManager();

	@Test(expected = NullPointerException.class)
	public void readNullPointerExceptionLoadProperties2() throws NullPointerException, Exception {
		propertiesManager.loadProperties(null);
	}

	@Test
	public void readProperties() {
		System.out.println("Test hours.");
		assertFalse(propertiesManager.printFormat("22:30:80"));
		assertTrue(propertiesManager.printFormat("13:56:27"));
	}

}