package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class DayWeekTest {

	@Test
	void test0() {
		int result = Utility.isWeek(14, 11, 2019);
		assertEquals(4, result);
	}

}
