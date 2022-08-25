package calculator.logic;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.Assert;
public class Calctest {
	Calculator cal;
	@Before
	public void beforeannotatio()
	{
		cal=new Calculator();
	}

	@Test
	public void validateaddition() {
		int expectedresult=30;
		int actualresult=cal.addition(10,20);
		org.junit.Assert.assertEquals(expectedresult, actualresult);
		fail("Not yet implemented".
	}

}
