package LinkedLists;

public class MyLinkedList<E> {
	
	Node<E> head;
	void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	void print() {
		Node<E> temp = head;
		while(temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	boolean isEmpty() {
		if(head == null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	static class Node<E>{
		E data;
		Node next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

}
