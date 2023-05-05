package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void ITER_1() {
		assertEquals("Hello, Bob", Welcome.welcome("bob"));
	}
	
	@Test
	void ITER_2() {
		assertEquals("Hello, my friend", Welcome.welcome("    "));
	}
	
	@Test
	void ITER_3() {
		assertEquals("HELLO, JERRY !", Welcome.welcome("JERRY"));
	}
	
	
	@Test
	void ITER_4() {
		assertEquals("Hello, Amy, Bob", Welcome.welcome("amy,bob"));
	}
}