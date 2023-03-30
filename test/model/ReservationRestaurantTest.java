package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ReservationRestaurantTest {
	static ReservationRestaurant reservation;
	static final int NB_PERSONNES = 2;
	static final int NUM_SERVICE = 1;
	static final int JOUR = 10;
	static final int MOIS = 12;
	static final String MESSAGE_RESA_1 = "Le 10/12 : table n°2 pour le premier service.\n";
	static final String MESSAGE_RESA_2 = "Le 14/12 : table n°3 pour le deuxième service.\n";

	@BeforeAll
	static void setUpBeforeClass() {
		reservation = new ReservationRestaurant(JOUR, MOIS, NUM_SERVICE, NB_PERSONNES);
	}

	@Test
	void testToString() {
		assertEquals(MESSAGE_RESA_1, reservation.toString(), "la sortie console devrait etre : " + MESSAGE_RESA_1);
		Reservation reservation2 = new ReservationRestaurant(14, 12, 2, 3);
		assertEquals(MESSAGE_RESA_2, reservation2.toString(), "la sortie console devrait etre : " + MESSAGE_RESA_2);
	}

	@Test
	void testReservationRestaurant() {
		assertNotNull(reservation, "reservationRestaurant null");
	}

}
