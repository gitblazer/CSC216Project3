package edu.ncsu.csc216.solitaire.model;

import junit.framework.TestCase;

public class ListNodeTest extends TestCase {

	public void testListNodeIntListNode() {
		ListNode testNode = new ListNode();
		assertEquals(testNode.next, null);
	}

}
