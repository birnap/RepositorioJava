package everis.com.clock.test.datatreatment;

import org.junit.Test;

import everis.com.clock.datatreatment.RomanNumber;

public class RomanNumberTest {

	@Test(expected=Exception.class)
	public void newRomanTimeTest() throws AssertionError{
		RomanNumber.UNITS.newRomanTime(80);
	}
	
	@Test(expected=Exception.class)
	public void newRomanTimeTest1() throws AssertionError{
		RomanNumber.TENS.newRomanTime(10);
	}
	
	@Test(expected=Exception.class)
	public void newRomanTimeTest2() throws AssertionError{
		RomanNumber.UNITS.newRomanTime(-1);
	}
	
	@Test(expected=Exception.class)
	public void newRomanTimeTest3() throws AssertionError{
		RomanNumber.TENS.newRomanTime(-10000);
	}
}
