package datastructures.test;

import static org.junit.Assert.*;

import org.junit.Test;

import datastructures.MyLinkedList;

public class MyLinkedListTest {

	@Test
	public void testMyLinkedListCreation() {
		MyLinkedList<Object> ll = new MyLinkedList<>();
		assertNotNull("Test MyLinkedList Existence", ll);
	}
	
	@Test
	public void testAddIncrementsCounter() {
		//MyLinkedList<Object> ll = new MyLinkedList<>();
		//ll.insertFirst(new Object());
		//assertEquals("adding an object to a new linked list gives a length of 1",
		//		1, ll.length());
	}

}
