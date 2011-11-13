package edu.ncsu.csc216.solitaire.model;

/**
 * The LinkedList for the Deck of cards
 * @author William Blazer, Andrew Kofink
 */
public class DeckLinkedList {
	
	/**
	 * The front node of the list
	 */
	private ListNode front;
	
	/**
	 * The LinkedList for the Deck of cards
	 */
	public DeckLinkedList() {
		front = null;
	}
	
	/**
	 * Adds a value to the end of the LinkedList
	 * @param value The value to add
	 */
	public void add(int value) {
		add(value, front);
	}
	
	/**
	 * A helper method for add(int value)
	 * @param value The value to be added
	 * @param index The current parsed index
	 */
	private void add(int value, ListNode current) {
		if (current == null) {
			current = new ListNode(0);
		} else {
			add(value, current.next);
		}
	}
	
	/**
	 * @param value
	 */
	public void addFirst(int value) {
		
	}
	
	/**
	 * 
	 */
	public void clear() {
		
	}
	
	/**
	 * @param list
	 */
	public void concat(DeckLinkedList list) {
		
	}
	
	/**
	 * @param index
	 * @return
	 */
	public DeckLinkedList detachAt(int index) {
		
		return null;
	}
	
	/**
	 * @param index1
	 * @param index2
	 */
	public void exchange(int index1, int index2) {
		
	}
	
	/**
	 * @param index
	 * @return
	 */
	public int get(int index) {
		
		return -1;
	}
	
	/**
	 * @param value
	 * @return
	 */
	public int indexOf(int value) {
		
		return -1;
	}
	
	/**
	 * @param index
	 * @return
	 */
	public int remove(int index) {
		
		return -1;
	}
	
	/**
	 * @param index
	 * @param value
	 */
	public void set(int index, int value) {
		
	}
	
	/**
	 * @param value
	 */
	public void addLast(int value) {
		
	}
	
	/**
	 * 
	 */
	public void removeLast() {
		
	}
}
