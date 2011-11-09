package edu.ncsu.csc216.solitaire.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

import edu.ncsu.csc216.solitaire.model.*;


/**
 * The userInterface
 * @author Andrew Kofink, William Blazer
 */
public class UI {

	/**
	 * @param args The input parameters to the program
	 */
	public static void main(String[] args) {
		UserInterface();
	}
	
	/**
	 * Interfaces with the user and accepts the input file
	 */
	public static void UserInterface() {
		try {
			Scanner console = new Scanner(System.in);
			System.out.println("Please enter a filename to use:");
			String filename = console.nextLine();
			File f = new File(filename);
			Scanner in = new Scanner(f);
			
			//Look for proper file format
			String deckString = "";
			while (in.hasNextLine()) {
				deckString += in.nextLine();
			}
			
			//Match this regular expression, or the file format is wrong
			if (!deckString.matches("\\A(\\d+[ ]){27}\\d+\\z")) {
				throw new DataFormatException();
			}

			//Gather file contents into an array of integers
			in = new Scanner(f);
			int[] deckInts = new int[28];
			for (int i = 0; i < deckInts.length; i++) {
				deckInts[i] = in.nextInt();
			}
			
			Deck deck = new Deck(deckInts);
			
			String messageString = "";
			while (!messageString.matches("^\n$")) {
				System.out.println("Encrypt or Decrypt?");
				String response = console.nextLine();
				System.out.println("Message:");
				messageString = console.nextLine() + "\n";
				Message message = new Message(messageString);
				
				if (response.toLowerCase().startsWith("e")) {
					message.encrypt(deck);
				} else if (response.toLowerCase().startsWith("d")) {
					message.decrypt(deck);
				}
			}
			System.out.println("Done.");
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			UserInterface();
		} catch (DataFormatException dfe) {
			System.out.println("Invalid file.");
			UserInterface();
		}
	}
}
