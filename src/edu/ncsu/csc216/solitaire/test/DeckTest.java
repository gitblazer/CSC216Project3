package edu.ncsu.csc216.solitaire.test;

import junit.framework.TestCase;
import edu.ncsu.csc216.solitaire.model.Deck;

/**
 * Tests the Deck class
 * @author William Blazer, Andrew Kofink
 */
public class DeckTest extends TestCase {

	private static int[] originalDeck = {27, 1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 28, 23, 26};
	//private static int[] originalDeck = {27, 1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 28, 23, 26};
	
	private static int[] answersInOrder = {16, 1, 12, 9, 6, 26, 8, 23, 19, 14, 13, 11, 16, 1, 18, 3, 27, 2, 9, 3, 2};
	
	/**
	 * the deck to be test
	 */
	private static Deck d;
	
	/**
	 * Test method for getKeyStreamValue()
	 */
	public void testGetKeystreamValue() {
		d = new Deck(originalDeck);
		int i = 0;
		while (i < answersInOrder.length) {
			assertEquals(d.getKeystreamValue(), answersInOrder[i++]);
		}
	}

}
