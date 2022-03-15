package hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void test() {
		assertEquals("1,000", StringUtils.comma(1000));
	}

}
