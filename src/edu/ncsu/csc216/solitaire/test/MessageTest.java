package edu.ncsu.csc216.solitaire.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc216.solitaire.model.Deck;
import edu.ncsu.csc216.solitaire.model.Message;

/**
 * @author William Blazer, Andrew Kofink
 *
 */
public class MessageTest {

	public Message m = new Message("This is a test");
	private Deck d = DeckTest.deck;
	
	/**
	 * Test that creating a Message works
	 */
	@Test
	public void testMessage() {
		assertEquals(m.getClass(), (new Message("Test")).getClass());
	}

	/**
	 * Encrypts the message
	 */
	@Test
	public void testEncrypt() {
		m.encrypt(d);
	}

	/**
	 * Test method for {@link edu.ncsu.csc216.solitaire.model.Message#decrypt(edu.ncsu.csc216.solitaire.model.Deck)}.
	 */
	@Test
	public void testDecrypt() {
		fail("Not yet implemented");
	}

}
