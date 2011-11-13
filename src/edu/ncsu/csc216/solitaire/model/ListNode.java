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
	 * A node in a LinkedList
	 */
	public ListNode() {
		this(0);
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
		this.data = data;
		this.next = next;
	}
}
