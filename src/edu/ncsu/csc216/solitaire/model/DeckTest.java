package edu.ncsu.csc216.solitaire.model;

import junit.framework.TestCase;

/**
 * Tests the Deck class
 * @author William Blazer, Andrew Kofink
 */
public class DeckTest extends TestCase {

	/**
	 * array of decks to test with
	 */
	public static int[][] testDecks = {	{27, 1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 28, 23, 26}, //original test deck (joker A at front)
										{27, 1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 26, 23, 28}, //jokers on ends
										{28, 1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 27, 23, 26}, //joker B at front
										{27, 28, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 1, 23, 26}, //both jokers at front
										{28, 27, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 1, 23, 26}, //both jokers at front flipped
										{26, 1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 23, 27, 28}, //both jokers at back
										{26, 1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 23, 28, 27}, //both jokers at back flipped
										{26, 1, 4, 7, 10, 13, 16, 28, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 23, 27}, //joker A last card
										{26, 1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 27, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 23, 28}, //joker B last card
										{26, 1, 4, 7, 10, 13, 16, 28, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 27, 23}, //joker A second to last card
										{26, 1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 27, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 28, 23}, //joker B second to last card
										{26, 1, 4, 7, 10, 13, 16, 20, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 28, 27, 23}, //joker A second to last card, joker B adjacent
										{26, 1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 20, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 27, 28, 23}, //joker B second to last card, joker A adjacent
										{1, 4, 7, 10, 13, 16, 19, 22, 25, 27, 3, 6, 9, 12, 15, 18, 28, 21, 24, 2, 5, 8, 11, 14, 17, 20, 23, 26}, //both in middle
										{1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 12, 15, 18, 27, 28, 21, 24, 2, 5, 8, 11, 14, 17, 20, 23, 26}}; //both in middle adjacent
	
	
	private static int[] answersInOrderForFirst = {16, 1, 12, 9, 6, 26, 8, 23, 19, 14, 13, 11, 16, 1, 18, 3, 27, 2, 9, 3, 2};
	
	/**
	 * the deck to be test
	 */
	private static Deck d;
	
	/**
	 * Test method for getKeyStreamValue()
	 */
	public void testGetKeystreamValue() {
		for (int i = 0; i < testDecks.length; i++) {
			d = new Deck(testDecks[i]);
			int j = 0;
			while (j < answersInOrderForFirst.length && i == 0) {
				System.out.println(i);
				assertEquals(d.getKeystreamValue(), answersInOrderForFirst[j++]);
			}
		}
	}

}
