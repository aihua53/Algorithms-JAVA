package algorithm.java;

public class DLLNode {
	private int data;
	DLLNode next;
	DLLNode previous;
	
	public DLLNode(int data) {
		this.data = data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public void setNext(DLLNode node) {
		next = node;
	}
	
	public DLLNode getNext() {
		return next;
	}
	
	public void setPrevious(DLLNode node) {
		previous = node;
	}
	
	public DLLNode getPrevious() {
		return previous;
	}

}
