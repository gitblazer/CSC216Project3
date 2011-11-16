package edu.ncsu.csc216.solitaire.model;

public class Test {
	public static void main(String[] args) {
		//int[] intArr = {4,6,8,10,12,14,16};
		
		DeckLinkedList dll = new DeckLinkedList();
		
		//dll.add(intArr);

		dll.add(16);
		dll.addFirst(14);
		dll.addFirst(12);
		dll.addFirst(10);
		dll.addFirst(8);
		dll.addFirst(6);
		dll.addFirst(4);
	}
}