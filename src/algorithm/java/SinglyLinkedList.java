package algorithm.java;

import algorithm.java.ListNode;;


public class SinglyLinkedList{


	public int listLength(ListNode head) {
		int l = 0;
		ListNode listNode = head;
		while(listNode != null) {
			l++;
			listNode = listNode.getNext();
		}
		return l;
	}

	public ListNode insert(ListNode head,ListNode node,int p) {
		ListNode currentHead = head;
		ListNode currentNode = head;
		if(p ==1) {
			currentHead = node;
			currentHead.setNext(head);
		}else {
			for(int i=1;i<p-1;i++) {
				currentNode = currentNode.getNext();
			}
			if(currentNode.getNext() == null) {
				currentNode.setNext(node);
				node.setNext(null);
			}else {
				node.setNext(currentNode.getNext());
				currentNode.setNext(node);
			}
		}
		return currentHead;
	}

	public ListNode delete(ListNode head,int p) {
		ListNode currentHead = head;
		ListNode currentNode = head;
		if(p == 1) {
			currentHead = head.getNext();
		}else {
			for(int i=1;i<p-1;i++) {
				currentNode = currentNode.getNext();
			}
			if(currentNode.getNext() == null) {
				currentNode.setNext(null);
			}else {
				currentNode.setNext(currentNode.getNext().getNext());
			}

		}
		return currentHead;
	}

	public void deleteAll(ListNode head) {
		ListNode currentNode, iterator = head;
		while(iterator !=null) {
			currentNode = iterator.getNext();
			iterator = null;
			iterator = currentNode;
		}
	}
	
}

