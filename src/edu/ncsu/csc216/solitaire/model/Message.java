package edu.ncsu.csc216.solitaire.model;

public class Message {

	public Message(String messageString) {
		
	}

	public String encrypt(Deck deck) {
		System.out.println("Encrypting...");
		return "ENCRYPTED MESSAGE";
	}

	public String decrypt(Deck deck) {
		System.out.println("Decrypting...");
		return "DECRYPTED MESSAGE";
	}

}
