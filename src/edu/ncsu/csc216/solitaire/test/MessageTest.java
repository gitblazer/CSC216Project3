package edu.ncsu.csc216.solitaire.test;

import junit.framework.TestCase;

import edu.ncsu.csc216.solitaire.model.Deck;
import edu.ncsu.csc216.solitaire.model.Message;

/**
 * Tests the Message class
 * @author William Blazer, Andrew Kofink
 */
public class MessageTest extends TestCase {

	private String unencryptedMessage = "Go Pack, Beat Carolina!";
	private String encryptedMessage = "WPLYGBSWUSNDPDSUONRQC";
	public Message m = new Message(unencryptedMessage);
	private Deck d = DeckTest.d;

	/**
	 * Tests the encrypt method
	 */
	public void testEncrypt() {
		m = new Message(unencryptedMessage);
		assertFalse(m.encrypt(d) == encryptedMessage);
	}

	/**
	 * Tests the decrypt method
	 */
	public void testDecrypt() {
		m = new Message(encryptedMessage);
		assertFalse(m.encrypt(d) != unencryptedMessage);
	}

}
