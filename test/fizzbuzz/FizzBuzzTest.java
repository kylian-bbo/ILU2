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
	void fizzbuzz_repond_1_pour_1() {
		assertEquals("1", fb.fizzBuzz(1));
	}
	
	@Test
	void fizzbuzz_repond_2_pour_2() {
		assertEquals("2", fb.fizzBuzz(2));
	}
	
	@Test
	void fizzbuzz_repond_fizz_pour_3() {
		assertEquals("fizz", fb.fizzBuzz(3));
	}
	
	@Test
	void fizzbuzz_repond_un_entier() {
		assertEquals("4", fb.fizzBuzz(4));
		assertEquals("7", fb.fizzBuzz(7));
		assertEquals("13", fb.fizzBuzz(13));
	}
	
	@Test
	void fizzbuzz_repond_buzz_pour_5() {
		assertEquals("buzz",fb.fizzBuzz(5));
	}
	
	@Test
	void fizzbuzz_repond_correctement_sur_multiple() {
		assertEquals("fizz", fb.fizzBuzz(6));
		assertEquals("buzz", fb.fizzBuzz(400));
	}
	
	@Test
	void fizzbuzz_repond_fizzbuzz() {
		assertEquals("fizzbuzz",fb.fizzBuzz(15));
	}
	
	@Test
	void fizzbuzz_tests_varies() {
		assertEquals("fizzbuzz",fb.fizzBuzz(157*3*5));
		assertEquals("fizz",fb.fizzBuzz(157*3));
		assertEquals("buzz",fb.fizzBuzz(157*5));
		assertEquals("641",fb.fizzBuzz(641));
	}
}