package edu.ncsu.csc216.solitaire.test;

import junit.framework.TestCase;

import edu.ncsu.csc216.solitaire.model.Deck;
import edu.ncsu.csc216.solitaire.model.Message;

/**
 * Tests the Message class
 * @author William Blazer, Andrew Kofink
 */
public class MessageTest extends TestCase {

	private String decryptedMessage = "GO PACK BEAT CAROLINA";
	private String encryptedMessage = "WPLYGBSWUSNDPDSUONRQC";
	private Message m = new Message(decryptedMessage);
	private int[] originalDeck = {27, 1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 28, 23, 26};
	private Deck d = new Deck(originalDeck);

	/**
	 * Tests the encrypt method
	 */
	public void testEncrypt() {
		d = new Deck(originalDeck);
		m = new Message(decryptedMessage);
		assertEquals(m.encrypt(d), encryptedMessage);
	}

	/**
	 * Tests the decrypt method
	 */
	public void testDecrypt() {
		d = new Deck(originalDeck);
		m = new Message(encryptedMessage);
		assertEquals(m.decrypt(d), decryptedMessage);
	}

}
