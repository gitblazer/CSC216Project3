package edu.ncsu.csc216.solitaire.model;

import junit.framework.TestCase;

public class DeckLinkedListTest extends TestCase {

	/**
	 * A list to run tests on
	 */
	private DeckLinkedList testList;
	
	/**
	 * sets up the tests for DeckLinkedList
	 */
	protected void setUp() throws Exception {
		super.setUp();
		testList = new DeckLinkedList();
	}

	public void testAdd() {
		testList.add(5);
		assertEquals(testList.get(0),5);
		testList.add(10);
		assertEquals(testList.get(1),10);
		testList.add(15);
		assertEquals(testList.get(2),15);
	}

	public void testAddFirst() {
		testList.addFirst(25);
		assertEquals(testList.get(0), 25);
		testList.addFirst(2);
		assertEquals(testList.get(0), 2);
		testList.addFirst(5);
		assertEquals(testList.get(0), 5);
	}

	public void testClear() {
		int[] intArr = {4,2,3,5,7};
		testList.add(intArr);
		assertEquals(testList.get(3), 5);
		testList.clear();
		testList.add(14);
		assertEquals(testList.get(0), 14);
	}

	public void testConcat() {
		fail("Not yet implemented");
	}

	public void testDetachAt() {
		fail("Not yet implemented");
	}

	public void testExchange() {
		fail("Not yet implemented");
	}

	public void testGet() {
		fail("Not yet implemented");
	}

	public void testIndexOf() {
		fail("Not yet implemented");
	}

	public void testRemove() {
		fail("Not yet implemented");
	}

	public void testSet() {
		fail("Not yet implemented");
	}

	public void testAddLast() {
		fail("Not yet implemented");
	}

	public void testRemoveLast() {
		fail("Not yet implemented");
	}

}
