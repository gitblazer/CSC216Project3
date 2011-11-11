package edu.ncsu.csc216.solitaire.test;

import junit.framework.TestCase;

import edu.ncsu.csc216.solitaire.model.Deck;
import edu.ncsu.csc216.solitaire.model.Message;

/**
 * Tests the Message class
 * @author William Blazer, Andrew Kofink
 */
public class MessageTest extends TestCase {

	private String startingMessage = "GO PACK BEAT CAROLINA";

	/**
	 * Tests the encrypt method
	 */
	public void testEncrypt() {
		for (int i = 0; i < DeckTest.testDecks.length; i++) {
			Deck d1 = new Deck(DeckTest.testDecks[i]);
			Message md = new Message(startingMessage);
			String encryptedMessage = md.encrypt(d1);
			
			Deck d2 = new Deck(DeckTest.testDecks[i]);
			Message me = new Message(encryptedMessage);
			String decryptedMessage = me.decrypt(d2);
			System.out.println(encryptedMessage + " | " + decryptedMessage);
			assertEquals(decryptedMessage, startingMessage);
		}
	}

	/**
	 * Tests the decrypt method
	 */
	public void testDecrypt() {
		testEncrypt();
	}

}
