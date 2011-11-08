package edu.ncsu.csc216.solitaire.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.ncsu.csc216.solitaire.model.Message;


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
			int[] messageInts = new int[28];
			for (int i = 0; i < messageInts.length; i++) {
				messageInts[i] = in.nextInt();
			}
			Deck deck = new Deck(messageInts);
			
			String messageString = in.nextLine();
			//Message messageObject = new Message(messageString);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		}
	}

}
