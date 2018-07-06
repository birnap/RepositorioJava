package everis.com.clock.test.service.impl;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import everis.com.clock.service.impl.InPutDataServiceImpl;

public class InPutDataServiceImplTest {
	InPutDataServiceImpl data = new InPutDataServiceImpl();


	@Test
	public void readReadData2() {
		List<String> expected = Arrays.asList("22", "30", "40");
		assertEquals(expected, data.readDataToKeyboard());
	}

	@Test
	public void readPrintDataInRomanNumbers() {
		List<String> expected = Arrays.asList("08", "28", "41");
		assertEquals("VIII:XXVIII:XLI"+"\n", data.printDataInRomanNumbers(expected));
	}
	
	@Test
	public void	readPrintDataInDiffHoursInRomanNumbers() {
		List<String> expected = Arrays.asList("23", "30", "40");
		assertEquals("XXIII:XXX:XL"+"\n", data.printDataInRomanNumbers(expected));
	}

}
