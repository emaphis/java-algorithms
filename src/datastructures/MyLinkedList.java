package datastructures;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {
	private Node first = null;
	
	/**
	 * 
	 * @return first element
	 */
	public E getFirst() {
		if (first == null) {
			throw new NoSuchElementException(" empty list ");
		}
		return first.elem;
	}
	
	
	public void insertFirst(E elem) {
		Node newNode = new Node(elem);
		newNode.next = first;
		first = newNode;
	}
	
	public void insertAfter(E elem, E newElem) {
		Node newNode = new Node(newElem);
		
		Node node = first;
		while (node.next != null && node.elem != elem) {
			node = node.next;
		}
		Node tempNode = node.next;
		node.next = newNode;
		newNode.next = tempNode;
	}
	
	public E removeFirst() {
		if (first == null) {
			throw new NoSuchElementException(" empty list ");
		}
		E elem = first.elem;
		first = first.next;
		
		return elem;
	}
	
	
	
	@Override
	public String toString() {
		String out = "";
		
		while (first !=null) {
			out += first.elem + " => ";
			first = first.next;
		}
		out += "null";
		
		return out;
	}
	
	private class Node {
		public Node(E element) { elem = element; }
		
		E elem = null;
		Node next;
	}


	public static void main(String[] args) {
		MyLinkedList<String> il = new MyLinkedList<>();
		il.insertFirst("Tail");
		il.insertFirst("Body3");
		il.insertFirst("Body2");
		il.insertFirst("Body0");
		il.insertFirst("Head");
		
		System.out.println("My list: " + il);
		
		il.insertAfter("Body0", "Body1");
		
		System.out.println("Now: " + il);
		
		//while (il.first != null) {
		//	System.out.print(il.first.elem + " => ");
		//	il.first = il.first.next;
		//}
		
	}

}
