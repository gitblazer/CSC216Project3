package edu.ncsu.csc216.solitaire.ui;

import javax.swing.*;

import edu.ncsu.csc216.solitaire.model.Deck;
import edu.ncsu.csc216.solitaire.model.DeckLinkedList;

public class CardIcons {
	
	/**
	 * The icons of the deck
	 */
	private static ImageIcon[] icons;
	
	/**
	 * Parses the images and populates the
	 * CardIcons variable
	 */
	public static void initIcons() {
		Deck d = UI.getDeck();
		icons = new ImageIcon[d.deck().size()];
		displayDeck(d);
	}
	
	public static ImageIcon[] icons() {
		return icons;
	}
	
	/**
	 * Displays the deck of CardIcons
	 * @param d The deck to display
	 */
	public static void displayDeck(Deck d) {
		DeckLinkedList cards = d.deck();
		for (int i = 0; i < icons.length; i++) {
			icons[i] = new ImageIcon("cards/" + cards.get(i) + ".gif");
		}
	}
}
