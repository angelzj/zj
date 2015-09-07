import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Unit_testTest {
	private static Unit_test unit_test  = new Unit_test();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		unit_test.add(5);
		unit_test.add(5);
		assertEquals(10, unit_test.getResult());
		
	}

}
