package hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
	private HelloWorld hello;
	
	@Before
	public void setup() {
		hello = new HelloWorld();
	}
	@Test
	void test() {
		String msg = hello.getMessage();
		assertEquals("Hello World", msg);
	}
	
	@Test
	public void testGetMessage() {
		String msg = hello.getMessage("kenu");
		assertEquals("Hello kenu", msg);
	}

	@Test
	public void testGetMessageNull() {
		String msg = hello.getMessage(null);
		assertEquals("Hello World", msg);
	}
	
	@After
	public void tearDown() {
		System.out.println("...");
	}

}
