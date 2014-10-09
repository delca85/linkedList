package myLinkedList;
public class MyNode implements Comparable<MyNode> {
	MyNode prev, next;
	int value; 
	
	//costruttori
	public MyNode(int v) {
		this(null, null, v);
	}
	
	public MyNode(MyNode prev, MyNode next, int v) {
		this.prev = prev;
		this.next = next;
		this.value = v;
	}

	//metodi
	public MyNode getPrev() {
		return this.prev;
	}
	
	public MyNode getNext() {
		return this.next;
	}
	
	public void setHead() {
		this.prev = null;
	}
	
	public void setTail() {
		this.next = null;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int v) {
		this.value = v;
	}

	@Override
	public int compareTo(MyNode arg0) {
		if ( this.value < arg0.value)
			return -1;
		else if ( this.value == arg0.value )
			return 0;
		else 
			return -1;
	}
	
	public boolean equals(MyNode arg0) {
		return this.value == arg0.value ;
	}
	
	public void printNode() {
		System.out.print(this.value);
	}
}


