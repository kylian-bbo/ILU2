package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaurantTest {
	FormulaireRestaurant formulaire;
	Restaurant restaurant;
	static final String MESSAGE_RESA = "Le 10/12\nTable 3 pour le premier service.";

	@BeforeEach
	void setUp() {
		restaurant = new Restaurant();
		restaurant.ajouterTable(2);
		restaurant.ajouterTable(3);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(5);
		restaurant.ajouterTable(5);
		restaurant.ajouterTable(8);
		formulaire = new FormulaireRestaurant(10, 12, 3, 1);
	}

	@Test
	void testDonnerPossibilites() {
		int[] possibilites = restaurant.donnerPossibilites(formulaire);
		int[] expected = { 0, 2, 3, 0, 0, 0 };
		assertArrayEquals(expected, possibilites,"Les tables numeros 2 et 3 devraient pouvoir être choisi");

		int[] expected2 = { 0, 2, 3, 0, 0, 0, 7};
		restaurant.ajouterTable(3);
		possibilites = restaurant.donnerPossibilites(formulaire);
		assertArrayEquals(expected2, possibilites,"Les tables numeros 2, 3 et 7 devraient pouvoir être choisi");
	}

	@Test
	void testReserver() {
		ReservationRestaurant reservation = (ReservationRestaurant) restaurant.reserver(3, formulaire);
		assertEquals(MESSAGE_RESA,reservation.toString(), "la sortie console devrait etre : " + MESSAGE_RESA);
	}

}
