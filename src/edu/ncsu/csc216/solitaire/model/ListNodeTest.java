package edu.ncsu.csc216.solitaire.model;

import junit.framework.TestCase;

/**
 * Tests the ListNode class
 * @author William Blazer, Andrew Kofink
 */
public class ListNodeTest extends TestCase {

	/**
	 * Tests the node object
	 */
	public void testListNodeIntListNode() {
		ListNode testNode = new ListNode();
		assertEquals(testNode.next, null);
		testNode = new ListNode(5);
		assertEquals(testNode.data, 5);
		ListNode testNode2 = new ListNode(5, null);
		testNode = new ListNode(5, testNode2);
		assertEquals(testNode.next, testNode2);
	}

}
