package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	
	private FizzBuzz fb;
	
	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
	}
	
	@Test
	void repond1() {
		assertEquals("1", fb.fizzBuzz(1));
	}
	
	@Test
	void repond2() {
		assertEquals("2", fb.fizzBuzz(2));
	}
}
