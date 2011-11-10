/**
 * 
 */
package edu.ncsu.csc216.solitaire.test;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import edu.ncsu.csc216.solitaire.model.Deck;

/**
 * @author William Blazer, Andrew Kofink
 */
public class DeckTest extends TestCase {

	private static int[] intArr = {21, 24, 2, 5, 9, 15, 18, 1, 16, 12, 27, 4, 10, 19, 7, 20, 23, 26, 13, 3, 28, 25, 22, 8, 6, 14, 11, 17};
	public static Deck d = new Deck(intArr);
	
	/**
	 * Test method for {@link edu.ncsu.csc216.solitaire.model.Deck#getKeySteamValue()}.
	 */
	public void testGetKeySteamValue() {
		fail("Not yet implemented");
	}

}
