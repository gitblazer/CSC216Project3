package edu.ncsu.csc216.solitaire.test;

import junit.framework.TestCase;
import edu.ncsu.csc216.solitaire.model.Deck;

/**
 * Tests the Deck class
 * @author William Blazer, Andrew Kofink
 */
public class DeckTest extends TestCase {

	private static int[] originalDeck = {21, 24, 2, 5, 9, 15, 18, 1, 16, 12, 27, 4, 10, 19, 7, 20, 23, 26, 13, 3, 28, 25, 22, 8, 6, 14, 11, 17};
	
	private static int[] answersInOrder = {9, 24};
	
	public static Deck d;
	
	/**
	 * Test method for getKeyStreamValue()
	 */
	public void testGetKeySteamValue() {
		d = new Deck(originalDeck);
		int i = 0;
		assertEquals(d.getKeySteamValue(), answersInOrder[i++]);
		assertEquals(d.getKeySteamValue(), answersInOrder[i++]);
	}

}
