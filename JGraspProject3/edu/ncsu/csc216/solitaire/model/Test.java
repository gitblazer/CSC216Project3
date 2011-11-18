package edu.ncsu.csc216.solitaire.model;

public class Test {
	public static void main(String[] args) {
		int[] intArr = {4,6,8,10,12,14,16};
		
		DeckLinkedList dll1 = new DeckLinkedList();
		DeckLinkedList dll2 = new DeckLinkedList();
		
		//dll1.add(intArr);
		dll2.add(intArr);
		
		dll1.concat(dll2);
	}
}