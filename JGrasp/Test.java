import edu.ncsu.csc216.solitaire.model.Deck;


public class Test {
	public static void main(String[] args) {
		int[] testDeck = {8, 16, 23, 21, 24, 19, 3, 4, 1, 7, 14, 6, 17, 22, 5, 2, 11, 9, 18, 28, 12, 15, 10, 20, 13, 25, 26, 27};
		Deck d = new Deck(testDeck);
		for(int i = 0; i < 100; i++) {
			d.getKeystreamValue();
		}
	}
}
