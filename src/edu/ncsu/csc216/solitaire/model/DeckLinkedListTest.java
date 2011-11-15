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
		int[] intArr1 = {4,2,3,5,7};
		int[] intArr2 = {9,15,24,38};
		
		DeckLinkedList dll1 = new DeckLinkedList();
		DeckLinkedList dll2 = new DeckLinkedList();
		
		dll1.add(intArr1);
		dll2.add(intArr2);
		
		dll1.concat(dll2);
		
		assertEquals(dll1.get(0), 4);
		assertEquals(dll1.get(4), 7);
		assertEquals(dll1.get(5), 9);
		assertEquals(dll1.get(8), 38);
		assertEquals(dll1.get(9), 4);
		assertEquals(dll1.get(-1), 38);
		System.out.println(dll1.get(18));
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
