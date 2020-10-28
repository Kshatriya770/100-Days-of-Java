package LinkedLists;

public class MyLinkedList {
	
	Node head;
	void add(int data) {
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	void print() {
		Node temp = head;
		while(temp.next != null) {
			System.out.println(temp.data + " ");
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
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

}
