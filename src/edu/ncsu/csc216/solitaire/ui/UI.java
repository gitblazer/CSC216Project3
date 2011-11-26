package edu.ncsu.csc216.solitaire.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import java.util.zip.DataFormatException;

import javax.swing.*;

import edu.ncsu.csc216.solitaire.model.*;

/**
 * The userInterface
 * @author Andrew Kofink, William Blazer
 */
public class UI {
	
	private static Deck deck;
	
	private static MessageFrame mf;
	
	private static DeckFrame df;
	
	/**
	 * @param args The input parameters to the program
	 */
	public static void main(String[] args) {
		userInterface();

		mf = new MessageFrame();
		mf.setVisible(true);
	}
	
	/**
	 * Interfaces with the user and accepts the input file
	 */
	public static void userInterface() {
		
		//Get the deck file from the user
		JFileChooser chooser = new JFileChooser(new File("."));
		int returnValue = chooser.showOpenDialog(null);
		
		try {
			if (returnValue == JFileChooser.APPROVE_OPTION && chooser.getSelectedFile().canRead()) {
				File f = chooser.getSelectedFile();
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
				
				deck = new Deck(deckInts);
			} else {
				throw new FileNotFoundException();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			userInterface();
		} catch (DataFormatException dfe) {
			System.out.println("Invalid file.");
			userInterface();
		}
	}
	
	public static Deck getDeck() {
		return deck;
	}
	
	public static MessageFrame messageFrame() {
		return mf;
	}
	
	public static DeckFrame deckFrame() {
		return df;
	}
	
	public static void setDeckFrame(DeckFrame df) {
		UI.df = df;
	}
}

class MessageFrame extends JFrame implements ActionListener {
	
	private JTextArea messageTextArea;
	
	private char encType;
	
	public MessageFrame() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel messagePanel = new JPanel();
		messagePanel.setLayout(new BorderLayout());
		add(messagePanel);
		
		JLabel messageTextLabel = new JLabel("Please enter a message.");
		messagePanel.add(messageTextLabel, BorderLayout.NORTH);
		
		messageTextArea = new JTextArea(5, 20);
		JScrollPane scrollPane = new JScrollPane(messageTextArea);
		messagePanel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout());
		messagePanel.add(buttons, BorderLayout.SOUTH);
		
		JButton encrypt = new JButton("Encrypt");
		encrypt.addActionListener(this);
		buttons.add(encrypt);
		
		JButton decrypt = new JButton("Decrypt");
		decrypt.addActionListener(this);
		buttons.add(decrypt);
		
		pack();
	}
	
	public void actionPerformed(ActionEvent ae) {
		Message m = new Message(messageTextArea.getText());
		setVisible(false);
		UI.setDeckFrame(new DeckFrame());
		UI.deckFrame().setVisible(true);
		
		if (ae.getActionCommand().toLowerCase().startsWith("e")) {
			encType = 'e';
		} else {
			encType = 'd';
		}
	}
	
	public String getMessageText() {
		return messageTextArea.getText();
	}
	
	public char getEncType() {
		return encType;
	}
}

class DeckFrame extends JFrame implements ActionListener {
	
	private static final int NUM_PANELS = 4;
	private JRadioButton stepByStepRadio;
	private JRadioButton letterByLetterRadio;
	private JRadioButton wholeMessageRadio;
	
	public DeckFrame() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create panels
		//Main Panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);
		
		//Card Panel
		JPanel cardPanel = new JPanel();
		cardPanel.setLayout(new GridLayout(NUM_PANELS, 1));
		mainPanel.add(cardPanel, BorderLayout.CENTER);
		
		//Control Panel
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(NUM_PANELS, 1));
		mainPanel.add(controlPanel, BorderLayout.EAST);
		
		//Message Panel
		JPanel messagePanel = new JPanel();
		messagePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		mainPanel.add(messagePanel, BorderLayout.NORTH);
		
		//Add components to panels
		//Card Panel
		JPanel panels[] = new JPanel[NUM_PANELS];
		
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
			panels[i].setLayout(new FlowLayout());
			cardPanel.add(panels[i]);
		}
		
		CardIcons.initIcons();
		ImageIcon icons[] = CardIcons.icons();
		
		for (int i = 0; i < panels.length; i++) {
			for (int j = i * icons.length / NUM_PANELS; j < (i + 1) * icons.length / NUM_PANELS; j++) {
				panels[i].add(new JLabel(icons[j]));
			}
		}
		
		//Control Panel
		ButtonGroup radioMenu = new ButtonGroup();
		
		stepByStepRadio = new JRadioButton("Step By Step");
		letterByLetterRadio = new JRadioButton("Letter By Letter");
		wholeMessageRadio = new JRadioButton("Whole Message");
		
		radioMenu.add(stepByStepRadio);
		radioMenu.add(letterByLetterRadio);
		radioMenu.add(wholeMessageRadio);

		JPanel runButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton runButton = new JButton("Run to Completion");
		runButtonPanel.add(runButton);
		
		controlPanel.add(stepByStepRadio);
		controlPanel.add(letterByLetterRadio);
		controlPanel.add(wholeMessageRadio);
		controlPanel.add(runButtonPanel);
		
		runButton.addActionListener(this);
		
		//Message Panel
		JLabel messageLabel = new JLabel(UI.messageFrame().getMessageText());
		messagePanel.add(messageLabel);
		
		pack();
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (stepByStepRadio.isEnabled()) {
			
		} else if (letterByLetterRadio.isEnabled()) {
			
		} else {
			
		}
	}
}
