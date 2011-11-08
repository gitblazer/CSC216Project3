package edu.ncsu.csc216.solitaire.model;

import java.util.LinkedList;

/**
 * The Deck of Cards
 * @author Andrew Kofink, William Blazer
 */
public class Deck {

	private LinkedList<Integer> deck;
	
	public Deck(int[] deck ) {
		// checks the int[] deck for the existance of 1-28 before
		// building it into linked list
		
		boolean valueFound = false;
		int j = 0;
		
		for (j = 1; j < 28; j++)
			valueFound = false;
			for (int i = 0; i < 27; i++) {
				if (j == deck[i]) {
					valueFound = true;
				}
			}
			if (valueFound == false) {
				throw new IllegalArgumentException("There deck is invalid, missing a number between 1 and 28");
			}
	}
	
	public int getKeySteamValue()  {
		
		
		return 0;
	}
}