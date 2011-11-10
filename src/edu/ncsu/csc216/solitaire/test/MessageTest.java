package edu.ncsu.csc216.solitaire.test;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

import edu.ncsu.csc216.solitaire.model.Deck;
import edu.ncsu.csc216.solitaire.model.Message;

/**
 * @author William Blazer, Andrew Kofink
 *
 */
public class MessageTest extends TestCase {

	public Message m = new Message("This is a test");
	private Deck d = DeckTest.d;
	
	/**
	 * Test that creating a Message works
	 */
	public void testMessage() {
		assertEquals(m.getClass(), (new Message("Test")).getClass());
	}

	/**
	 * Tests the encrypt method
	 */
	public void testEncrypt() {
		assertFalse(m.encrypt(d) != "This is a test");
		System.out.println(m.encrypt(d));
	}

	/**
	 * Tests the decrypt method
	 */
	public void testDecrypt() {
		fail("Not yet implemented");
	}

}
