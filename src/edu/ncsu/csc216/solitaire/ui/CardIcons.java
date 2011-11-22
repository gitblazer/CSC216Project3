package edu.ncsu.csc216.solitaire.ui;

import java.io.File;

import javax.swing.*;

import edu.ncsu.csc216.solitaire.model.Deck;

public class CardIcons {
	
	/**
	 * The icons of the deck
	 */
	private static ImageIcon[] icons;
	
	/**
	 * The panels of the cards
	 */
	private static JPanel[] cardPanels;
	
	/**
	 * Parses the images and populates the
	 * CardIcons variable
	 */
	public static void initIcons() {
		File cardDir = new File("cards");
		String[] cardFilenames = cardDir.list();
		icons = new ImageIcon[cardFilenames.length];
		cardPanels = new JPanel[cardFilenames.length];
		for (int i = 0; i < cardFilenames.length; i++) {
			icons[i] = new ImageIcon("cards/" + cardFilenames[i]);
			cardPanels[i] = new JPanel();
			cardPanels[i].add(new JLabel(icons[i]));
		}
	}
	
	public static JPanel[] cardPanels() {
		return cardPanels;
	}
	
	/**
	 * Displays the deck of CardIcons
	 * @param d The deck to display
	 */
	public static void displayDeck(Deck d) {
		for (int i = 0; i < icons.length; i++) {
			
		}
	}
}
