package linkedLists;



public class MyLinkedList<E> {
	
	Node<E> head;
	
	public void add (E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp != null) {
			temp = temp.next;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public E removeLast() throws Exception{
		Node<E> temp = head;
		
		if(temp == null)
		{
			throw new Exception("Cannot remove last element from an empty ");
		}
		if(temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return (E)toRemove.data;
		}
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node toRemove = temp.next;
		temp.next = null;
		return (E) toRemove.data;
	}
	
	public E getLast() throws Exception{
		
Node<E> temp = head;
		
		if(temp == null)
		{
			throw new Exception("Cannot peek last element from an empty ");
		}
	
		
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
		
	}
	
	public static class Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

}
