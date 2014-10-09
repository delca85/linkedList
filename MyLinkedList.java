package myLinkedList;

public class MyLinkedList {
	private MyNode head;
	private MyNode tail;
	
	public MyLinkedList () {
		this.head = null;
		this.tail = null;		
	}
	
	public boolean empty() {
		return this.head == null;
	}
	
	public MyNode getHead() {
		return this.head;
	}
	
	public MyNode getTail() {
		return this.tail;
	}
	
	public void addNode(MyNode node) {
		if (this.empty()) 
			this.head = this.tail = node;
		else {
			this.tail.prev = node;
			node.next = this.tail;
			this.tail = node;
		}
	}
	
	public void addNode(int v) {
		this.addNode(new MyNode(v));
	}
	
	public void printList() {
		MyNode n = this.tail;
		while (n != null) {
			n.printNode();
			if (n.getNext() != null)
				System.out.print(" -> ");
			n = n.getNext();
		}
	}
	public static void main(String [] args) {
		MyLinkedList l = new MyLinkedList();
		for (int i = 0; i < 10; i++ )
			l.addNode(i);
		l.printList();
	}
}
