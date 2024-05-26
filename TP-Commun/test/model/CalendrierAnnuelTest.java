package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalendrierAnnuelTest {
	static CalendrierAnnuel calendrier;
	
	@BeforeAll
	static void setUpBeforeClass() {
		calendrier = new CalendrierAnnuel();
	}

	@Test
	void testCalendrierAnnuel() {
		assertNotNull(calendrier, "calendrier null");
	}

	@Test
	void testEstLibre() {
		assertTrue(calendrier.estLibre(31,12), "31/12 devrait être libre");
	}

	@Test
	void testReserver() {
		assertTrue(calendrier.reserver(20,10), "reservation du 20/10 devrait être possible");
		assertFalse(calendrier.estLibre(20,10), "20/10 devrait être occuper");
		assertFalse(calendrier.reserver(20,10), "reservation du 20/10 ne devrait pas être possible");
	}

}
