package edu.ncsu.csc216.solitaire.model;

public class Test {
	public static void main(String[] args) {
		int[] deckInts = {27, 1, 4, 7, 10, 13, 16, 19, 22, 25, 3, 6, 9, 12, 15, 18, 21, 24, 2, 5, 8, 11, 14, 17, 20, 28, 23, 26};
		Deck d = new Deck(deckInts);
		System.out.println(d.getKeystreamValue());
	}
}