package edu.ncsu.csc216.solitaire.model;

import edu.ncsu.csc216.solitaire.ui.UI;

/**
 * The message class
 * @author William Blazer, Andrew Kofink
 */
public class Message {
	
	/**
	 * the message array
	 */
	private int[] message;
	
	/**
	 * The message encryption method
	 * @param messageString the message to be encrypted
	 */
	public Message(String messageString) {
		//Replace all non-alphabetic characters with '' and spaces with '[' (The ASCII value of 'Z' + 1)
		char[] characterArray = messageString.toUpperCase().replaceAll("[^A-Z ]+" , "").replaceAll("[ ]" , "[").toCharArray();
		message = new int[characterArray.length];
		for (int i = 0; i < characterArray.length; i++) {
			message[i] = characterArray[i] - 'A' + 1;
		}
	}
	// the @ symbol is value 64, right before 'A' value of 65, check boundary down here
	// the characters for ' ' spaces are one more than they should be. I.E , a 'X' is being returned when it should be a 'W' for spaces
	
	/**
	 * The encryption method
	 * @param deck the deck to be processed
	 * @return the encrypted character
	 */
	public String encrypt(Deck deck) {
		char[] characterArray = new char[message.length];
		for (int i = 0; i < message.length; i++) {
			int keystream = deck.getKeystreamValue();
			if (keystream + message[i] > Deck.DECK_SIZE - 1) {
				keystream -= (Deck.DECK_SIZE - 1);
			}
			message[i] = message[i] + keystream;
			characterArray[i] = (char)(message[i] + 'A' - 1);
		}
		return String.copyValueOf(characterArray).replaceAll("\\[", " ");
	}
	
	public void encryptStepOne() {
		
	}
	
	public void encryptStepTwo() {
		
	}
	
	public void encryptStepThree() {
		
	}
	
	public void encryptStepFour() {
		
	}
	
	public void encryptStepFive() {
		
	}

	/**
	 * The decryption Method
	 * @param deck the deck to be processed 
	 * @return a decrypted character
	 */
	public String decrypt(Deck deck) {
		char[] characterArray = new char[message.length];
		for (int i = 0; i < message.length; i++) {
			message[i] = (message[i] - deck.getKeystreamValue());
			if (message[i] <= 0) {
				message[i] += Deck.DECK_SIZE - 1;
			}
			characterArray[i] = (char)(message[i] + 'A' - 1);
		}
		return String.copyValueOf(characterArray).replaceAll("\\[", " ");
	}
	
	public String getMessage() {
		return String.copyValueOf(translate(message));
	}
	
	private char[] translate(int[] intArr) {
		char[] characterArray = new char[intArr.length];
		for (int i = 0; i < intArr.length; i++) {
			characterArray[i] = (char)(message[i] + 'A' - 1);
		}
		return characterArray;
	}
}
