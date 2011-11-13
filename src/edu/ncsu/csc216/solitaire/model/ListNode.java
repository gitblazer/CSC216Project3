package edu.ncsu.csc216.solitaire.model;

/**
 * A list node contained in a linked list
 * @author William Blazer, Andrew Kofink
 */
public class ListNode {

	/**
	 * The data contained in this node
	 */
	int data;
	
	/**
	 * The following node
	 */
	ListNode next;
	
	/**
	 * The previous node
	 */
	ListNode previous;
	
	/**
	 * A node in a LinkedList
	 */
	public ListNode() {
		this(-1);
	}
	
	/**
	 * A node in a LinkedList
	 * @param data The data held in the node
	 */
	public ListNode(int data) {
		this(data, null);
	}
	
	/**
	 * A node in a LinkedList
	 * @param data The data held in the node
	 * @param next The following node
	 */
	public ListNode(int data, ListNode next) {
		this(data, next, null);
	}
	
	/**
	 * A node in a LinkedList
	 * @param data The data held in the node
	 * @param next The following node
	 * @param previous The previous node
	 */
	public ListNode(int data, ListNode next, ListNode previous) {
		this.data = data;
		this.next = next;
		this.previous = previous;
	}
}
