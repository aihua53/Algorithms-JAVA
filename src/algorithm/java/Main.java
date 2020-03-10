package algorithm.java;

import java.util.*;

public class Main{
	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		
		sll.insert(l1, node2, 2);
		sll.insert(l1, node4, 3);
		
		sll.insert(l2, node3, 2);
		sll.insert(l2, node4, 3);

		SinglyLinkedList.printList(l1);
		System.out.println("***");
		SinglyLinkedList.printList(l2);
		System.out.println("***");
		
		ListNode l = sll.mergeTwoLists(l1, l2);
		SinglyLinkedList.printList(l);

	}
}