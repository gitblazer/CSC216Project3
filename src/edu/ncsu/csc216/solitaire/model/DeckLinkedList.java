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
	 * The last node of the list
	 */
	private ListNode last;
	
	/**
	 * The LinkedList for the Deck of cards
	 */
	public DeckLinkedList() {
		front = null;
		last = null;
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
			last = current;
		} else {
			add(value, current.next);
		}
	}
	
	/**
	 * Adds a value to the front of the linked list
	 * @param value The value to be added
	 */
	public void addFirst(int value) {
		ListNode temp = new ListNode(value, front.next);
		front.next = temp;
	}
	
	/**
	 * Clears the linked list
	 */
	public void clear() {
		front = null;
		last = null;
	}
	
	/**
	 * @param list The list to concatenate
	 */
	public void concat(DeckLinkedList list) {
		last.next = list.front;
	}
	
	/**
	 * Detaches a deck linked list at a certain index of the current
	 * deck linked list.
	 * @param index The index where the list will be detached
	 * @return The detached deck linked list
	 */
	public DeckLinkedList detachAt(int index) {
		DeckLinkedList detatchedList = new DeckLinkedList();
		ListNode nodeBeforeSplit = findNode(index - 1, front);
		detatchedList.front = nodeBeforeSplit.next;
		nodeBeforeSplit.next = null;
		return detatchedList;
	}
	
	/**
	 * Helper method to return the node at an index
	 * @param index The index to return the node at
	 * @param current The current node in the recursion
	 * @return The list node in question
	 */
	private ListNode findNode(int index, ListNode current) {
		if (index == 0) {
			return current;
		} else {
			return findNode(index - 1, current.next);
		}
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
